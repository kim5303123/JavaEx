/**
 * 
 */
package com.javaex.basic.types;

/**
 * @Author : 202-12
 * @Date   : 2024. 10. 30.
 */

//정수형 데이터 타입
//byte (1) < short (2) < int (4) < long (8)
//정수형의 기본은 int

public class IntLongEx {

	
	public static void main(String[] args) {
//		선언
		int intVar1;
		int intVar2;
		
//		초기화
		intVar1	=2024;
//		intVar2 =1234567890123;// out of range
		
		System.out.println(intVar1);
		
		long longVar1 = 2024;
		long longVar2 = 1234567890123L;		//	L	->	기본형이 int기 때문에 Long형이라고 표시해야함
		
		System.out.println(longVar1);
		System.out.println(longVar2);

		
		long amount = 10_000_000_000_000L;
		
		System.out.println(amount);
		
//		2진수, 8진수, 16진수 표기
		
//		2진수(0,1)
//		8진수(0,1,2,3,4,5,6,7)
//		10진수(0,1,2,3,4,5,6,7,8,9;)
//		16진수(0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F)
		
		int bin, oct, hex;	//	선언
		
		bin = 0b1100;	//	0b	->	2진수	
		oct	= 072;		//	0	->	8진수
		hex	= 0xFF;		//	0x	->	16진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
	
}
