/**
 * 
 */
package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 11.
 */
public class ExceptionHandlingEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 11.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		arithExceptionEx();
		arrayExceptionEx();
		nullpointerExceptionEx();
	}
	
	private static void arrayExceptionEx() {
		int[] intArray = new int[] {
				3, 6, 9
		};
		
		try {
			System.out.println(intArray[3]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error:" + e.getMessage());
			
		}
	}
	
	private static void nullpointerExceptionEx() {
		String str = new String("Hello Java");
		
		try {
			str = null;
			System.out.println(str.toUpperCase());
		} 
		catch (NullPointerException e) {
			System.err.println("null 입니다.");
		}
	}
	
	
	private static void arithExceptionEx() {
//		스캐너에서 정수 입력
//		100을 정수로 나눈 값을 출력
		
		double result = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		
//		예외 발생 가능 영역
		try {
			num = sc.nextInt();
			result = 100 / num ;
			
			System.out.println(result);
		} 
		catch (InputMismatchException e) {
			System.err.println("정수를 입력해 주세요.");
		} 
		catch (ArithmeticException e) {
			System.err.println("0으로는 나눌수 없습니다.");
		} 
		catch (Exception e) {
//			가장 마지막에 남아 있는 예외 처리를 위해서만 남겨 둬야 함
			e.printStackTrace();
		} 
		finally {
//			예외의 유무에 관계없이 가장 마지막에 실행함(무조건 실행)
//			자원 정리 등을 수행
			System.out.println("예외 처리 종료!");
		}
		
		sc.close();
		System.out.println("프로그램 종료.");
	}
}
