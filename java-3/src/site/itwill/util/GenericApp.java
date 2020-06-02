package site.itwill.util;

//제네릭 필드가 선언된 클래스로 인스턴스를 생성하여 사용하는 프로그램
//=> 제네릭 대신 전달된 클래스 인스턴스만 저장이 가능함(다른거는 절대 안됨)
//=> 객체 형변환을 하지 않아도 필드값을 반환받아 사용가능 ->제내릭을 쓰는 이유
public class GenericApp {
	public static void main(String[] args) {
		//제네릭 클래스(인터페이스)를 사용할 경우, 제네릭 대신 사용될 클래스(인터페이스) 전달
		//해야만 사용이 가능함
		//제네릭 대신 전달된 클래스(인터페이스)가 필드의 자료형으로 
		Generic<Integer> g1 = new Generic<Integer>(); //Integer를 넣었으니까 int타입의 클래스가 됨
		
		g1.setField(100);
		//제내릭 대신 전달된 클래스의 인스턴스가 아닌 경우 필드의 저장불가능 하므로 에러발생
		
		int g1Value = g1.getField().intValue(); //형변환을 할 필요가 없어짐
		System.out.println("정수값 = " + g1Value);
		System.out.println("====================================");
		
		Generic<Double> g2 = new Generic<Double>();
		
		g2.setField(72.34);
		double g2Value = g2.getField().doubleValue();
		System.out.println("실수값 = " + g2Value);
		System.out.println("====================================");
		
		Generic<String> g3 = new Generic<String>();
		
		g3.setField("홍길동");
		String g3Value = g3.getField().toString();
		System.out.println("문자열 = " + g3Value);
		
	}
}
