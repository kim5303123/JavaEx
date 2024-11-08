/**
 * 
 */
package com.javaex.oop.person;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 8.
 */
public class PersonApp {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 8.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		
		Person p = new Person("정우성", 45);
		p.showInfo();
		
		Student s1 = new Student("서울고등학교");
		s1.showInfo();
		
		Student s2 = new Student("이정재",45,"한국고등학교");
		s2.showInfo();

	}
	
}
