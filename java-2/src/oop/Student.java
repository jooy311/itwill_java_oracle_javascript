package oop;

//학생정보(학번,이름,국어,영어,총점)를 저장하기 위한 클래스
public class Student {
	//인스턴스 필드 : 인스턴스에 생성되는 필드(인스턴스로 접근하여 사용)
	private String num;
	private String name;
	private int kor,eng,tot;
	//학생 총점 합계를 저장하기 위한 필드 - 정적필드
	//정적필드(Static Field) : 클래스가 메모리에 로딩될 때 생성되는 필드
	// => 인스턴스와는 무관하게 미리 하나만 생성하여 모든 인스턴스가 공유하여 사용
	// => 생성자에서 초기값 설정하지 않고 직접 초기값 설정
	private static int total=0;
	
	//생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String num, String name, int kor, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		//총점을 계산하여 필드에 저장하는 명령 >> 메소드 호출
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
	
	//정적 메소드(Static Method) : this가 존재하지 않는 메소드
	// => 인스턴스 필드 또는 인스턴스 메소드 접근 불가능
	// => 정적 필드(Static Field) 접근 가능
	public static int getTotal() {
		//정적 필드 또는 정적 메소드는 클래스를 이용하여 사용
		//return Student.total;
		return total;
	}

	public static void setTotal(int total) {
		Student.total = total;
	}
	
	//Business 메소드
	/*
	public void calcTot() {
		tot=kor+eng;
	}
	*/

	//시스템 메소드 : 클래스 내부에서만 호출하여 사용하는 메소드
	private void calcTot() {
		tot=kor+eng;
	}
	
	public void display() {
		System.out.println(name+"["+num+"]님의 성적 >> ");
		System.out.println("국어 = "+kor+", 영어 = "+eng+", 총점 = "+tot);
	}
}







