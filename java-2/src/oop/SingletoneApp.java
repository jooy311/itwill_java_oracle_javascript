package oop;

public class SingletoneApp {
	//싱글톤에서는 참조변수를 만들지 않는 것을 권장.
	public static void main(String[] args) {
		//인스턴스를 생성하여 참조변수에 저장
		//참조변수에 저장된 인스턴스로 메소드를 호출
		//-> 지속적인 사용을 위해서
		Singletone st =  Singletone.getInstance();
		st.display();
		
		//인스턴스를 생성하여 메소드 호출 = 단편전인 사용을 위한 방법
		//new Singletone().display();//인스턴스가 계속 만들어지면 메모리를 차지하게 됨
		
		//여러개해도 똑같은 인스턴스가 반환됨
		//->따라서 아래와같이 참조변수를 여러개 만드는것이 불필요하다.
		Singletone stt =  Singletone.getInstance();
		Singletone sttt = Singletone.getInstance();
		
		System.out.println("stt = " + stt);
		System.out.println("sttt = " + sttt);
		System.out.println("====================================");
		
		//싱글톤 클래스는 참조변수 없이 인스턴스를 반환받아 메소드를 호출
		Singletone.getInstance().display();
		Singletone.getInstance().display();
		System.out.println("====================================");
	}
}
