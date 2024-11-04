/**
 * 
 */
package com.javaex.practice;

import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 4.
 */
public class Ex07 {
//	Practice02
//	나이를 입력 받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
	
//	조건 출력내용
//	0세~7세 취학전아동/무료 입니다.
//	8세~13세 초등학생/2000원 입니다.
//	14세~16세 중학생/3000원 입니다.
//	17세~19세 고등학생/4000원 입니다.
//	20세~ 성인/5000원 입니다.

	
//	Practice03
//	숫자를 입력 받아 아래와 같이 출력하세요
	
	
	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 4.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		Practice02();
		Practice03();

	}
	
	private static void Practice02() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		switch (age) {
		case 0,1,2,3,4,5,6,7 : {			
			System.out.println("취학전아동/무료입니다.");
			break;
		}
		case 8,9,10,11,12,13 : {			
			System.out.println("초등학생/2000원입니다.");
			break;
		}
		case 14,15,16 : {			
			System.out.println("중학생/3000원입니다.");
			break;
		}
		case 17,18,19 : {			
			System.out.println("고등학생/4000원입니다.");
			break;
		}
		default:
			System.out.println("성인/5000원입니다.");
			break;
		}
	}
	
	private static void Practice03() {
		Scanner sc = new Scanner(System.in);
	}
}
