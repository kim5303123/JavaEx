/**
 * 
 */
package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 14.
 */
public class FileStreamEx {
//		실제 프로젝트의 위치
//		C:\Users\202-12\eclipse-workspace\JavaEx\files\
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "img.jpg";
	static final String target = rootPath + "img_copy.jpg";
	
	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 14.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {
//		InputStream is = null;
//		OutputStream os = null;

		try (InputStream is = new FileInputStream(source);
			 OutputStream os = new FileOutputStream(target);
			) {
//			is = new FileInputStream(source);
//			os = new FileOutputStream(target);
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
			System.out.println("파일을 복사했어요.");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(is != null) is.close();
//				if(os != null) os.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		}
	}
	
}
