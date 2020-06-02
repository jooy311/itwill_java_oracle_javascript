package site.itwill.lang;

import java.util.Scanner;

//키보드로 사칙연산식을 입력받아 연산결과를 출력하는 프로그램
// 연산식 입력 >> 20 + 10   1.연산자 (+/*-) 피연산자 이어야함. 2.다른연산자이면 안됨 3.
// [결과] 30
// => 입력연산식에 사용될 연산자는 사칙연산자만 가능하다(*/+-)
// => 형식에 맞지 않는 연산식을 입력할 경우 에러메세지 출력 후 프로그램을 종료
// => 입력연산식의 공백이 입력되어도 처리되도록 구현

public class ConsoleCalculaterApp {
   public static void main(String[] args) {

      char oper[] = { '+', '*', '/', '-' }; // 연산식을 일단 배열에 담는다.
      int result = 0;// 결과를 출력하는 변수
      String first_num, second_num;
      int first = 0;
      int second = 0;

      char operation = ' ';// 연산자를 저장하는 변수
      int seq = 33;

      // 키보드로 연산식 입력
      Scanner sc = new Scanner(System.in);

      System.out.print("연산식 입력 >> ");

      String str = sc.nextLine(); // 입력받는다.

      str = str.trim();
      str = str.replace(" ", "");

      // 입력연산식에 대한 유효성 검사★
      for (int i = 0; i < oper.length; i++) {// oper의 배열의 크기만큼 돌면서
         seq = str.indexOf(oper[i]);// 연산자의 위치를 알아내고
         if (seq == -1)
            continue;// oper배열안에 연산자가 없다면 continue로 넘겨준다.
         if (seq != -1 && seq != 0) {// 배열안에 연산자가 있다면(oper가 꼭 하나는 있으며, 앞에위치하지 않는다면(음수부호 - 때문)
            operation = oper[i];// 그 연산자가 무엇인지 저장
            break;// 그리고 종료 (계속 돌면, -1로 계속 갱신되기 떄문)
         }

      }

      // 만약 연산자가 제일 앞에 있거나 제일 뒤에 있으면 프로그램 종료 + 다른 연산식을 썼을때(seq == -1 일것임)프로그램 종료
      if (seq == 0 || seq == -1 || seq == oper.length || seq == 33) {
         System.out.println("[Error] 연산자가 없거나, 잘못된 위치에 선언되어있습니다. 다시 식을 작성해 주세요. 프로그램을 종료합니다.");
         System.exit(0);
      }

      // 연산자의 위치 전에 어떤 숫자가 있는지 확인.
      first_num = str.substring(0, seq);
      second_num = str.substring(seq + 1);

      // 연산자와 피연산자를 분리하여 저장★
       try {

      first = Integer.parseInt(first_num);
      second = Integer.parseInt(second_num);
      //System.out.println(second);

       } catch (NumberFormatException e) {
          System.out.println("[Error] 정수형숫자로 연산식을 작성해주세요. 프로그램을 종료합니다.");
          System.exit(0);
      }
       
      // 연산자 따른 연산식을 구현하여 결과를 저장
      if (operation == '+') {
         result = first + second;
      } else if (operation == '-') {
         result = first - second;
      } else if (operation == '*') {
         result = first * second;
      } else if (operation == '/') {
         if (second == 0) {
            System.out.println("[Error] 0으로 나눌 수 없습니다.. 프로그램을 종료합니다.");
            System.exit(0);
         }
         result = first / second;
      }
      // 결과를 출력
      System.out.println("[결과] " + result);

   }
}