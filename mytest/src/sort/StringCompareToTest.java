package sort;

public class StringCompareToTest {
	public static void main(String[] args) {
		// 배열에 저장된 값은 참조(데이터의 주소)값이다.
		// 참조값으로 접근한 문자열은 >, <로 비교하지 않는다. compareTo 메소드로 비교
		// 사전식 비교(알파벳 또는 가나다 순서)
		String[] names = { "boa", "momo", "nayeon", "June", "nana" };

		System.out.println("문자열비교 1: " + "boa".compareTo("nana"));	// 왼 < 오	-12
		System.out.println("문자열비교 1: " + "boa".compareTo("June"));	// 왼 < 오	-12
		System.out.println("문자열비교 1: " + "momo".compareTo("nana"));	//			-1
		System.out.println("문자열비교 2: " + "nana".compareTo("boa"));	// 왼 > 오	12
		System.out.println("문자열비교 2: " + "nana".compareTo("momo"));	//			1
		System.out.println("문자열비교 2: " + "nana".compareTo("nayeon"));	//			-11
		
		// abcdefghijklmnopqrstuvwxyz
		
		System.out.println("한글문자열비교 1: " + "고양이".compareTo("염소"));		// 왼 < 오	- 
		System.out.println("한글문자열비교 1: " + "고양이".compareTo("고양니"));	// 왼 > 오	+
		System.out.println("한글문자열비교 2: " + "다람쥐".compareTo("고양이"));	// 왼 > 오	+
		
		System.out.println("문자열비교 2: " + "nana".compareTo("nana"));	// 0
		
		/*
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names.length; j++) {
				if (names[i].compareTo(names[j])) {
					
				}
			}
		}
		 */
	}
}
