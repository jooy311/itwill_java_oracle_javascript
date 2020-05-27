package realization;

public class WolfHumanApp {
	public static void main(String[] args) {
		WolfHuman wh = new WolfHuman();
		
		wh.speak();
		wh.walk();
		wh.smile();
		
		wh.change();
		wh.cryLoudly();
		wh.fastWalk();
		System.out.println("===========================");
		
		//부모클래스로 참조변수 생성하고, 자식클래스로 인스턴스를 생성하여 저장
		//참조변수는 부모인스턴스의 메소드만 접근이 가능하다.
		//객체형변환을 이용하면 자식인스턴스의 메소드 접근가능
		Human h = new WolfHuman();//부모가 두개(Human class하나, 실체없는 Wolf하나)
		h.smile();
		h.speak();
		h.walk();
		System.out.println("===========================");
		
		//명시적 객체 형변환을 이용하여 자식인스턴스의 메소드에 접근
		((WolfHuman)h).change();
		
		//인터페이스를 이용하여 참조변수 생성가능
		//자식인스턴스를 생성하여 저장하능
		Wolf w = new WolfHuman();
		w.cryLoudly();
		w.fastWalk();
		
		//자식클래스가 같은 클래스 또는 인터페이스는 서로 명시적 객체형변환을 이용하여 저장가능
		Wolf wolf = (Wolf)h;
		
		//묵시적 객체 형변환에 의해 오버라이드 선언된 자식메소드가 호출
		wolf.cryLoudly();
		wolf.fastWalk();
		
	}
}
