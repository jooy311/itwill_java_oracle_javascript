package example;

public class App1
{
   public static void main(String[] args) {
      // 문자변수에 저장된 문자값을 출력하세요.
      // 단, 저장된 문자값이 알파벳 소문자인 경우 대문자로 변환하여 출력하세요.
      char mun = 'h';
      if (mun >= 'A' && mun <= 'Z')
         System.out.println(mun);
      else
         System.out.println((char)(mun - 32));

      System.out.println("============================================");

      // 정수변수에 저장된 정수값이 4의 배수인지 아닌지를 구분하여 출력하세요.
      int num = 345644;
      if (num % 4 == 0)
         System.out.println(num + "은 4의 배수입니다");
      else
         System.out.println(num + " 은 4의 배수가 아닙니다.");

      System.out.println("============================================");

      // 올해가 평년인지 윤년인지를 구분하여 출력하세요.
      // => 년도를 4로 나누어 나머지가 0인 경우 윤년
      // => 위 조건을 만족하는 년도 중 100으로 나누어 나머지가 0인 경우 평년
      // => 위 조건들을 만족하는 년도 중 400으로 나누어 나머지가 0인 경우 윤년
      int year = 2020; String str = " ";
      if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
    	  str = "윤년";
      }else str = "평년";
      System.out.println(year + " 은 " + str +" 입니다.");
      System.out.println("============================================");

      // 이름이 "홍길동"인 학생의 시험성적은 국어 87점, 영어 93점, 수학 80점입니다.
      // 학생의 시험성적에 대한 총점과 평균, 평균에 대한 학점을 계산하여
      // 이름, 총점, 평균, 학점을 출력하세요.
      // => 국어, 영어, 수학 점수 중 하나라도 0~100 범위가 아닌 경우 프로그램 종료 : System.exit(0);
      // => 평균에 대한 학점 : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
      // => 평균은 소숫점 2자리까지만 출력되도록 하고 나머지를 내림처리 하세요.

      String name = "홍길동";
      int kor = 87; 
      int eng = 93; 
      int math = 80;
      char grade ;
      float ave = (float) ((int)((kor + eng + math)/0.03) * 0.01);
      if(kor < 0 || kor >100 || eng < 0 || eng >100 || math < 0 || math >100) System.exit(0);
      if(ave >=90) grade = 'A';
      else if(ave <=89 && ave >=80) grade = 'B';
      else if(ave <= 79 && ave >= 70) grade = 'C';
      else if(ave <= 69 && ave >= 60) grade = 'D';
      else grade = 'F';
      System.out.println(name + " 학생은 " + " 평균 : " + ave + " 이며, 학점은 " + grade +" 입니다.");
      
      System.out.println("============================================");
   }
}