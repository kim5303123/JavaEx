/**
 * 
 */
package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 14.
 */
public class StringTokenizerEx {

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

		try(Reader freader = new FileReader(filename);
			BufferedReader br = new BufferedReader(freader);
				) {
			String thief; 
			
			while((thief = br.readLine()) != null	) {
				StringTokenizer st = new StringTokenizer(thief, " ");
//				System.out.println(thief);
//				뒤에 더 있니?
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					System.out.println(token + " ");
				}
//				개행
				System.out.println();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
