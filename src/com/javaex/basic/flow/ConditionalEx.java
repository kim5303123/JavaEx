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
		 
//		ifEx();
//		ifEx2();
		ifPractice01();
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
	
	private static void ifEx2() {
//		if ~ else if ~ else ~
//		정수를 입력 받았을 때 양수, 0, 음수인지 판별
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scanner.nextInt();
		
//		조건 1: 0 체크 -> 나머지: 양수 or 음수
//		조건 2: 양수 체크 -> 나머지: 음수
		
//		일반적인 순차 조건 분기
		if(num == 0) {
			System.out.println("0입니다.");
		} else if(num > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
//		중첩 if
		if(num == 0 ) {
			System.out.println("0입니다.");
		} else {
//			양수 or 음수
			if(num > 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		scanner.close();
		
	}
	
	private static void ifPractice01() {
		//
//		문제]
//		과목번호를 입력받아 강의실 번호를 출력하는
//		프로그램을 작성하세요
//		과목 code값이
//		1이면 “R101호 입니다.”
//		2이면 “R202호 입니다.”
//		3이면 “R303호 입니다.”
//		4이면 “R404호 입니다.”
//		나머지는 “상담원에게 문의하세요”
//		를 출력하세요
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바  2.C  3.C++  4.파이썬)");
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목번호 : ");
		int code = scanner.nextInt();
		
		
		if(code == 1) {
			System.out.println("R101호 입니다.");
		} else if (code == 2) {
			System.out.println("R202호 입니다.");
		} else if (code == 3) {
			System.out.println("R303호 입니다.");
		} else if (code == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}
		
		scanner.close();
		
		//
//		switch (code) {
//		case 1 : 
//			System.out.println("R101호 입니다.");
//			break;
//		case 2 : 
//			System.out.println("R202호 입니다.");
//			break;
//		case 3: 
//			System.out.println("R303호 입니다.");
//			break;
//		case 4:
//			System.out.println("R404호 입니다.");
//			break;
//		default :
//			System.out.println("상담원에게 문의하세요.");
//			break;
//		//
//	}
	}
}

