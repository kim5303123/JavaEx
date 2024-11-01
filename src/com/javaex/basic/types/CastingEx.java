/**
 * 
 */
package com.javaex.basic.types;

/**
 * @Author : 202-12
 * @Date   : 2024. 10. 31.
 */

//Casting (형변환)
//특정 자료를 다른 자료형으로 바꾸는 작업
public class CastingEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 10. 31.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		testPromotion();
		testCasting();
		
	}

	private static void testCasting() {
//		* 주의 : 공간이 작아지는 거니까 자료가 유실된 위험이 있음 
//		강제 캐스팅
//		표현 범위가 넓은 자료형 -> 표현 범위가 좁은 자료형
//		자료 유실 위험 -> 강제로 변환해야 함
		
		byte 	b;
		int 	i = 2024;
		float 	f = 123.456F;
		
		b = (byte)i;	//	캐스팅
		System.out.println(i);
		System.out.println(b);
		
//		실수 -> 정수 캐스팅
		i = (int)f;
		System.out.println(f);
		System.out.println(i);
	}
	
	
	private static void testPromotion() {
//		암묵적 캐스팅 ( 일명 : 프로모션(Promotion) )
//		표현 범위가 좁은 자료형 -> 표현 범위가 넓은 자료형 으로 변환이 필요할 때
//		변환 하지 않아도 자동으로 변환
	
		byte b =	25;	//	1byte 정수
		
		System.out.println("byte		: : " + b);
		
		short s =	b;	//	2byte 정수
		System.out.println("byte -> short 	: : " +s);
		
		int i	=	s;	//	4byte 정수
		System.out.println("short -> int 	: : " +i);
		
		long l	=	i;	//	8byte 정수
		System.out.println("int -> long 	: : " +l);
		
		float f	=	l;	//	4byte 실수
		System.out.println("long -> float 	: : " +f);
		
		double d=	f;	//	8byte 실수
		System.out.println("float -> double : : " +d);
		
		char ch	=	'A';
//		short s2 =	ch2;
		
	}
	
}
