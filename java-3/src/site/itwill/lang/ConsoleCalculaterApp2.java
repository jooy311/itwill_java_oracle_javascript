package site.itwill.lang;

import java.util.Scanner;

//Ű����� ��Ģ������� �Է¹޾� �������� ����ϴ� ���α׷�
// ����� �Է� >> 20 + 10   1.������ (+/*-) �ǿ����� �̾����. 2.�ٸ��������̸� �ȵ� 3.
// [���] 30
// => �Է¿���Ŀ� ���� �����ڴ� ��Ģ�����ڸ� �����ϴ�(*/+-)
// => ���Ŀ� ���� �ʴ� ������� �Է��� ��� �����޼��� ��� �� ���α׷��� ����
// => �Է¿������ ������ �ԷµǾ ó���ǵ��� ����

public class ConsoleCalculaterApp2 {
   public static void main(String[] args) {

  
      int result = 0;// ����� ����ϴ� ����
      String first_num, second_num;
      int first = 0;
      int second = 0;

      char operation = ' ';// �����ڸ� �����ϴ� ����
      int seq = 33;

      // Ű����� ����� �Է�
      Scanner sc = new Scanner(System.in);

      System.out.print("����� �Է� >> ");

      String str = sc.nextLine(); // �Է¹޴´�.

      str = str.trim();
      str = str.replace(" ", "");
      
      sc.close();
      
      
     // char oper[] = { '+', '*', '/', '-' }; // ������� �ϴ� �迭�� ��´�.
      String[] oper = {"+", "*", "/", "-"} ;
      
      //����Ŀ��� �����ڸ� �˻��Ͽ� �������� ������ġ�� ��ȯ
      int index = -1;
      for(String tmp : oper) {
    	  //lastIndexOf : ����� ���ڿ��� �ڿ������� �˻��Ͽ� �����ϴ� ��� ���� ÷�ڸ� ��ȯ 
    	  index = tmp.lastIndexOf(tmp);
    	  if(index != -1) { //�����ڰ� �˻��� ��� �ݺ��� Ż��
    		  break;
    	  }
      }
      
      // ���� �����ڰ� ���� �տ� �ְų� ���� �ڿ� ������ ���α׷� ���� + �ٸ� ������� ������(seq == -1 �ϰ���)���α׷� ����
      if(index <= 0 || index >= oper.length -1) {
    	  System.out.println("������� �߸��Է��߽��ϴ�.");
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
      System.out.println("[���] " + result);
   }
}