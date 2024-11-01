/**
 * 
 */
package com.javaex.basic.types;

/**
 * @Author : 202-12
 * @Date   : 2024. 10. 31.
 */

//논리형 (1바이트) - true or false
public class BooleanEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 10. 31.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = true; 
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);

		int var1 = 3, var2 = 5;
		boolean result = var1 > var2;
//		비교연산, 논리연산의 결과를 boolean
		
		
		System.out.println(var1 + ">" + var2 + "=>" + result);
		
		
	}
	
}
