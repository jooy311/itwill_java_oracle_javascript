package oop;

//학생정보를 저장하기위한 클래스
//학번, 이름, 국어, 영어, 총점을 저장
public class Student {
	// 인스턴스 필드 : 인스턴스마다 생성되는 필드임(인스턴스로 접근하여 사용)
	private String num;
	private String name;
	private int kor, eng, tot;
	//학생총점 합계를 저장하기 위한 필드
	//->객체갯수와 상관없이딱 한개만 만들어지면 되기 때문에 static사용 
	//->생성자에서 초기화되지 않고 ★직접 초기값 생성
	private static int total = 0;//this is 정적필드 -> 클래스가 메모리에 로드될때 만들어짐

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
		
		//총점을 계산하여 필드에 저장하는 명령
		//tot = kor + eng; ->이렇게 쓰기 보다 메소드를 호출하는 것이 나음
		calcTot(); //★생성자에 미리 선언을 해놓으면 따로 메소드를 호출을 일일이 하지 않아도됨
	}
	//총점은 계산하여 저장

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
	
	//인스턴스 필드 또는 인스턴스 메소드 접근불가능
	public static int getTotal() { //static메소드 : this가 존재하지 않는 메소드
		//정적필드 또는 정적 메소드는 클래스를 이용하여 사용한다
		return Student.total;
	}

	public static void setTotal(int total) {
		Student.total = total;
	}
	//실제 일을하는 비즈니스 메소드
	//그리고 이 메소드는 클래스 내부에서만 사용될 것이므로 private로 잠궈두기
	//●이것을 시스템메소드 라고 한다
	private void calcTot() {
		tot = kor + eng;
	}
	
	public void display() {
		System.out.println(name + "[" + num + "] 님의 성적 >> " );
		System.out.println("국어 = " +kor + " 영어 = " + eng + " 총점 = " +tot);
		System.out.println(total);
	}

}
