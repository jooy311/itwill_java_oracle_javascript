package site.itwill.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//원하는 메뉴를 입력하여 원하는 기능이 구현되어 결과를 출력하는 프로그램
public class MapChoiceApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 선택[1.저장, 2.변경, 3.삭제, 4.검색] >> ");
		int choice = sc.nextInt();

		/*
		switch (choice) {
		case 1:
			System.out.println("[결과] 학생정보를 저장하였습니다.");
			break;
		case 2:
			System.out.println("[결과] 학생정보를 변경하였습니다.");
			break;
		case 3:
			System.out.println("[결과] 학생정보를 삭제하였습니다.");
			break;
		case 4:
			System.out.println("[결과] 학생정보를 검색하였습니다.");
			break;
		default:
			System.out.println("[에러] 메뉴를 잘못선택했습니다.");
		}*/
		
		//Map(Integer, String)\
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1,"[결과] 학생정보를 저장하였습니다.");
		map.put(2,"[결과] 학생정보를 변경하였습니다.");
		map.put(3,"[결과] 학생정보를 삭제하였습니다.");
		map.put(4,"[결과] 학생정보를 검색하였습니다.");
		if(choice >=1 && choice <=4) {
			System.out.println(map.get(choice));
		}else {
			System.out.println("[에러] 메뉴를 잘못선택했습니다.");
		}
	}

}
