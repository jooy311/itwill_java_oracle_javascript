package site.itwill.exception;


//����Ŭ���� ExceptionŬ������ ��ӹ޾� �ۼ�.
public class PasswordMIssMatchException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public PasswordMIssMatchException() {
		// TODO Auto-generated constructor stub
	}
	
	//���ܸ޼����� ���޹޾� �θ�Ŭ������ �ʵ忡 �ʱⰪ���� �����ϴ� ������
	public PasswordMIssMatchException(String message) {
		//�θ�Ŭ������ �����ڸ� ȣ���Ͽ� �ʱ�ȭ �۾�
		super(message);
	}
	
	
	
}
