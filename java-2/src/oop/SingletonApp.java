package oop;

public class SingletonApp {
	public static void main(String[] args) {
		/*
		//인스턴스를 생성하여 참조변수에 저장 - 지속적인 사용을 목적
		// => 참조변수에 저장된 인스턴스로 메소드 호출
		Singleton singleton=new Singleton();
		singleton.display();
		
		//인스턴스를 생성하여 메소드 호출 - 단편적인 사용을 목적
		new Singleton().display();
		new Singleton().display();
		*/

		/*
		Singleton s1=new Singleton();
		Singleton s2=new Singleton();
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		*/
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("=======================================");
		s1.display();
		s2.display();
		System.out.println("=======================================");
		//싱글톤 클래스는 참조변수 없이 인스턴스를 반환받아 메소드 호출
		Singleton.getInstance().display();
		Singleton.getInstance().display();
		System.out.println("=======================================");
	}
}








