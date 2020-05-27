package inheritance;

public class CarApp {
	public static void main(String[] args) {
		Car car=new Car("홍길동", "싼타페");
		
		System.out.println("소유주 = "+car.getUserName());
		System.out.println("모델명 = "+car.getModelName());
		System.out.println("======================================");
		//Object 클래스는 Car 클래스의 부모클래스이기 때문에 메소드 호출 가능
		//Car 클래스에 Object 클래스의 toString() 메소드를 오버라이드 선언
		// => Object 클래스의 toString() 메소드 대신 Car 클래스의 toString() 메소드 호출
		System.out.println("car.toString() >> "+car.toString());
		
		//참조변수에 저장된 인스턴스 정보를 출력할 경우 자동으로 
		//Object 클래스의 toString() 메소드가 호출되어 결과값 출력
		System.out.println("car >> "+car);
		System.out.println("======================================");
		String name="임꺽정";

		//String 클래스에서 Object 클래스의 toString() 메소드를 오버라이드 선언
		// => String 인스턴스에 저장된 문자열을 반환받아 출력할 경우 호출하여 사용
		//System.out.println("이름 = "+name.toString());
		System.out.println("이름 = "+name);
		System.out.println("======================================");
	}
}














