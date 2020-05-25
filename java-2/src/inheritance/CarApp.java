package inheritance;

public class CarApp {
	public static void main(String[] args) {

		Car car = new Car("홍길동", "산타페");

		System.out.println("소유주 = " + car.getUserName());
		System.out.println("차이름 = " + car.getModelName());
		System.out.println("================================================");
		
		//Car클래스는 Car클래스의 부모클래스인 Object클래스를 상속했기 때문에 메소드 호출이 가능하다.
		// Car클래스의 Object 클래스의 toString()메소드 오버라이드를 선택하면
		//=> Object클래스의 toString()메소드 대신 Car클래스의 toString()메소드가 호출된다.
		System.out.println("car.toString() = " + car.toString());
		//참조변수에 저장된 인스턴스를 출려할 경우 자동으로 Object클래스 toString 메소드가 호출된다.
		System.out.println("car =  " + car);//위의 코드와 같은 결과물이 출력된다.
		
		
		//display를 쓰지않고 toString()메소드를 사용하여 필드값을 확인한다 대부분....~_~
		
		//String클래스에서 Object클래스의 toString() 메소드를 오버라이드 선언
		//=> String 인스턴스에 저장된 문자열을 반환받아 출력할 경우 호출
		String name = "임꺽정";
		System.out.println("이름 = " + name.toString()); //toString을 굳이 사용하지 않아도된다. 
	}
}
