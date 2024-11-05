/**
 * 
 */
package com.javaex.practice;

import java.util.Arrays;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 5.
 */
public class Ex02 {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 5.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		Practice04();
	}

	private static void Practice04() {
//		Ex02 double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문
//		을 작성하세요
		
		double two[] = { 1.2, 3.3 ,6.7 };
		
		double tww[] = new double[3];
		
		for(int i = 0; i < two.length; ++i) {
//		for(int i = two.length - 1;  ) {
			
			System.out.println(two[i]);
		}
//		}		
		
		
	}
}
