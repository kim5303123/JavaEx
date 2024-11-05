/**
 * 
 */
package com.javaex.practice;

import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 4.
 */
public class Ex08 {

//	Practice02
//	사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
//	프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)
	
//	Practice03
//	아래와 같이 구구단을 출력하세요
	
	
	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 4.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		Practice02();
//		Practice03();
	}
	
	private static void Practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키: ");
		int height = sc.nextInt();
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		int bmi = height / weight; 
		
//		18.5 <= BMI <= 24.9
		if(bmi >=18.5 && bmi <=24.9) {
			System.out.println(bmi);
			System.out.println("정상");
		} else if(bmi <=18.5 && bmi >=24.9) {
			System.out.println(bmi);
			System.out.println("저체중");
		} else {
			System.out.println(bmi);
			System.out.println("비만");
		}
		 
	}
		
	
}
