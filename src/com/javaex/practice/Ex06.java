/**
 * 
 */
package com.javaex.practice;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 4.
 */
public class Ex06 {

//	Practice02
//	나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을
//	작성하세요
	
//	Practice03
//	1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 4.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		Practice02();
//		Practice03();
		Practice04();
			
	}

	private static void Practice02() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");	
		System.out.print("나이 : ");
		int age = scanner.nextInt();		
		
		if(age >= 19 && age <65) {
			System.out.println("1번그룹 입니다.");
		} else {			
			System.out.println("2번그룹 입니다.");
		}
		
		
		
		
	}
	
	private static void Practice03() {
	
//		1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요
		
		for(int i = 1; i < 101 ; ++i) {
			
			if(i % 5 ==0 && i % 7 ==0) continue; 
			System.out.println(i);
		}
		
		
	}
	
	
	private static void Practice04() {
//		 Ex06 주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(c).replace(" , ", "")); 
		
	}
	
}
