/**
 * 
 */
package com.javaex.basic.reftypes;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 5.
 */
public class ArrayEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 5.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		usingArray();
		
	}

	
	private static void usingArray() {
//		배열의 선언과 초기화, 사용
//		선언
		String[] names;	//	Type[] 식별자
		int scores[];	//	Type 식별자[]
		
//		초기화
		names = new String[] {
				"김","이","박","최"
		};	//	초기값이 있을 때
		
		scores = new int[4];	//	빈 배열 만들기
//		인덱스 접근
//		0부터 시작해서 .length - 1 까지
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		
		float heights[] = {
			175.3f,
			170.2f,
			173.4f,
			168.5f
		};	//	선언과 동시에 할 때만 가능
		
//		names, scores, heights - > 같은 index에 접근하여 값을 가져오는 거 확인
		for (int i =0; i < names.length; ++i) {
			System.out.printf("%s (%.2f) : score = %d%n", names[i],heights[i],scores[i] );
		}
	}
}
