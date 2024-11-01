/**
 * 
 */
package com.javaex.basic.types;

/**
 * @Author : 202-12
 * @Date   : 2024. 10. 31.
 */

//char (2)	:	문자의 유니코드 값(부호 없는 정수)
public class CharEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 10. 31.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println("A = " + ch1 );
		System.out.println("한 = " + ch2 );
		
		System.out.println("(int)ch1 = " +(int)ch1);
		System.out.println("(int)ch2 = " +(int)ch2);
		
//		ch1의 4글자 뒤
		char test = (char)((int)ch1 + 4);
		System.out.println("(char)((int)ch1 + 4) =" + test);
		
//		String형은 char의 집합
//		가장 기본적인 참조자료형 ( 데이터와 데이터를 다룰수 있는 기능을 함께 가지고 다닌다. )
		String str = "Java Programming";
		System.out.println(str);
		
		
	}
	
}
