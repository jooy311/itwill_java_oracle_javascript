package site.itwill.util;

//인스턴스 필드값을 비교하기 위해서는 Comparable<T> 인터페이스를 상속받아 사용하면 됨
//=> 제네릭에서 비교하고자 하는 인스턴스의 클래스를 전달하여 작성
//=> CompareTo(T o) 메소드를 오버라이드 선언해주어야한다.

//학생정보(학번,이름)를 저장하기 위한 클래스 - VO(Value Object) 클래스
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
		return "[학번 = " + num + " , 이름 = " + name + "]";
				
	}

	//정렬하기 위한 비교 결과를 정수값으로 반환하는 메소드
	//=>this의 필드값과 매개변수의 필드값을 빼기 연산하여 결과값을 반환.
	//=> Collections.sort메소드를 사용하면 메소드 내부에서 호출되어 정렬의 기준값을 제공한다.
	//=> 반환값이 양수인 경우, List인스턴스의 요소를 서로 바꾸어 저장
	@Override
	public int compareTo(Student o) {
		//return this.num - o.num; // 학번 : 오름차순
		//return o.num - this.num; // 학번 : 내림차순
		return this.name.compareTo(o.name); //이름으로 오름차순(양수)
		//return -(this.name.compareTo(o.name)); 
	}
}
