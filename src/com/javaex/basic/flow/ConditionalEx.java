/**
 * 
 */
package com.javaex.basic.flow;

import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 4.
 */
public class ConditionalEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 4.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		 
		ifEx();
	}
	
	
	private static void ifEx() {
		Scanner scanner = new Scanner(System.in);
		
		
//		점수 입력 받아서 60점 이상이면 합격입니다.	
		
		System.out.println("점수를 입력해주세요");
		int score = scanner.nextInt();
		
//		if ~ else ~
		if(score >= 60)  {	// 조건 만족시
			System.out.println("합격입니다.");
		}else {// 조건 불만족시
			System.out.println("불합격입니다");
		}
		
		scanner.close();
	}		
}
