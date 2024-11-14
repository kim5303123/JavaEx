/**
 * 
 */
package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 14.
 */
public class FileClassEx {

//	실제 프로젝트의 위치
//	C:\Users\202-12\eclipse-workspace\JavaEx\files\
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	
	
	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 14.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		파일 객체 생성
		File root = new File(rootPath);
//		이 파일은 존재 하는가??
		System.out.println(rootPath + " : " + root.exists());
		
		if(!root.exists()) {	//	존재 하지 않으면
//			디렉토리 생성
			root.mkdirs();
			System.out.println(rootPath + "를 생성 하였습니다.");
		} else {
			System.out.println(rootPath + "는 이미 있는 디렉터리 입니다.");
		}
		
		File subdir = new File(rootPath + "subdir");
		if(!subdir.exists()) {
//			디렉토리 생성
			subdir.mkdirs();
			System.out.println(subdir + "를 생성 하였습니다.");
		} else {
			System.out.println(subdir + "을 생성하지 못했습니다.");
		}
//	rootPath 내부에 새파일 생성
		File file = new File(rootPath + "myfile.txt");
		if(!file.exists()) {
			try {
//			디렉토리 생성
			file.createNewFile();			
			} catch (IOException e) {
				System.out.println("파일을 생성하지 못했습니다.");
			}
		} 
		
//		파일 지우기
		file.delete();
		
		printInfo(root);
	}// main
	
	private static void printInfo(File f) {
		System.out.println("-----------");
		if(f.isDirectory()) {
//			디렉터리
			System.out.println("Directory : " + f.getName());
			File[] files = f.listFiles();
			
			for(File file: files) {
				printInfo(file);
			}
			
		} else {
//			파일 ( 파일의 기본 속성 )
//			읽을수 있느냐
			System.out.print(f.canRead() ? "r" : ".");
//			쓸수 있느냐 
			System.out.print(f.canWrite() ? "w" : ".");
//			실행 가능한 파일이냐
			System.out.print(f.canExecute() ? "x" : ".");
			
			System.out.print(" " + f.getName() + "\t");
			System.out.println(f.length());
		}
	}
}
