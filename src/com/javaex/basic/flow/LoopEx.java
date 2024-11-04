/**
 * 
 */
package com.javaex.basic.flow;

import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 4.
 */
public class LoopEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 4.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		whileEx(); 
//		whileGugu();
//		doWhileEx();
		forGugu();
	}

	private static void whileEx() {
//		while (condition) { }
//		condition이 참인 동안 블럭을 반복수행한다.
		
		int i = 0;	//	반복 제어 변수
		
		while(i < 5) {
			System.out.println("I LIKE JAVA"+i);
//			주의 : 반복 제어변수를 절 조정해야한다. (false 처리)
			i += 1;  // = (i = i +1);
		}
		
	}
	
	private static void whileGugu() {
		 
		 Scanner sc = new Scanner(System.in);
		 		 
		 int dan;
		 int i = 1;
		 //메세지출력, dan값 입력		 
		 
		 System.out.println("단을 입력해 주세요");
		 System.out.print("단 : ");
		 dan = sc.nextInt();
		 while(i < 10){			 
			 System.out.println( dan + "*" + i + "=" + (dan*i));
			 i += 1 ;
			 
		 }		 
		sc.close();
		 
	}
		 
	private static void doWhileEx() {
//		입력받은 정수를 다 더한다.
//		입력 받은 정수가 0이면 반복하지 않는다.
		
		int total = 0;	//	합산 변수	
		int value = 0;	//	더해주는 수, 반복제어 변수
		
		
		System.out.println("숫자입력[ 0 to quit ] >");		
		Scanner scanner = new Scanner(System.in);
		
//		최소 1번 실행		
		do {	
			value = scanner.nextInt();
			total += value;
			if( value != 0) {
			System.out.println("합계 :" + total);
			} else {
				System.out.println("합계 :" + total);	
				System.out.println("종료");
			}
		
		} while(value != 0);
		scanner.close();
	}

	private static void forGugu() {
		
//		단을 입력 받아서 해당 단의 구구표를 출력
//		(for loop)
//		for (반복변수 초기화; 반복 조건 확인; 반복변수 증감)
		
//		[문제]
//		숫자를 입력받아 입력한 숫자(단)의
//		구구단을 출력하세요 (for문으로작성)
		
		Scanner scanner = new Scanner(System.in);		
		int dan;		 		
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 :");
		dan = scanner.nextInt();
		
		for (int i = 1 ; i < 10 ; i++ ) {	//	반복 변수 초기화 ; 반복 조건 체크 ; 반복 변수 증감			
			System.out.println(dan +"*" + i + "=" + dan*i );
		}
		scanner.close();
		
	}
	
	
}
