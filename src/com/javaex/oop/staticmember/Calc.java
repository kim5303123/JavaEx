/**
 * 
 */
package com.javaex.oop.staticmember;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 8.
 */

//생성하지 않고도 사용할 수 있는 정적 클래스
public class Calc {
//	static final 상수
	public static final double PI = 3.14159f;
		
//	가변 인자는 배열로 들어옴
	public static double getSum(double ... values) {
		
		double total = 0;
		for (double value : values) {
			total += value;
		}
		
		return total;
	}
	
}
