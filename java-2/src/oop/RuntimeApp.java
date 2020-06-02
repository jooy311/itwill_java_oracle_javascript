package oop;

//Runtime : Java 프로그램을 실행하는 JVM 관련 정보를 저장하기 위한 클래스
// => Runtime 클래스는 인스턴스를 생성하지 못하고 반환받아 사용

//싱글톤 클래스(Singleton Class) : 프로그램에 하나의 인스턴스를 제공할 목적으로 작성된 클래스
// => 싱글톤 디자인 패턴을 적용하여 작성된 클래스
public class RuntimeApp {
	public static void main(String[] args) {
		//Runtime 클래스의 생성자는 은닉화 선언되어 new 연산자로 인스턴스 생성 불가능
		//Runtime runtime=new Runtime();
		
		//Runtime.getRuntime() : Runtime 인스턴스를 반환하는 메소드
		// => 동일한 인스턴스 반환 - 하나의 인스턴스만을 반환
		// => 반환된 인스턴스를 참조변수에 저장하지 않고 사용
		Runtime runtime1=Runtime.getRuntime();
		Runtime runtime2=Runtime.getRuntime();
		
		System.out.println("runtime1 = "+runtime1);
		System.out.println("runtime2 = "+runtime2);
		
		//반환된 인스턴스를 참조변수에 저장하지 않고 사용
		System.out.println("Runtime.getRuntime() = "+Runtime.getRuntime());
		System.out.println("=======================================");
		System.out.println("청소 전 사용 메모리 크기 = "
				+(Runtime.getRuntime().totalMemory()
						-Runtime.getRuntime().freeMemory())+"Byte");
		
		//Runtime.getRuntime().gc();//Garbage Collector 실행
		System.gc();
		
		System.out.println("청소 후 사용 메모리 크기 = "
				+(Runtime.getRuntime().totalMemory()
						-Runtime.getRuntime().freeMemory())+"Byte");
		System.out.println("=======================================");
		
	}
}
