package association;

public class CarApp {
	public static void main(String[] args) {
		Engine ticoEngine=new Engine();
		ticoEngine.setFualType("����");
		ticoEngine.setDisplacement(1000);
		
		Car tico=new Car();
		//tico.carDisplay();
			
		tico.setModelName("Ƽ��");
		tico.setProductionYear(2018);
		//Engine �ν��Ͻ��� �����Ͽ� �����ʵ忡 ����(����) - ���԰��� ����
		tico.setEngine(ticoEngine);
		
		tico.carDisplay();
		System.out.println("=======================================");
		Car sonata=new Car("�Ÿ", 2020, new Engine("�ֹ���", 2000));
		sonata.carDisplay();
		System.out.println("=======================================");
		System.out.println(tico.getModelName()+"�� �������� >> ");
		ticoEngine.engineDisplay();
		System.out.println("=======================================");
		System.out.println(sonata.getModelName()+"�� �������� >> ");
		//�����ʵ忡 ����� Engine �ν��Ͻ��� ��ȯ�޾� �޼ҵ� ȣ��
		sonata.getEngine().engineDisplay();
		System.out.println("=======================================");
	}
}













