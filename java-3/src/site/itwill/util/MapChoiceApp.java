package site.itwill.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//���ϴ� �޴��� �Է��Ͽ� ���ϴ� ����� �����Ǿ� ����� ����ϴ� ���α׷�
public class MapChoiceApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ����[1.����, 2.����, 3.����, 4.�˻�] >> ");
		int choice = sc.nextInt();

		/*
		switch (choice) {
		case 1:
			System.out.println("[���] �л������� �����Ͽ����ϴ�.");
			break;
		case 2:
			System.out.println("[���] �л������� �����Ͽ����ϴ�.");
			break;
		case 3:
			System.out.println("[���] �л������� �����Ͽ����ϴ�.");
			break;
		case 4:
			System.out.println("[���] �л������� �˻��Ͽ����ϴ�.");
			break;
		default:
			System.out.println("[����] �޴��� �߸������߽��ϴ�.");
		}*/
		
		//Map(Integer, String)\
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1,"[���] �л������� �����Ͽ����ϴ�.");
		map.put(2,"[���] �л������� �����Ͽ����ϴ�.");
		map.put(3,"[���] �л������� �����Ͽ����ϴ�.");
		map.put(4,"[���] �л������� �˻��Ͽ����ϴ�.");
		if(choice >=1 && choice <=4) {
			System.out.println(map.get(choice));
		}else {
			System.out.println("[����] �޴��� �߸������߽��ϴ�.");
		}
	}

}
