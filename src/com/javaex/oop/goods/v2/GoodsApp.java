/**
 * 
 */
package com.javaex.oop.goods.v2;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 6.
 */
//	Goods v2.	접근제한자
class Goods {
//	필드 선언	->	private
//	정보는 은닉하고, Getter와 Setter를 통한 우회 접근이 필요
	private String name; 
	private int price;
	
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
	
	public void setPrice(int price) {
//		this -> 현재 인스턴스 자체
		this.price = price;
	}
}


//	Goods	테스트	클래스
public class GoodsApp {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 6.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		생성자 호출	->	인스턴스 생성	->	camera로 참조
		Goods camera = new Goods();
		Goods note = new Goods();
		Goods cup = new Goods();
		
		
//		camera.name = "Nikon";
//		camera.price = 400_000;
		camera.setName("Nikon"); 
		camera.setPrice(400_000);
		
		System.out.printf("%s - > %,d%n", camera.getName(), camera.getPrice());
		
		note.setName("LG그램");
		note.setPrice(900_000);
		
		System.out.printf("%s - > %,d%n", note.getName(), note.getPrice());
		
		cup.setName("머그컵");
		cup.setPrice(2_000);
		
		System.out.printf("%s - > %,d%n", cup.getName(), cup.getPrice());
		
		
	}
	
}
