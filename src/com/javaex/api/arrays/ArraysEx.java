/**
 * 
 */
package com.javaex.api.arrays;

import java.lang.annotation.Target;
import java.util.Arrays;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 11.
 */
public class ArraysEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 11.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {

//		배열 복사
//		arrayCopoEx();
		
//		얕은 비교
		equalsEx();
		
	}
	
	private static void arrayCopoEx() {
		char[] src = "Java Programming".toCharArray();		
		System.out.println(Arrays.toString(src));
		
//		System을 이용한 카피
		char[] target = new char[src.length];
//		src의 0번 부터의 요소를 target의 0번부터 복사 src.length 길이만큼을 복사
		System.arraycopy(src, 0, target, 0, src.length);
		
		System.out.println(Arrays.toString(target));
		
//		Arrays.copyOf를 이용한 카피
		target = Arrays.copyOf(src, 5);
		
		System.out.println("copyOf:" + Arrays.toString(target));
		
//		범위 복제
		target = Arrays.copyOfRange(src, 5, 12);
		
		System.out.println("copyOfRange: " + Arrays.toString(target));
		
	}
	
	private static void equalsEx() {
//		배열의 얕은 비교
//		-> 배열의 요소 값을 단순 비교 하는 것
		
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} ;
		int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} ;
		int[] nums3 = {1, 2, 3, 4, 0, 6, 7, 8, 9, 0} ;
		
		System.out.println("nums1 vs nums2: " + Arrays.equals(nums1, nums2));
		System.out.println("nums1 vs nums3: " + Arrays.equals(nums1, nums3));
		
	}
}
