package oop;

public class MainArgApp {
	public static void main(String[] args) {
		System.out.println("전달된 문자열의 갯수 = " + args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = " + args[i]);
		}
	}
}
