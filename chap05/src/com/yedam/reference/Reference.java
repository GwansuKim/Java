package com.yedam.reference;

public class Reference {

	public static void main(String[] args) {
		int intVal = 10;
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null;
		
		System.out.println(array);		//이 값이 참조 타입의 주소
		System.out.println(array2);		//첫 번째 배열과 내용이 같아도 배치된 주소가 다름
		System.out.println(array==array2);
		System.out.println(array[0]==array2[0]);
		System.out.println(intVal);
		System.out.println(array3);
	}

}
