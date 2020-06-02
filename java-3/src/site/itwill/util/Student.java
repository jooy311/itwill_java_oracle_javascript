package site.itwill.util;

//�ν��Ͻ� �ʵ尪�� ���ϱ� ���ؼ��� Comparable<T> �������̽��� ��ӹ޾� ����ϸ� ��
//=> ���׸����� ���ϰ��� �ϴ� �ν��Ͻ��� Ŭ������ �����Ͽ� �ۼ�
//=> CompareTo(T o) �޼ҵ带 �������̵� �������־���Ѵ�.

//�л�����(�й�,�̸�)�� �����ϱ� ���� Ŭ���� - VO(Value Object) Ŭ����
public class Student implements Comparable<Student> {
	private int num;
	private String name ;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[�й� = " + num + " , �̸� = " + name + "]";
				
	}

	//�����ϱ� ���� �� ����� ���������� ��ȯ�ϴ� �޼ҵ�
	//=>this�� �ʵ尪�� �Ű������� �ʵ尪�� ���� �����Ͽ� ������� ��ȯ.
	//=> Collections.sort�޼ҵ带 ����ϸ� �޼ҵ� ���ο��� ȣ��Ǿ� ������ ���ذ��� �����Ѵ�.
	//=> ��ȯ���� ����� ���, List�ν��Ͻ��� ��Ҹ� ���� �ٲپ� ����
	@Override
	public int compareTo(Student o) {
		//return this.num - o.num; // �й� : ��������
		//return o.num - this.num; // �й� : ��������
		return this.name.compareTo(o.name); //�̸����� ��������(���)
		//return -(this.name.compareTo(o.name)); 
	}
}
