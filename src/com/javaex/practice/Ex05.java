/**
 * 
 */
package com.javaex.practice;

import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 5.
 */
public class Ex05 {

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
//		Ex05 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		int num ;
		int sum = 0 ;
		double avg = 0;
		
		for(int i = 0; i < 5; i++) {
			num = sc.nextInt();
			sum += num;
		}
		
		avg = sum/5d;		
		System.out.println("평균은 " + avg + " 입니다.");
		
	}
}
