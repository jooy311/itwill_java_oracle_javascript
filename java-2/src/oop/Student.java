package oop;

//�л������� �����ϱ����� Ŭ����
//�й�, �̸�, ����, ����, ������ ����
public class Student {
	// �ν��Ͻ� �ʵ� : �ν��Ͻ����� �����Ǵ� �ʵ���(�ν��Ͻ��� �����Ͽ� ���)
	private String num;
	private String name;
	private int kor, eng, tot;
	//�л����� �հ踦 �����ϱ� ���� �ʵ�
	//->��ü������ ������̵� �Ѱ��� ��������� �Ǳ� ������ static��� 
	//->�����ڿ��� �ʱ�ȭ���� �ʰ� ������ �ʱⰪ ����
	private static int total = 0;//this is �����ʵ� -> Ŭ������ �޸𸮿� �ε�ɶ� �������

	// constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int kor, int eng, String name, String num) {
		super();
		this.eng = eng;
		this.kor = kor;
		this.name = name;
		this.num = num;
		
		//������ ����Ͽ� �ʵ忡 �����ϴ� ���
		//tot = kor + eng; ->�̷��� ���� ���� �޼ҵ带 ȣ���ϴ� ���� ����
		calcTot(); //�ڻ����ڿ� �̸� ������ �س����� ���� �޼ҵ带 ȣ���� ������ ���� �ʾƵ���
	}
	//������ ����Ͽ� ����

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	//-----------------------------

	public String getName() {
		return name;
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

	public void setName(String name) {
		this.name = name;
	}
	//-----------------------------
	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}
	
	//�ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼ҵ� ���ٺҰ���
	public static int getTotal() { //static�޼ҵ� : this�� �������� �ʴ� �޼ҵ�
		//�����ʵ� �Ǵ� ���� �޼ҵ�� Ŭ������ �̿��Ͽ� ����Ѵ�
		return Student.total;
	}

	public static void setTotal(int total) {
		Student.total = total;
	}
	//���� �����ϴ� ����Ͻ� �޼ҵ�
	//�׸��� �� �޼ҵ�� Ŭ���� ���ο����� ���� ���̹Ƿ� private�� ��ŵα�
	//���̰��� �ý��۸޼ҵ� ��� �Ѵ�
	private void calcTot() {
		tot = kor + eng;
	}
	
	public void display() {
		System.out.println(name + "[" + num + "] ���� ���� >> " );
		System.out.println("���� = " +kor + " ���� = " + eng + " ���� = " +tot);
		System.out.println(total);
	}

}
