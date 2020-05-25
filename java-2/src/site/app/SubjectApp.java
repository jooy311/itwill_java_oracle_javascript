package site.app;

//�ٸ� ��Ű���� Ŭ������ ���� ǥ���ϱ� ���� importŰ���带 ����Ͽ� ����
//Ŭ������ �Է��� ctrl space������ �ڵ� import��
//ctrl + shift + O import�߰� �Ǵ� ����
import site.itwill.com.*;
import site.uniwill.subject.NetworkSubject;
//��Ű���� �ٸ� ������ �̸��� Ŭ������ import�� �ȵȴ�
//import site.uniwill.subject.*;

public class SubjectApp {
	public static void main(String[] args) {
		//�ٸ� ��Ű���� Ŭ������ ����ϰ��� �� ��� ��Ű�� ���� �����ϴ� 
		//Ŭ���������� ǥ���ؾ߸� ���ٰ���
		site.itwill.com.OracleSubject subject1 = 
				new site.itwill.com.OracleSubject();
		subject1.display();
		
		//import ����� Ŭ������ ��Ű������ �����ϰ� Ŭ���������θ� ǥ���ص� ������ �����ϴ�
		NetworkSubject subject2 = new NetworkSubject();
		subject2.display();
		
		//�����̸��� Ŭ������ �ٸ� ��Ű���� ���� ����� ���, import��������
		JavaSubject subject3 = new JavaSubject();
		subject3.display();
		
		//import ������ �Ұ����� Ŭ������ ��� ��Ű������ ������ Ŭ������ ǥ��
		site.uniwill.subject.JavaSubject subject4 = new site.uniwill.subject.JavaSubject();
		subject4.display();
	}
}
