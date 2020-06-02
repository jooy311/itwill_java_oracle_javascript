package site.itwill.event;

//�ܺ� Ŭ���� (outer Ŭ����) : ����Ŭ������ ����� Ŭ����
//=> ���� Ŭ������ �ν��Ͻ��� �����Ͽ� �ʵ�� �޼ҵ忡 ���ٰ���
public class Outer {
	private int outerNum;

	public Outer() {
		// TODO Auto-generated constructor stub
	}

	public Outer(int outerNum) {
		super();
		this.outerNum = outerNum;
	}

	public int getOuterNum() {
		return outerNum;
	}

	public void setOuterNum(int outerNum) {
		this.outerNum = outerNum;
	}

	public void outerDisplay() {
		System.out.println("outerNum = " + outerNum);
	}
	
	public void outerInnerDisplay() {
		
		//����Ŭ������ �̿��Ͽ� �ν��Ͻ� ����
		//=> ������ �ν��Ͻ��� �̿��Ͽ� �ʵ�� �޼ҵ����ٰ���
		Inner inner = new Inner(100);
		inner.innerDisplay();
	}

	// ����Ŭ���� (inner Ŭ����) : Ŭ���� �ȿ� ����� Ŭ���� cf)�޼ҵ�ȿ� Ŭ���� ���� ����
	// => �ܺ�Ŭ������ ����� �ʵ�� �޼ҵ忡 ������ ����
	// => �ܺ�Ŭ���������� �ν��Ͻ��� ������ �� �ִ� Ŭ����
	public class Inner {
		private int innerNum;

		public Inner() {
			// TODO Auto-generated constructor stub
		}

		public Inner(int innerNum) {
			super();
			this.innerNum = innerNum;
		}

		public int getInnerNum() {
			return innerNum;
		}

		public void setInnerNum(int innerNum) {
			this.innerNum = innerNum;
		}
		
		public void innerDisplay() {
			System.out.println("innerNum = " + innerNum);
		}
		
		//�̳�Ŭ������ �ƿ���Ŭ������ �޼ҵ带 ������ ��� ����
		public void innerOuterDisplay() {
			outerDisplay();
		}
	}
	
	
	//��������Ŭ����.....�ܺο��� static���� ���� �� ����
	// Ŭ���� �ȿ� ����� ����Ŭ���� 
	//=> �ܺ�Ŭ������ ����� �ʵ�� �޼ҵ忡 ���� �Ұ���
	//=> �ܺ�Ŭ������ ����� �����ʵ�� �����޼ҵ忡�� ���� �Ұ���
	// => �ٸ� Ŭ���������� �ν��Ͻ� ������ ������ Ŭ����
	public static class Nested{
		private int nestedNum;
		
		public Nested() {
			// TODO Auto-generated constructor stub
		}

		public int getNestedNum() {
			return nestedNum;
		}

		public void setNestedNum(int nestedNum) {
			this.nestedNum = nestedNum;
		}

		public Nested(int nestedNum) {
			super();
			this.nestedNum = nestedNum;
		}
		
		public void nesteDisplay() {
			System.out.println("nestedNum = " + nestedNum);
			System.out.println();
		}
		
	}
}
