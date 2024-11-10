/**
 * 
 */
package com.javaex.oop.shape.v2;

/**
 * 
 */
public class Circle extends Shape implements Drawable {

//	필드
//	반지름
	protected double radius;
	
//	생성자
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	
	@Override
	public void draw() {
		System.out.printf("원 [x=%d, y=%d, r=%.2f, area=%.2f]" + "을 그렸어요.%n", x , y , radius, area());
	}
	
}
