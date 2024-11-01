/**
 * 
 */
package com.javaex;
import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 1.
 */

//Tip	:	Ctrl+Shift+O:	Organize Import(알아서 불러옴 , 정리도 해줌)
//Tip2	:	Ctrl+Space	:	코드 자동 완성

//Console
//표준 입력	:	stdin	->	System.in
//표준 출력	:	stdout	->	System.out
//표준 에러	:	stderr	->	System.err
public class ConsoleEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 1.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		consoleOutput();
		consoleInput();
	}
	
//	콘솔 입력 예제
	public static void consoleInput() {
//		표준 입력 : stdin	->	System.In
//		데이터 소스로부터 입력을 받는 Scanner 클래스를 사용
		
//		java.lang 이외의 기능을 불러올 때는 import 필요
		Scanner scanner = new Scanner(System.in);
		
//		scanner.next()		
//		공백을 기준으로 한 단어 또는 한 문자씩 입력받는다.
//		버퍼에 입력된 문자나 문자열에서 공백 전까지의 단어를 읽는다.
//		개행 문자를 가져오지 않는다.
		
//		scanner.nextLine()
//		문자 또는 엔터를 치기 전까지의 문장 전체를 입력받는다.
//		버퍼에 입력된 문자열을 개행 문자까지 다 가져온다.
		
//		이름과 나이를 물어봐서 출력하는 프로그램
		System.out.print("너 누구야? ");
		String name = scanner.next();		
		System.out.print("나이는 몇살이야?");
		int age	= scanner.nextInt();
		
		System.out.println("Welcome, " + name);
		System.out.println("당신의 나이는 " + age + "세입니다.");
		
//		시스템 자원은 다 쓰고 돌려줘야 한다.
		scanner.close();
		
	}
	
	
//	콘솔 출력 예제
	public static void consoleOutput() {
//		print	:	개행하지 않는다
//		printLn	:	개행한다
//		printf	:	형식 지정 문자열 출력	->	String
		System.out.print("Hello ");		//	개행 안함
		System.out.println("Java ");	//	개행 함
		
//		이스케이프 문자
		System.out.println("Hello\nJava");		//	\n:	개행
		System.out.println("Hello\tJava");		//	\t:	tab
		System.out.println("Hello, \"Java!\"");	
		System.out.println("\\: 역슬래시");		//	\\	->	\ 로 표시 된다.
		
	}
}
