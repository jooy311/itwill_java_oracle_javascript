package oop;

public class MainArgApp {
	public static void main(String[] args) {
		System.out.println("���޵� ���ڿ��� ���� = " + args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = " + args[i]);
		}
	}
}
