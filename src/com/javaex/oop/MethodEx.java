/**
 * 
 */
package com.javaex.oop;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 6.
 */
public class MethodEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 6.
	 * @Method : main
	 * @return : void
	 */
	
//	매서드 작성 연습
	public static void main(String[] args) {
//		매개변수 X, 리턴 X
//		printMessage();
		
//		매개변수 X, 리턴 O
//		String message = getMessage();
//		System.out.println("getMessage: " + message);
		
//		매개변수 O, 리턴 X
//		printSum(10,20);
		
//		매개변수 O, 리턴 O
		System.out.println(getSum(10,20)); 
		System.out.println(getSum(10,20,30));
		
		
	}

//	매개변수 X -> 파라미터 X
//	return X -> void
	private static void printMessage() {
		
		System.out.println("매개 변수 없고, 리턴도 없음");
	}
	
//	매개변수 X -> 파라미터 X
//	return O -> 리턴이 될 데이터의 타입 명시	
	private static String getMessage() {
		
//		return으로 데이터 반환
		return "입력은 있지만, 출력은 있는 메서드";
		
	}
	
//	매개변수 O -> 파라미터 O
//	return X -> void	
	private static void printSum(double num1, double num2) {
		
		System.out.println(num1 + num2);
	}
	
//	매개변수 O -> 파라미터 O
//	return O -> 리턴이 될 데이터의 타입 명시
	private static double getSum(double num1, double num2) {
		
		return num1 + num2;
	}
	
//	메서드 오버로딩(초과적재)	->	다형성의 일부
	private static double getSum(double num1, double num2, double num3) {
		
		return num1 + num2 + num3;
	}
}
