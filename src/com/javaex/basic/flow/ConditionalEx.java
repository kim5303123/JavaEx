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
//		ifPractice01();
//		switchEx();
//		switchEx2();
		switchPractice();
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
	}
	
	private static void switchEx() {
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바  2.C  3.C++  4.파이썬)");
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목번호 : ");
		int code = scanner.nextInt();
		
//		변수 값에 따른 조건 분기
		
		switch (code) {
		case 1 : // code == 1 이면
			System.out.println("R101호 입니다.");
			break;
		case 2 : // code == 2 이면
			System.out.println("R202호 입니다.");
			break;
		case 3:  // code == 3 이면
			System.out.println("R303호 입니다.");
			break;
		case 4:  // code == 4 이면
			System.out.println("R404호 입니다.");
			break;
		default :// else
			System.out.println("상담원에게 문의하세요.");
			break;
		}
			
		scanner.close();		

	}
	
	private static void switchEx2() {
		//
//		[문제]
//				월을 입력받아 해당월의 일수를 출력하는
//				프로그램을 작성하세요
//				1월이면 “31일”
//				2월이면 “28일”
//				3월이면 “31일”
//				4월이면 “30일”
//				5월이면 “31일”
//				6월이면 “30일”
//				7월이면 “31일”
//				8월이면 “31일”
//				9월이면 “30일”
//				10월이면 “31일”
//				11월이면 “30일”
//				12월이면 “31일”	
		//
		System.out.print("월을 입력하세요:");	
//		1, 3, 5, 7, 8, 10, 12월 - > 31일
//		2월 -> 28일
//		4, 6, 9, 11월 -> 30일
		
		
		Scanner scanner = new Scanner(System.in);
		int code = scanner.nextInt();
		
		switch (code) {
		case 1 , 3 , 5 , 7 , 8 , 10 , 12: 
			System.out.println(code + "월은 31일 입니다.");
			break;
		case 2 : 
			System.out.println(code + "월은 28일 입니다.");
			break;
//		case 3: 
//			System.out.println("31일 입니다.");
//			break;
		case 4 , 6 , 9 , 11:
			System.out.println(code + "월은 30일 입니다.");
			break;
//		case 5 : 
//			System.out.println("31일 입니다.");
//			break;
//		case 6 : 
//			System.out.println("30일 입니다.");
//			break;
//		case 7: 
//			System.out.println("31일 입니다.");
//			break;
//		case 8:
//			System.out.println("31일 입니다.");
//			break;
//		case 9 : 
//			System.out.println("30일 입니다.");
//			break;
//		case 10 : 
//			System.out.println("31일 입니다.");
//			break;
//		case 11: 
//			System.out.println("30일 입니다.");
//			break;
//		case 12:
//			System.out.println("31일 입니다.");
//			break;
		default :
			System.out.println(code + "월이 어딨어?");
			break;
	}
		scanner.close();
	}
	
	private static void switchPractice() {
//		TODO : 이 코드를 나중에 enum (열거형) 객체로 다시 만들 예정
		
//		문자열 변수에 문자열로 요일 정보를 입력
//		"SUNDAY" 				-> 휴식
//		"MONDAY" ~ "THURSDAY" 	-> 열공
//		"FRIDAY" 				-> 열공 후 불금
//		"SATURDAY" 				-> 주말
		
		String day = "MONDAY";
		String action;
		
		switch (day) {
		case "SUNDAY" :
			action = "휴식";
			break;
		case "MONDAY":
		case "TUSEDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			action = "열공";
			break;
		case "SATURDAY" :
			action = "주말";
		default :
			action = "여기는 어디?";
			break;
		}
		
		System.out.println(day + "에는 " + action);		
		
	}
	
}
