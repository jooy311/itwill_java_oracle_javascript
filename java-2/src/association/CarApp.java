package association;

public class CarApp {
	public static void main(String[] args) {
		Engine ticoEngine=new Engine();
		ticoEngine.setFualType("경유");
		ticoEngine.setDisplacement(1000);
		
		Car tico=new Car();
		//tico.carDisplay();
			
		tico.setModelName("티코");
		tico.setProductionYear(2018);
		//Engine 인스턴스를 생성하여 참조필드에 저장(변경) - 포함관계 성립
		tico.setEngine(ticoEngine);
		
		tico.carDisplay();
		System.out.println("=======================================");
		Car sonata=new Car("쏘나타", 2020, new Engine("휘발유", 2000));
		sonata.carDisplay();
		System.out.println("=======================================");
		System.out.println(tico.getModelName()+"의 엔진정보 >> ");
		ticoEngine.engineDisplay();
		System.out.println("=======================================");
		System.out.println(sonata.getModelName()+"의 엔진정보 >> ");
		//참조필드에 저장된 Engine 인스턴스를 반환받아 메소드 호출
		sonata.getEngine().engineDisplay();
		System.out.println("=======================================");
	}
}













