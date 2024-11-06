/**
 * 
 */
package com.javaex.practice;

import java.util.Arrays;
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
//		Practice03();
		Practice04();

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
	
	private static void Practice04() {
//		Ex07 키보드에서 정수로 된 돈의 액수를 입력 받아 50000원권, 10000원권, 5000원권, 1000원권, 500원
//		동전, 100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.)
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int sum = sc.nextInt();
		
		
		
		for(int i = 0; i < wonArray.length; ++i) {
			
			// 합계
			int sumWon = sum += wonArray[i];			
			System.out.println(sumWon);
			
			System.out.println(wonArray[i] + "원:" + "개");
			
		}
		
	}
	
}
