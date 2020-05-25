package association;

//�ڵ��� ���� : �𵨸�, ����⵵, �������� �� �����ϱ� ���� Ŭ����
public class Car {
	private String modelName;
	private int productionYear;
	//private String engine;
	

	//���� ����(���� �ν��Ͻ�)�� �����ϱ� ���� �����ʵ� -> ���԰���
	//���谡 �����Ǳ� ���ؼ��� �ݵ�� �����ʵ忡 �ν��Ͻ��� ������ڵǾ����
	private Engine engine;//�Ųٷ� ������ �ڵ����� ����� �� ����
	
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
		System.out.println("�𵨸� = " +modelName);
		System.out.println("���� �⵵ = " + productionYear);
		//System.out.println("�������� = " + engine);
		//���������� ����Ŭ�������� �����;���
		//���԰��谡 ������ Ŭ������ �޼ҵ带 ȣ���ϵ����Ѵ�
		//=>(�����ʵ忡 ����� �ν��Ͻ��� �̿��Ͽ� �޼ҵ� ȣ��)
		//=>�����ʵ忡 �ν��Ͻ��� ������� ���� ���·� �޼ҵ带 ȣ���� ��� nullpointerException�� �߻�
		//nullpointerException : ���������� null�� ����� ���¿��� �޼ҵ带 ȣ���� ��� �߻��Ǵ� ����
		System.out.println("���� ���� >> ");
		System.out.println("����Ÿ�� = " + engine.getFualType());
		System.out.println("��ⷮ = " + engine.getDisplacement());
	}
	
	
	
}
