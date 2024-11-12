/**
 * 
 */
package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 12.
 */
public class QueueEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 12.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		Queue 자료형 : 입력 방향과 출력 방향이 반대, 먼저 입력된 데이터가 먼저 출력된다. ( 선인선출 )
//		First Input First Out
		
//		Queue는 인터페이스, 실체 클래스는 LinkedList를 그냥 사용한다. ( LinkedList 자체가 순서를 다루는 자료형이라 그러함)
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1 ; i <= 10; i++) {
			queue.offer(i);	//	enqueue - > offer
			System.out.println("QUEUE: " + queue);
		}
		
//		출력 방향에 데이터 확인
		System.out.println("PEEK: " +  queue.peek());
		
//		인출
		while(!queue.isEmpty()) {
			System.out.println("POLL: " + queue.poll());
			System.out.println("QUEUE: " + queue);
		}
		
	}
	
}
