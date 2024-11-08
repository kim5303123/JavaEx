/**
 * 
 */
package com.javaex.oop.staticmember;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 7.
 */
public class StaticExApp {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 7.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		첫 번째 인스턴스가 생성되기 전에 클래스가 먼저 메모리에 로드 된다.
//		static 블록에서 static 영역 초기화 -> 생성자 호출
		StaticEx s1 = new StaticEx();	//	인스턴스 생성
		System.out.println("refConunt:" + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();	//	인스턴스 생성
		System.out.println("refCount:" + StaticEx.refCount);
		
//		s1 참조 해제
		s1 = null;
		
		System.gc();	//	가비지 컬렉터 호출 -> 직접 호출은 사양하자.
		try {
			Thread.sleep(3000);	//	3초간대기
			System.out.println("refCount:" + StaticEx.refCount);
		} catch (Exception e) {
			
		}
		
//		static 클래스 : 생성자를 생성하지 않아도 마음대로 호출해서 사용할 수 있다.
		System.out.println(Calc.PI);
		System.out.println(Calc.getSum(1,2,3,4,5));
		
	}

}
