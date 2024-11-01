/**
 * 
 */
package com.javaex.basic.types;

/**
 * @Author : 202-12
 * @Date   : 2024. 10. 30.
 */

//float (4바이트 실수) < double (8바이트 실수)
//실수형의 기본은 double
public class FloatDoubleEx {

	
	public static void main(String[] args) {
		float floatVar		= 3.14159F;	//	F	->	기본형이 double형이기 때문에 float를 표기해줘야 함
		double doubleVar	= 3.14159;

		System.out.println("float: " + floatVar);
		System.out.println("double:" + doubleVar);
		
//		e표기법
		int intVar = 3000000;
		doubleVar = 3E6;	//	3	*	10	^	6과 같다
		floatVar  =	3e-6F;	//	3	*	10	^	-6
		
		System.out.println("intVar		:"	+	intVar);
		System.out.println("doubleVar	:"	+	doubleVar );
		System.out.println("floatVar	:"	+	floatVar);
		
//		부동소수점 처리 유의사항(아주 중요)
//		float, double은 정밀도 포기, 표현 범위 넒힌 것이다.
//		정밀한 실수 계산을 할때는 다른 방법을 사용
		
		System.out.println("0.1 * 3	:" + 0.1 * 3);
		
	}
	
}
