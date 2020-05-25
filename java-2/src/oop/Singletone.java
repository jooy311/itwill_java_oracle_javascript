package oop;
//①②③④⑤

//싱글톤 디자인 패턴을 적용하여 작성한 클래스 - 싱글톤 클래스
//->프로그램에 인스턴스를 ★하나만★ 제공하기 위한 클래스
public class Singletone {

	//현재 클래스의 인스턴스를 정보를 저장하기 위한 필드선언
	//시스템필드(클래스 내부에서만 사용하는 필드)는 언더바로 표현 -> setter getter메소드를 만들지 말라는 뜻임
//	private static Singletone _istance = new Singletone(); -> 별로 권장하지 않는 방법임
	private static Singletone _instance; //클래스가 로드되면서 이 필드가 생성됨
	
	//정적영역(Static Block) : 클래스가 메모리에 로딩된 후 자동실행될 수 있도록 하는 영역
	//->여기에서 초기화 작업을 할 수 있음
	//-> 정적영역의 명령은 단 한번만 실행된다.
	static {
		//이렇게 영역을 만들면 다양하게 초기화가 가능함
		_instance = new Singletone(); //인스턴스가 만들어져 저장되어짐
	}
	
	//생성자를 은닉화 처리 - 인스턴스 생성불가함
	private Singletone() {
		// TODO Auto-generated constructor stub
	}
	
	//시스템필드에 저장된 인스턴스 정보를 반환하는 메소드다
	public static Singletone getInstance() {
		//static 영역을 쓰지 않고 아래와 같은 방법도 있다.(하지만 자바에서는 static영역을 만드는 것이 나음)
		/*if(_instance == null)
		 * 		_instance = new Singletone();
		 * */
		return _instance;//여기서 이제 인스턴스를 반환하게 됨
	}
	public void display() {
		System.out.println("Singletone 클래스의 display()메소드를 호출합니다.");
	}

}
