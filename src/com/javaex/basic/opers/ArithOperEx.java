/**
 * 
 */
package com.javaex.basic.opers;

/**
 * @Author : 202-12
 * @Date   : 2024. 10. 31.
 */
public class ArithOperEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 10. 31.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		arithBasic();
		incrOpers();
	}
	
	private static void incrOpers() {
//		증감연산자	(1항 연산)
//		++, --
//		앞에 붙으면 : 전위 증감
//		뒤에 붙으면 : 후위 증감
		
		int a = 7;
		System.out.println("전위 증감");
		System.out.println("a: " + a);
		System.out.println("++a: " + ++a);
		System.out.println("final a: " + a);
		System.out.println("------------------------------------------");
		a = 7;	//	원상복구
		System.out.println("후위 증감");
		System.out.println("a: " + a);
		System.out.println("a++: " + a++);
		System.out.println("final a: " + a);
		
	}
	
	private static void arithBasic() {
		
//		기초 산술 연산자
		int a = 7,	b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);		
		System.out.println(a * b);
		System.out.println(a / b);
//		int	/	int	->	int
		System.out.println(a % b);
		
//		정수끼리의 나눗셈을 실수로 얻고자 한다면
//		캐스팅
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b);
		
	}
}
