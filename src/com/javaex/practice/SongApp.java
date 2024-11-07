/**
 * 
 */
package com.javaex.practice;


class Song {
	
	 private String title;
	 private String artist;
	 private String album;
	 private String composer;
	 private int year;
	 private String track;
	 
		
//		Getter / Setter
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getArtist() {
			return artist;
		}
		
		public void setArtist(String artist) {
			this.artist = artist;
		}
		
		public String getAlbum() {
			return album;
		}
		
		public void setAlbum(String album) {
			this.album = album;
		}
		
		public String getComposer() {
			return composer;
		}
		
		public void setComposer(String composer) {
			this.composer = composer;
		}
		
		public int getYear() {
			return year;
		}
		
		public void setYear(int year) {
			this.year = year;
		}
		
		public String getTrack() {
			return track;
		}
		
		public void setTrack(String track) {
			this.track = track;
		}
	 
		public void showInfo() {
			System.out.printf("%s, %s (%s, %d, %s, %s)%n", artist, title, album, year, track, composer);
								
		}
		
}


/**
 * @Author : 202-12
 * @Date   : 2024. 11. 7.
 */
public class SongApp {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 7.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {

		Song s1 = new Song();
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setYear(2010);
		s1.setTrack("3번 track");
		s1.setComposer("이민수 작곡");
		s1.showInfo();
		
		Song s2 = new Song();
		s2.setTitle("거짓말");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Alwyas");
		s2.setYear(2007);
		s2.setTrack("2번 track");
		s2.setComposer("G-DRAGON 작곡");
		s2.showInfo();
		
		Song s3 = new Song();
		s3.setTitle("벚꽃엔딩");
		s3.setArtist("버스커버스커");
		s3.setAlbum("버스커버스커1집");
		s3.setYear(2012);
		s3.setTrack("4번 track");
		s3.setComposer("장범준 작곡");
		s3.showInfo();
		
	}
	
}
