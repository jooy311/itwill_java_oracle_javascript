package realization;

//Ŭ������ extendsŰ���带 �̿��Ͽ� ���ó��(���ϻ��)
//�������̽��� implementsŰ���带 �̿��Ͽ� ���ó��(���߻��)
//��ӹ��� �ζ����̽��� ��� �߻�޼ҵ带 �ݵ彺 �������̵� ����
public class WolfHuman extends Human implements Wolf {
	@Override
	public void cryLoudly() {
		System.out.println("[����] ū�Ҹ��� ���� �� �ִ� �ɷ�");
		
	}
	
	@Override
	public void fastWalk() {
		System.out.println("[����] �׹߷� ������ �޸� �� �ִ� �ɷ�");
		
		
	}
	
	public void change() {
		System.out.println("[�����ΰ�] ������ �� �ִ� �ɷ�");
	}
}
