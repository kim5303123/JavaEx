/**
 * 
 */
package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 14.
 */
class Thief {
	String name;
	float height; 
	float weight;
	
//	생성자
	public Thief(String name, float height, float weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

//	게터/세터
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Thief [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
}

public class ScannerEx {
//		실제 프로젝트의 위치
//		C:\Users\202-12\eclipse-workspace\JavaEx\files\
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "thieves.txt";
	
	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 14.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
		File file = new File(filename);
		
		try(Scanner sc = new Scanner(file);	
				){
			
			while(sc.hasNextLine()) {
//				데이터 컨버팅이 자동으로 됨
				String name = sc.next();
				float height = sc.nextFloat();
				float weight = sc.nextFloat();
				
				Thief thief = new Thief(name, height, weight);
				System.out.println(thief);
//				문서에 빈 줄이 하나 들어가있어서 오류가 낫음
				sc.nextLine();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 
	}//main

}
