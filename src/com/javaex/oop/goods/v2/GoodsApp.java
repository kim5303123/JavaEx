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
	private String name; 
	private int price;

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
		
		
		camera.name = "Nikon";
		camera.price = 400_000;
		
		System.out.printf("%s - > %,d%n", camera.name, camera.price);
		
		note.name = "LG그램";
		note.price = 900_000;
		
		System.out.printf("%s - > %,d%n", note.name, note.price);
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.printf("%s - > %,d%n", cup.name, cup.price);
		
		
	}
	
}
