package site.itwill.lang;

import java.util.Scanner;

//키보드로 사칙연산식을 입력받아 연산결과를 출력하는 프로그램
// 연산식 입력 >> 20 + 10   1.연산자 (+/*-) 피연산자 이어야함. 2.다른연산자이면 안됨 3.
// [결과] 30
// => 입력연산식에 사용될 연산자는 사칙연산자만 가능하다(*/+-)
// => 형식에 맞지 않는 연산식을 입력할 경우 에러메세지 출력 후 프로그램을 종료
// => 입력연산식의 공백이 입력되어도 처리되도록 구현

public class ConsoleCalculaterApp2 {
   public static void main(String[] args) {

  
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
      
      sc.close();
      
      
     // char oper[] = { '+', '*', '/', '-' }; // 연산식을 일단 배열에 담는다.
      String[] oper = {"+", "*", "/", "-"} ;
      
      //연산식에서 연산자를 검색하여 연산자의 시작위치를 반환
      int index = -1;
      for(String tmp : oper) {
    	  //lastIndexOf : 저장된 문자열을 뒤에서부터 검색하여 존재하는 경우 시작 첨자를 반환 
    	  index = tmp.lastIndexOf(tmp);
    	  if(index != -1) { //연산자가 검색된 경우 반복문 탈출
    		  break;
    	  }
      }
      
      // 만약 연산자가 제일 앞에 있거나 제일 뒤에 있으면 프로그램 종료 + 다른 연산식을 썼을때(seq == -1 일것임)프로그램 종료
      if(index <= 0 || index >= oper.length -1) {
    	  System.out.println("연산식을 잘못입력했습니다.");
    	  System.exit(0);
      }
      
      int num1 = Integer.parseInt(str.substring(0,index));
      int num2 = Integer.parseInt(str.substring(index+1));
      String operater = str.substring(index, index+1);
      
      switch(operater) {
      case "+" :
    	  result = num1 + num2;
    	  break;
      case "-" :
    	  result = num1 - num2;
    	  break;
      case "*":
    	  result = num1 * num2;
      case "/" :
    	  result = num1 / num2;
    	  break;
    	  
      }
      System.out.println("[결과] " + result);
   }
}