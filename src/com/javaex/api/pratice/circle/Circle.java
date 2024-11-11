/**
 * 
 */
package com.javaex.api.pratice.circle;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 11.
 */
public class Circle {

	private int x;
	private int y;
	private int radius;
	
//	radius가 같으면 객체의 값이 같다고 가정

//	생성자
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Circle) {
//			다운 캐스팅
			Circle cc = (Circle)obj;
			return radius == cc.radius;
		}
		return super.equals(obj);
		
	}
	
}

