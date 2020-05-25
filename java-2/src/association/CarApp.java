package association;

public class CarApp {
	public static void main(String[] args) {
		Engine ticoEngine = new Engine();
		ticoEngine.setFualType("경유");
		ticoEngine.setDisplacement(1000);
		
		Car tico = new Car();
		
		tico.setModelName("티코");
		tico.setProductionYear(2018);
		
		//엔진 인스턴스를 생성하여 참조변수에 저장(변경)
		tico.setEngine(ticoEngine);
		tico.carDisplay();
		System.out.println("==================================");
		
		Car sonata = new Car("소나타", 2020, new Engine("휘발유", 2000));
		sonata.carDisplay();
		System.out.println(tico.getModelName()+ "의 엔진정보 >> ");
		tico.getEngine();
		System.out.println("===================================");
		System.out.println(sonata.getModelName()+ "의 엔진정보 >> ");
		//참조필드에 저장된 엔진 인스턴스를 반환하여 메소드 호출
		sonata.getEngine().engineDisplay();
		System.out.println("===================================");
		System.out.println("");
	}
}
