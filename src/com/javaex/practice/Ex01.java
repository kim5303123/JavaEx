/**
 * 
 */
package com.javaex.practice;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 5.
 */
public class Ex01 {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 5.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {

		Practice04();
	}
	
	private static void Practice04() {
		
//		Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로
//		확인해 보세요
		
		
//		오류 - java.lang.ArrayIndexOutOfBoundsException
//		정해진 배열의 크기보다 크거나 음수 index에 대한 요청이 있으면 발생하는 오류				
//		정답은 for문이 실행될때 length의 길이를 조정해 주면 된다.
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for( int i = 0; i <= intArray.length-1; i++) {
			result = result + intArray[i];			

		}
		System.out.println(result);	
		
	}
}
