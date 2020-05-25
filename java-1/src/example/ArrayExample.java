package example;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		//사람들에 대한 나이를 저장하고 있는 배열 생성
		int[] age={27,16,22,36,57,60,43,23,14,29,44,52,69,51,39,33,11};
		
		//배열에 저장된 사람들의 평균 나이를 계산하여 출력하세요.
		//ex) 평균 나이 = 36살 
		int sum = 0;
		for(int i=0; i<age.length; i++) {
			sum += age[i];
		}
		int ave = sum / age.length;
		System.out.println("사람들의 평균 나이는 " + ave + " 살 입니다.");


		System.out.println("============================================");
		
		//배열의 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		//ex) 10대 = 3명
		//    20대 = 4명
		//    ...
		//    60대 = 2명
		
		Arrays.sort(age);
		int[] cnt = new int[7];
		/*for(int i=0; i<age.length; i++) {
			if(age[i] >=10 && age[i] < 20) {
				cnt[1]++;
			}else if(age[i] >=20 && age[i] <30) {
				cnt[2]++;
			}else if(age[i] >=30 && age[i] <40) {
				cnt[3]++;
			}else if(age[i] >=40 && age[i] <50) {
				cnt[4]++;
			}else if(age[i] >=50 && age[i] <60) {
				cnt[5]++;
			}else if(age[i] >=60 && age[i] <70) {
				cnt[6]++;
			}
		}*/
		for(int a : age) {
			cnt[a/10]++;
		}
		for(int i=1; i<cnt.length; i++) {
			System.out.println( i *10 + "대 = "+cnt[i] +"명");
		}
		

		System.out.println("============================================");
	}
}