package basic;

public class VariableApp {
	public static void main(String[] args) {
		int su;//정수형 변수선언
		su = 100;//변수에 정수값을 저장
		
		System.out.print("기존 : ");//변수값 출력
		System.out.println(su);//변수값 출력
		//int su;//동일한 변수명을 재선언할 경우
		su = 200;
		System.out.print("변경값 : ");//기존값을 제거되고 새로운 값으로 덮어씌움
		System.out.println(su);//기존값을 제거되고 새로운 값으로 덮어씌움
		System.out.println("=================");//기존값을 제거되고 새로운 값으로 덮어씌움
		int num = 100;
		System.out.println("num = " +num);//기존값을 제거되고 새로운 값으로 덮어씌움
		System.out.println("=================");//기존값을 제거되고 새로운 값으로 덮어씌움
		System.out.println(2+0+2+0+"년은 쥐띠해입니다.");//기존값을 제거되고 새로운 값으로 덮어씌움
		System.out.println(""+2+0+2+0+"년은 쥐띠해입니다.");//기존값을 제거되고 새로운 값으로 덮어씌움
		//동일한 자료형의 변수는 ,기호를 이용하여 나열 선언 가능함
		int num1 = 100,num2 = 200;
		
		System.out.println("연산 결과 = " + num1 + num2);
		System.out.println("연산 결과 = " + (num1 + num2));
		System.out.println("연산 결과 = " + num1 * num2);
		System.out.println("연산 결과 = " + (num1 * num2));//실행속도가 더 빠르다
		System.out.println("=================");
		int kor = 88; int eng = 90;
		int total = kor + eng;
		System.out.println("점수 합계 = " + total);//실행속도가 더 빠르다
		int number = 0;
		System.out.println("number = " + number);//변수에 값이 저장되어 있지 않은 경우에는 에러
	
	}
}
