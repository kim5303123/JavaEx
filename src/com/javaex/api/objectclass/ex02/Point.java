/**
 * 
 */
package com.javaex.api.objectclass.ex02;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 11.
 */

//	Object Ex02 : equals()
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
	
	@Override
	public boolean equals(Object obj) {
		
//		object가 Point인지 확인
		if (obj instanceof Point) {
//			다운 캐스팅
			Point other = (Point)obj;
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
		
	}
	
}
