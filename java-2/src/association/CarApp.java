package association;

public class CarApp {
	public static void main(String[] args) {
		Engine ticoEngine = new Engine();
		ticoEngine.setFualType("����");
		ticoEngine.setDisplacement(1000);
		
		Car tico = new Car();
		
		tico.setModelName("Ƽ��");
		tico.setProductionYear(2018);
		
		//���� �ν��Ͻ��� �����Ͽ� ���������� ����(����)
		tico.setEngine(ticoEngine);
		tico.carDisplay();
		System.out.println("==================================");
		
		Car sonata = new Car("�ҳ�Ÿ", 2020, new Engine("�ֹ���", 2000));
		sonata.carDisplay();
		System.out.println(tico.getModelName()+ "�� �������� >> ");
		tico.getEngine();
		System.out.println("===================================");
		System.out.println(sonata.getModelName()+ "�� �������� >> ");
		//�����ʵ忡 ����� ���� �ν��Ͻ��� ��ȯ�Ͽ� �޼ҵ� ȣ��
		sonata.getEngine().engineDisplay();
		System.out.println("===================================");
		System.out.println("");
	}
}
