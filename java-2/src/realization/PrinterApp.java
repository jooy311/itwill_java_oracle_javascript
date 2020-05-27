package realization;

public class PrinterApp {
	public static void main(String[] args) {
		//기본메소드를 호출하기 위해서는 반드시 참조변수를 인터페이스로 생성해야함
		Printable printer1 = new PrinterSingle();
		
		//오버라이드선언하지 않은 경우 인터페이스의 기본 메소드를 호출
		printer1.scan();
		printer1.print();
		System.out.println("===============================================");
		
		Printable print2 = new PrinterMultiful();
		
		//오버라이드선언 한 경우 자식클래스의 오버라이드 메소드를 호출
		print2.scan();
		print2.print();
	}
}
