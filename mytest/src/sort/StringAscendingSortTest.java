package sort;

import java.util.Arrays;

public class StringAscendingSortTest {

	public static void main(String[] args) {
		
		String[] datas = { "boa", "momo", "nayeon", "June", "nana"};
		// June은 대문자가 포함되므로 오름차 순으로 정렬했을 때 제일 앞으로 옴

		for(int i=0;i<datas.length;i++) {
			for(int k=i+1;k<datas.length;k++) {
				if(datas[i].compareTo(datas[k]) > 0) {
					//교환
					String temp = datas[k];
					datas[k]= datas[i];
					datas[i]=temp;
				}
			} //k변수 for문
	    System.out.println("i=" + i + ", 중간결과 : " + Arrays.toString(datas));	
			
		}//i변수 for문
		
		
	}

}
