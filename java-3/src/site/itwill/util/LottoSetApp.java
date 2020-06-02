package site.itwill.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1~45 범위의 중복되지 않는 정수난수 6개를 제공받아 오름차순으로 정렬하여 출력
public class LottoSetApp {
	public static void main(String[] args) {
		Set<Integer> lottoSet = new HashSet<Integer>();
		Random random = new Random();
		
		while(true) {
			//범위에 해당하는 숫자를 요소로 저장
			//중복값은 절대 저장 안됨
			lottoSet.add(random.nextInt(45) + 1);
			if(lottoSet.size() == 6) break;
		}
		
		//set.toArray() : set 인스턴스를 배열로 변환하여 반환하는 메소드
		Integer[] lotto = lottoSet.toArray(new Integer[0]);//요소의 갯수는 모르니까 0으로 해둔다.
		
		//Arrays.sort() : 배열을 전달받아 정렬하는 메소드
		Arrays.sort(lotto);
		
		//toString() : 배열을 전달받아 요소들을 문자열로 반환하는 메소드
		System.out.println("행운의 숫자 >> " + Arrays.toString(lotto));
	}
}
