/**
 * 
 */
package com.javaex.practice;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 5.
 */
public class Ex03 {

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
//		 Ex03 아래코드의 출력 값을 예상하고 코드로 확인해 보세요.
		
		
		int[] intA = {3 , 6,  9};
		
		int[] intB;	//	선언
		intB = intA;	//	복제
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i <intA.length; i++) {
			System.out.println(intA[i]);
		}
//		예상하면 intA는 intB랑 복제되어 있는 상태이다. 
//		위에서는 intB의 0번째방에 20, 2번째방에 10을 넣었다.
//		이 말은 intA에 들어가있는 상태와 같다는 거니까 
//		intA = {3, 6, 9}에서 삽입이 되면 intB = {20, 6, 10} 일 꺼 같다.
		
	}
	
}
