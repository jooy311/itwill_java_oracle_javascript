package inheritance;

//자동차 정보(소유자 이름, 모델명)를 저장하기 위한 클래스
// => 부모클래스가 없는 클래스는 기본적으로 Object 클래스 상속
public class Car /* extends Object */ {
	private String userName;
	private String modelName;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String userName, String modelName) {
		super();
		this.userName = userName;
		this.modelName = modelName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	//필드값을 반환하여 확인하는 메소드로 활용하기 위해 오버라이드 선언
	@Override
	public String toString() {
		return "소유주 = "+userName+", 모델명 = "+modelName;
	}
}





