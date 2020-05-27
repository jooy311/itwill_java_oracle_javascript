package example;

public class VariableExample {
	public static void main(String[] args) {
		//가로의 길이가7이고 세로의 길이가 10인 사각형이 존재할 경우
		//사각형의 넓이를 계산하여 출력하세요~
		int a = 7;
		int b = 10;
		int ans = a * b;
		System.out.println("사각형의 넓이 : "+ ans);
		System.out.println("======================================");
		
		//높이가 9이고 밑변의 길이가 7인 삼각형의 넓이를 계산하여라
		int h = 9;
		int w = 7;
		double result = (double)(h*w)/2;
		System.out.println("삼각형의 넓이 : "+result);
		System.out.println("======================================");
		
		//10명의 전체 몸무게가 759키로인경우 평균 몸무게를 구하여라
		int weight = 759;
		int cnt = 10;
		double ave = (double)weight/cnt;
		System.out.println("평균 몸무게 : " + ave);
		System.out.println("======================================");
		
		//이름이 홍길동인 학생이 국어점수 89점, 영어 93점, 수학 95점을 받은경우
		//총점과 평균을 계산하여 이름, 총점, 평균을 출력
		//단 평균을 소수점 한자리 까지 출력하고 나머지는 절삭
		int kor = 89, eng = 93, math = 95;
		int total = kor + eng + math;
		float avee = (float)total/3;
		String name = "홍길동";
		System.out.print(name + " 총점 : " + total + ", 평균 : ");
		System.out.println((int)(avee * 10)/10.0);
		
	}
}
