package oop;

//�л�����(�й�,�̸�,����,����,����)�� �����ϱ� ���� Ŭ����
public class Student {
	//�ν��Ͻ� �ʵ� : �ν��Ͻ��� �����Ǵ� �ʵ�(�ν��Ͻ��� �����Ͽ� ���)
	private String num;
	private String name;
	private int kor,eng,tot;
	//�л� ���� �հ踦 �����ϱ� ���� �ʵ� - �����ʵ�
	//�����ʵ�(Static Field) : Ŭ������ �޸𸮿� �ε��� �� �����Ǵ� �ʵ�
	// => �ν��Ͻ��ʹ� �����ϰ� �̸� �ϳ��� �����Ͽ� ��� �ν��Ͻ��� �����Ͽ� ���
	// => �����ڿ��� �ʱⰪ �������� �ʰ� ���� �ʱⰪ ����
	private static int total=0;
	
	//������
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String num, String name, int kor, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		//������ ����Ͽ� �ʵ忡 �����ϴ� ��� >> �޼ҵ� ȣ��
		//tot=kor+eng;
		calcTot();
	}

	//Getter & Setter
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		calcTot();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		calcTot();
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}
	
	//���� �޼ҵ�(Static Method) : this�� �������� �ʴ� �޼ҵ�
	// => �ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼ҵ� ���� �Ұ���
	// => ���� �ʵ�(Static Field) ���� ����
	public static int getTotal() {
		//���� �ʵ� �Ǵ� ���� �޼ҵ�� Ŭ������ �̿��Ͽ� ���
		//return Student.total;
		return total;
	}

	public static void setTotal(int total) {
		Student.total = total;
	}
	
	//Business �޼ҵ�
	/*
	public void calcTot() {
		tot=kor+eng;
	}
	*/

	//�ý��� �޼ҵ� : Ŭ���� ���ο����� ȣ���Ͽ� ����ϴ� �޼ҵ�
	private void calcTot() {
		tot=kor+eng;
	}
	
	public void display() {
		System.out.println(name+"["+num+"]���� ���� >> ");
		System.out.println("���� = "+kor+", ���� = "+eng+", ���� = "+tot);
	}
}







