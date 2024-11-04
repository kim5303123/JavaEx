/**
 * 
 */
package com.javaex.basic.flow;

import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 4.
 */
public class LoopEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 4.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		whileEx(); 
		whileGugu();
	}

	private static void whileEx() {
//		while (condition) { }
//		condition이 참인 동안 블럭을 반복수행한다.
		
		int i = 0;	//	반복 제어 변수
		
		while(i < 5) {
			System.out.println("I LIKE JAVA"+i);
//			주의 : 반복 제어변수를 절 조정해야한다. (false 처리)
			i += 1;  // = (i = i +1);
		}
		
	}
	
	private static void whileGugu() {
		 
		 Scanner sc = new Scanner(System.in);
		 		 
		 int dan;
		 int i = 1;
		 //메세지출력, dan값 입력		 
		 
		 System.out.println("단을 입력해 주세요");
		 System.out.print("단 : ");
		 dan = sc.nextInt();
		 while(i < 10){			 
//			 System.out.println("단 :"+ dan );
			 System.out.println( dan + "*" + i + "=" + (dan*i));
			 i += 1 ;
			 
		 }		 
		sc.close();
		 
	}
		 
	

	
}
