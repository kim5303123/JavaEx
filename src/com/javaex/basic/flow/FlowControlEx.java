/**
 * 
 */
package com.javaex.basic.flow;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 4.
 */
public class FlowControlEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 4.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		continueEx();
		breakEx();
	}
	
	private static void continueEx() {
//		continue	:	반복 블록 내부에서 남아있는 문장을 실행하지 않고 
//						다음번 루프로 진행
		
//		1 ~ 100 루프를 돌면서 2의 배수와 3의 배수가 아닌 숫자만 출력
		
		for(int i = 1; i < 101 ; ++i) {
			
			if(i % 2 == 0 || i % 3 == 0) continue;
			System.out.println(i);
			
		}
 		
	}
	
	private static void breakEx() {
//		break : 반복 블록 내부에서 남아있는 문장은 실행하지 않고, 블록을 탈출
		
//		6과 14로 모두 나누어 떨어지는 수를 구하자
		
		int num = 1;
		
		while(true) {	//	어디까지 가야 저 값이 나올지 모르겠다.
			
			if(num % 6 == 0 && num % 14 == 0) 
				break; // 루프 탈출
				++num;
			
		}
		System.out.println("6과 14의 최소공배수(단순무식 버전) : " + num);
	}
	
}
