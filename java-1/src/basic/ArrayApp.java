package basic;

public class ArrayApp {
	public static void main(String[] args) {
		//배열을 생성하여 창조변수에 저장
		//자료형[] 변수명 = new 자료형[요소갯수];
		//=>자료형[] : 배열 자료형을 이용하여 참조변수를 생성할 수 있음
		//new 자료형[요소갯수] : 자료형의 값을 갯수개 만큼 저장 가능
		//배열 요소는 자동으로 초기화가 된다.
		int[] arr = new int[3];
		System.out.println("num = " + arr);
		System.out.println("=========================");
		
		//참조변수에 저장된 배열정보와 첨자를 이용하여 배열 요소 표현
		//첨자[index] :배열요소를 구분하는 고유값(0부터 시작)
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("=========================");

		int index = 0;
		arr[index] = 10; //0번지 요소에 10을 저장시켜라
		//요소의 첨자를 변수 또는 연산식을 이용 가능
		System.out.println(arr[0]);
		arr[index +1] = 20;
		arr[index +2] = 30;
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("=========================");
		
		//for구문을 이용하여 배열의 일괄처리
		for(int i=0; i<3; i++) {
			System.out.println("num[" + i + "] = " + arr[i]);
		
		}
		System.out.println("=========================");
		
		//배열을 생성하여 참조변수에 저장 - 요소에 웒는 초기값을 저장
		//int n = new int[] {}
		//int[] = {} 로하면 heap에 저장되는 것이 아니라 static에 저장되게 된다.(그렇기 때문에
		//간단한 경우에 사용
		//나열된 초기값의 갯수만큼의 요소를 가진 배열이 생성된다
		
		int[] su = new int[] {13,20,21,22,33};//스프링 할때 자주 쓰는 방식
		
		//반복지시자를 이용하여 배열요소값을 차례대로 제공받아 변수에 저장한다
		for(int tmp : su) {
			System.out.println(tmp);
		}
		System.out.println("=========================");
		
		int[] sum = {54,88,99,45,65,29,16,48,43};
		int tot = 0;
		for(int i=0; i<sum.length; i++) {
			tot += sum[i];
		}
		System.out.println(tot);
		System.out.println("=========================");
		
		//배열에 존재하는 요소값 중 30-60범위의 정수값이 몇개인지 출력
		int cnt = 0;
		for(int i=0; i<sum.length; i++) {
			if(sum[i] >=30 && sum[i] <=60) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
