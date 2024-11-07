/**
 * 
 */
package com.javaex.oop.point.v2;

//	v2
class Point {
//	필드
	private int x;
	private int y;
	
//	기본 생성자
	public Point() {}
	
	public Point(int x, int y) {
//		초기화
		this.x = x;
		this.y = y;
	}
	
//	Getter / Setter
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
//	메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n" , x , y);
	}
}

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 7.
 */
public class PointApp {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 7.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		p1.draw();
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		p2.draw();
	}

}
