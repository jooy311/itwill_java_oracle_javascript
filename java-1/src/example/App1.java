package example;

public class App1
{
   public static void main(String[] args) {
      // ���ں����� ����� ���ڰ��� ����ϼ���.
      // ��, ����� ���ڰ��� ���ĺ� �ҹ����� ��� �빮�ڷ� ��ȯ�Ͽ� ����ϼ���.
      char mun = 'h';
      if (mun >= 'A' && mun <= 'Z')
         System.out.println(mun);
      else
         System.out.println((char)(mun - 32));

      System.out.println("============================================");

      // ���������� ����� �������� 4�� ������� �ƴ����� �����Ͽ� ����ϼ���.
      int num = 345644;
      if (num % 4 == 0)
         System.out.println(num + "�� 4�� ����Դϴ�");
      else
         System.out.println(num + " �� 4�� ����� �ƴմϴ�.");

      System.out.println("============================================");

      // ���ذ� ������� ���������� �����Ͽ� ����ϼ���.
      // => �⵵�� 4�� ������ �������� 0�� ��� ����
      // => �� ������ �����ϴ� �⵵ �� 100���� ������ �������� 0�� ��� ���
      // => �� ���ǵ��� �����ϴ� �⵵ �� 400���� ������ �������� 0�� ��� ����
      int year = 2020; String str = " ";
      if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
    	  str = "����";
      }else str = "���";
      System.out.println(year + " �� " + str +" �Դϴ�.");
      System.out.println("============================================");

      // �̸��� "ȫ�浿"�� �л��� ���輺���� ���� 87��, ���� 93��, ���� 80���Դϴ�.
      // �л��� ���輺���� ���� ������ ���, ��տ� ���� ������ ����Ͽ�
      // �̸�, ����, ���, ������ ����ϼ���.
      // => ����, ����, ���� ���� �� �ϳ��� 0~100 ������ �ƴ� ��� ���α׷� ���� : System.exit(0);
      // => ��տ� ���� ���� : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
      // => ����� �Ҽ��� 2�ڸ������� ��µǵ��� �ϰ� �������� ����ó�� �ϼ���.

      String name = "ȫ�浿";
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
      System.out.println(name + " �л��� " + " ��� : " + ave + " �̸�, ������ " + grade +" �Դϴ�.");
      
      System.out.println("============================================");
   }
}