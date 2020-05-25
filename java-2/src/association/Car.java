package association;

//자동차 정보 : 모델명, 생산년도, 엔진정보 를 저장하기 위한 클래스
public class Car {
	private String modelName;
	private int productionYear;
	//private String engine;
	

	//엔진 정보(엔진 인스턴스)를 저장하기 위한 참조필드 -> 포함관계
	//관계가 성립되기 위해서는 반드시 참조필드에 인스턴스가 ★저장★되어야함
	private Engine engine;//거꾸로 엔진은 자동차를 사용할 수 없음
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String modelName, int productionYear, Engine engine) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.engine = engine;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void carDisplay() {
		System.out.println("모델명 = " +modelName);
		System.out.println("생산 년도 = " + productionYear);
		//System.out.println("엔진정보 = " + engine);
		//엔진정보는 엔진클래스에서 가져와야함
		//포함관계가 성립된 클래스의 메소드를 호출하도록한다
		//=>(참조필드에 저장된 인스턴스를 이용하여 메소드 호출)
		//=>참조필드에 인스턴스가 저장되지 않은 상태로 메소드를 호출할 경우 nullpointerException을 발생
		//nullpointerException : 참조변수에 null이 저장된 상태에서 메소드를 호출한 경우 발생되는 에러
		System.out.println("엔진 정보 >> ");
		System.out.println("연료타입 = " + engine.getFualType());
		System.out.println("배기량 = " + engine.getDisplacement());
	}
	
	
	
}
