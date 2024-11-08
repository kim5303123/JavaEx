/**
 * 
 */
package com.javaex.oop.person;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 8.
 */
public class Person {
	
//		필드
		protected String name;
		protected int age;
	
//		기본생성자
		public Person() {
			System.out.println("Person() 생성자 호출");		
		}
		
	
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
			System.out.println("person(String, int) 생성자 호출");
		}
		
//		getter / setter 
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
//		일반 메서드
		public void showInfo() {
			System.out.println("Name: " + name + ", Age: " + age);
		}
		
	
}
