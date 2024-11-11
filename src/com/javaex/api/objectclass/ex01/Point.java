/**
 * 
 */
package com.javaex.api.objectclass.ex01;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 11.
 */

//	Object Ex01
public class Point {
	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 11.
	 */
	
	private int x;
	private int y;
	
//	생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
//		객체 내부 데이터의 문자열 출력
		return "Point(" + x + ", " + y + ")";
	}
}
