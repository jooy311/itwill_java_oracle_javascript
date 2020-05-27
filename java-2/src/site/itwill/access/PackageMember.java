package site.itwill.access;


//package(dafault) 접근지정자 : 접근지정자 관련 키워드를 사용하지 않을 경우 = 클래스, 필드, 메소드
//같은 패키지의 클래스에서 접근이 가능함
//=>다른 패키지의 클래스에서 접근은 불가능함
//=>
public class PackageMember {
	int num;
	
	void display() {
		System.out.println("num = " + num);
	}
}
