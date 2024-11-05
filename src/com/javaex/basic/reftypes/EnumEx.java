/**
 * 
 */
package com.javaex.basic.reftypes;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 5.
 */

public class EnumEx {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 5.
	 * @Method : main
	 * @return : void
	 */
	public static void main(String[] args) {

		
//		usingEnum();
		
//		ConditionalEx 클래스의 switchPractice();의 enum버전
		switchEnumPractice();
	}

	private static void usingEnum() {
		Week today = Week.TUSEDAY;
		
//		week(enum)에 이름(열거 상수 -> String)과 열거된 순서의 숫자가 출력 
		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
		
		String dayStr = "FRIDAY";
//		에러 - Exception in thread "main" java.lang.IllegalArgumentException: No enum constant com.javaex.basic.reftypes.Week.BLACKDAY
//		String dayStr = "BLACKDAY"; 
		
//		String -> 열거상수 Convert (문자열을 열거상수로)
		Week obj = Week.valueOf(dayStr);		
		System.out.printf(obj.name() + " " + obj.ordinal());
		
//		열거 상수 목록
		System.out.println();
		System.out.println("Enum Week: ");
		Week[] days = Week.values();
		
		for (int i = 0; i < days.length ; ++i) {
			Week day = days[i];
			System.out.printf("%s -> %d%n", day.name(), day.ordinal());
		}
		
//		compareTo : 두 객체 사이의 순서를 비교하는 메서드
		Week otherDay = Week.FRIDAY;
//		TUSEDAY	와 FRIDAY의 순번 비교
		System.out.println(today.compareTo(otherDay));
		
	}
	
	private static void switchEnumPractice() {
//		ConditionalEx클래스의 switchEnumPractice(enum버전)
//		String day = "MONDAY";
		Week day = Week.TUSEDAY;		
		String action;
		
		switch (day) {
		case SUNDAY :
			action = "휴식";
			break;
		case MONDAY:
		case TUSEDAY:
		case WEDNESDAY:			
		case THURSDAY:
			action = "열공";
			break;
		case FRIDAY:
			action = "열공 후 불금";
			break;
		case SATURDAY :
			action = "주말";
		default :
			action = "여기는 어디?";
			break;
		}
		
		System.out.println(day + "에는 " + action);		
	}
}

