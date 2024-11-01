/**
 * 
 */
package com.javaex.basic.opers;

/**
 * @Author : 202-12
 * @Date   : 2024. 10. 31.
 */
public class CondOperEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 10. 31.
	 * @Method : main
	 * @return : void
	 */
//	3항 연산자
//	조건에 따라 선택적으로 값을 선택하는 연산자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
//		a가 짝수면 짝수 , 홀수면 홀수		
		String result;
		
		result = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println("== 삼항연산자 1 ==");
		System.out.println(a + "는" + result);
		
//		점수가 80점 이상이면 Good 
//		점수가 50 ~ 80 사이면 Pass
//		점수가 50이 안되면 Fail
		

		String message;
		int score = 70;
		
		message = (score >= 80) ? "Good" : (score >= 50) ? "Pass" : "Fail";
		
		System.out.println("== 삼항연산자 2 ==");
		System.out.println("점수는:" + score + "  결과:" + message);

		
	}

}
