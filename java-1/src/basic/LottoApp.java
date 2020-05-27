package basic;

import java.util.Arrays;

//1-45범위의 중복되지 않는 정수난수 6개를 제공받아 오름차순으로 정렬하시요
public class LottoApp {
	// 정렬 sort : 값을 차례대로 나열하는 기능
	// 1.오름차순 정렬
	// 2.내림차순 정렬
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			//난수를 제공받아 저장
			//->난수를 기존 앞에거와 계속 비교 -> 같으면 재실행
			arr[i] = (int) (Math.random() *100)%45 +1;
			
			while(true) {
				boolean flag = false;//난수에대한 상태를 저장하기 위한 불리언변수
			//기존 요소를 참조하기 위한 반복문
			//->새로운 난수를 기존 난수와 비교하기 위한 반복문
				for(int j=0; j<i; j++){
					if(arr[i] == arr[j]) {
						flag = true;//중복
						break;
					}
				}
				
				//새로운 난수가 기존 난수와 중복되지 않은 경우임
				if(flag != true) break; 
			}
			
			
		}
		//배열 요소값을 정렬하여 재저장
		//	Arrays.sort(arr);//1.오름차순
		
		//<<<<<선택정렬>>>>>> 알고리즘을 사용해보자
		//30,10,50,20,40
		for(int i=0; i<arr.length-1; i++) { //비교하는 요소
			for(int j=i+1; j<arr.length; j++) {//비교당하는 요소
				if(arr[i] > arr[j]) {//비교기준 > 비교당하는 요소
					int tmp = arr[j]; //임시저장
					arr[j] = arr[i];//바꾸고
					arr[i] = tmp;//바꾸고
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
