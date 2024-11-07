/**
 * 
 */
package com.javaex.oop.goods.v3;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 7.
 */
//	Goods v3.	생성자
//	생성자가 만들어져 있지 않으면 JVM이 기본생성자를 끼워 넣는다.
//	개발자가 생성자를 만들면 JVM은 기본생성자를 끼워넣지 않는다.
//	Setter가 없으면 Read-Only
class Goods {
//	필드
	private String name; 
	private int price;
	
//	생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
//	Getters	/ Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
//		this -> 현재 인스턴스 자체
		this.name = name;
	}
	
	public int getPrice() {
	 	return price;
	}
	
//	public void setPrice(int price) {
////		this -> 현재 인스턴스 자체
//		this.price = price;
//	}
	
//	일반 메서드
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.printf("가격: %,d원%n", price);
	}
}


//	Goods	테스트	클래스
public class GoodsApp {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 7.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		생성자 호출	->	인스턴스 생성	->	camera로 참조
//		Goods camera = new Goods();
//		Goods note = new Goods();
//		Goods cup = new Goods();
		
		
//		camera.setName("Nikon"); 
//		camera.setPrice(400_000);
		
		Goods camera = new Goods("Nikon", 400_000);		
		camera.showInfo();
		
//		note.setName("LG그램");
//		note.setPrice(900_000);
		
		Goods note = new Goods("LG그램", 900_000);
//		note.setPrice(1_000);
		note.showInfo();
		
//		cup.setName("머그컵");
//		cup.setPrice(2_000);
		
		Goods cup = new Goods("머그컵", 2_000);
		cup.showInfo();
		
		
	}
	
}
