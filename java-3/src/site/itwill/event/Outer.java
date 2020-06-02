package site.itwill.event;

//외부 클래스 (outer 클래스) : 내부클래스가 선언된 클래스
//=> 내부 클래스로 인스턴스를 생성하여 필드와 메소드에 접근가능
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
		
		//내부클래스를 이용하여 인스턴스 생성
		//=> 생성된 인스턴스를 이용하여 필드와 메소드접근가능
		Inner inner = new Inner(100);
		inner.innerDisplay();
	}

	// 내부클래스 (inner 클래스) : 클래스 안에 선언된 클래스 cf)메소드안에 클래스 선언도 가능
	// => 외부클래스에 선언된 필드와 메소드에 접근이 가능
	// => 외부클래스에서만 인스턴스를 생성할 수 있는 클래스
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
		
		//이너클래스는 아우터클래스의 메소드를 가져다 사용 가능
		public void innerOuterDisplay() {
			outerDisplay();
		}
	}
	
	
	//내부정적클래스.....외부에는 static절대 붙을 수 없음
	// 클래스 안에 선언된 정적클래스 
	//=> 외부클래스에 선언된 필드와 메소드에 접근 불가능
	//=> 외부클래스에 선언된 정적필드와 정적메소드에는 접근 불가능
	// => 다른 클래스에서도 인스턴스 생성이 가능한 클래스
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
