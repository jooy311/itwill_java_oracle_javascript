package site.itwill.lang;

import java.util.Scanner;

//Ű����� ��Ģ������� �Է¹޾� �������� ����ϴ� ���α׷�
// ����� �Է� >> 20 + 10   1.������ (+/*-) �ǿ����� �̾����. 2.�ٸ��������̸� �ȵ� 3.
// [���] 30
// => �Է¿���Ŀ� ���� �����ڴ� ��Ģ�����ڸ� �����ϴ�(*/+-)
// => ���Ŀ� ���� �ʴ� ������� �Է��� ��� �����޼��� ��� �� ���α׷��� ����
// => �Է¿������ ������ �ԷµǾ ó���ǵ��� ����

public class ConsoleCalculaterApp {
   public static void main(String[] args) {

      char oper[] = { '+', '*', '/', '-' }; // ������� �ϴ� �迭�� ��´�.
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

      // �Է¿���Ŀ� ���� ��ȿ�� �˻��
      for (int i = 0; i < oper.length; i++) {// oper�� �迭�� ũ�⸸ŭ ���鼭
         seq = str.indexOf(oper[i]);// �������� ��ġ�� �˾Ƴ���
         if (seq == -1)
            continue;// oper�迭�ȿ� �����ڰ� ���ٸ� continue�� �Ѱ��ش�.
         if (seq != -1 && seq != 0) {// �迭�ȿ� �����ڰ� �ִٸ�(oper�� �� �ϳ��� ������, �տ���ġ���� �ʴ´ٸ�(������ȣ - ����)
            operation = oper[i];// �� �����ڰ� �������� ����
            break;// �׸��� ���� (��� ����, -1�� ��� ���ŵǱ� ����)
         }

      }

      // ���� �����ڰ� ���� �տ� �ְų� ���� �ڿ� ������ ���α׷� ���� + �ٸ� ������� ������(seq == -1 �ϰ���)���α׷� ����
      if (seq == 0 || seq == -1 || seq == oper.length || seq == 33) {
         System.out.println("[Error] �����ڰ� ���ų�, �߸��� ��ġ�� ����Ǿ��ֽ��ϴ�. �ٽ� ���� �ۼ��� �ּ���. ���α׷��� �����մϴ�.");
         System.exit(0);
      }

      // �������� ��ġ ���� � ���ڰ� �ִ��� Ȯ��.
      first_num = str.substring(0, seq);
      second_num = str.substring(seq + 1);

      // �����ڿ� �ǿ����ڸ� �и��Ͽ� �����
       try {

      first = Integer.parseInt(first_num);
      second = Integer.parseInt(second_num);
      //System.out.println(second);

       } catch (NumberFormatException e) {
          System.out.println("[Error] ���������ڷ� ������� �ۼ����ּ���. ���α׷��� �����մϴ�.");
          System.exit(0);
      }
       
      // ������ ���� ������� �����Ͽ� ����� ����
      if (operation == '+') {
         result = first + second;
      } else if (operation == '-') {
         result = first - second;
      } else if (operation == '*') {
         result = first * second;
      } else if (operation == '/') {
         if (second == 0) {
            System.out.println("[Error] 0���� ���� �� �����ϴ�.. ���α׷��� �����մϴ�.");
            System.exit(0);
         }
         result = first / second;
      }
      // ����� ���
      System.out.println("[���] " + result);

   }
}