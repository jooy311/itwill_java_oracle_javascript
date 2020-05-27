package oop;

import java.util.Arrays;

//배열 요소값을 정렬하여 출력하는 프로그램 작성
public class ArraySortApp {
	public static void main(String[] args) {
		int[] array={20,50,10,40,30};
	
		/*
		System.out.print("정렬 전 >> ");
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		//선택 정렬 알고리즘을 이용하여 배열 요소값에 대한 정렬 처리
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.print("정렬 후 >> ");
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println();
		*/
		
		System.out.print("정렬 전 >> ");
		//Arrays 클래스 : 배열 관련 기능을 제공하는 클래스
		//Arrays.toString(Object array) : 배열을 전달받아 배열의 모든 
		//요소값들을 문자열로 변환하여 반환하는 메소드
		System.out.println(Arrays.toString(array));
		
		//Arrays.sort(Object array) : 배열을 전달받아 배열 요소값을 정렬 처리하는 메소드
		Arrays.sort(array);
		
		System.out.print("정렬 후 >> ");
		System.out.println(Arrays.toString(array));
	}
}









