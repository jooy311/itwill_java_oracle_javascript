package oop;

//참조가 목적인 클래스
//여기다 출력을 하기 보다는 프로그램만 만드는것이 좋음
public class Method {
	
	//refactor기능을 이용하여 식별자를 변경할 수 있다(alt + shift + r)을 누르면됨
	//->이래야 전체 변경을 할 수 있음
	void displayOne() {
		System.out.println("method클래스의 디스플레이() 메소드 호출");
	}
	
	void displayTwo() {
		System.out.println("Method클래스의 display()메소드를 호출");
	}
	
	void printOne() {
		int tot = 0;
		for(int i=1; i<100; i++) {
		tot+=i;
			
		}
		System.out.println("범위에 해당하는 점수 합계는?" + tot);
	}
	
	void printTwp(int n) {
		int tot = 0;
		for(int i=1; i<=n; i++) {
			tot += i;
			
		}
		System.out.println("범위에 해당하는 점수 합계는?" + tot);
	}
	
	int printThree(int n, int b) {
		//매개변수
		if(n > b) { //비정상적인 값이 전달되어 저장된 경우
			System.out.println("[에러] 첫번째 전달값이 두번째 전달값보다 큽니다");
			
			//메소드를 강제로 종료시키는 명령어
			//=>임의의 정수값을 무조건 반환해야 함
			return 0;
		}
		
		int tot = 0;
		for(int i=n; i<=b; i++) {
			tot += i;
			
		}//System.out.println(n + " 와 " + b + " 범위에 해당하는 점수 합계는?" + tot);
		return tot;
	}
	
	int returnTot(int s, int k) {
		int tot = 0;
		for(int i=s; i<=k; i++) {
			tot += i;
			
		}
		//return명령을 이용하여 메소드 명령의 실행 결과값을 반환
		//->반환되는 결과값의 자료형과 메소드 반환형으로 선언
		return tot;
	}
	
	
	//전달값이 홀수인 경우 false반환 
	//짝수인경우 true반환
	boolean isOdd(int num) {
		if(num % 2 == 0) {
			return true;
		}else return false;
	}
		
	
	//객체를 반환하는 메소드
	String getHello(String name) {
		
		return name + " 님 안녕하세요~";
	}
	
	
	int[] getArray() {
		int [] array = {10,20,30,40,55};
		return array;
		//return new int[] = {10....} 이렇게 반환해주어도 됨
	}
	
	int sumOne(int n1, int n2, int n3) {
		//세개의 매개변수에정수값을 전달받아 합계를 계산하여 반환하는 메소드
		//매개변수에 값이 정상적으로 전달되지 않은 경우 메소드로 호
		return n1+n2+n3;
	}
	
	int sumTwo(int[] arr) {
		int tot = 0;
		for(int num : arr) {
			tot += num;
		}
		return tot;
	}
	
	//값을 0개이상 전달받아 배열형식으로 사용이 가능하다
	//배열을 만들지 않아도 배열로 인식됨
	int sumThree(int... param) {
		int tot = 0;
		for(int num : param) {
			tot += num;
		}
		return tot;
	}
}
