package realization;

public class WolfHumanApp {
	public static void main(String[] args) {
		WolfHuman wh = new WolfHuman();
		
		wh.speak();
		wh.walk();
		wh.smile();
		
		wh.change();
		wh.cryLoudly();
		wh.fastWalk();
		System.out.println("===========================");
		
		//�θ�Ŭ������ �������� �����ϰ�, �ڽ�Ŭ������ �ν��Ͻ��� �����Ͽ� ����
		//���������� �θ��ν��Ͻ��� �޼ҵ常 ������ �����ϴ�.
		//��ü����ȯ�� �̿��ϸ� �ڽ��ν��Ͻ��� �޼ҵ� ���ٰ���
		Human h = new WolfHuman();//�θ� �ΰ�(Human class�ϳ�, ��ü���� Wolf�ϳ�)
		h.smile();
		h.speak();
		h.walk();
		System.out.println("===========================");
		
		//����� ��ü ����ȯ�� �̿��Ͽ� �ڽ��ν��Ͻ��� �޼ҵ忡 ����
		((WolfHuman)h).change();
		
		//�������̽��� �̿��Ͽ� �������� ��������
		//�ڽ��ν��Ͻ��� �����Ͽ� �����ϴ�
		Wolf w = new WolfHuman();
		w.cryLoudly();
		w.fastWalk();
		
		//�ڽ�Ŭ������ ���� Ŭ���� �Ǵ� �������̽��� ���� ����� ��ü����ȯ�� �̿��Ͽ� ���尡��
		Wolf wolf = (Wolf)h;
		
		//������ ��ü ����ȯ�� ���� �������̵� ����� �ڽĸ޼ҵ尡 ȣ��
		wolf.cryLoudly();
		wolf.fastWalk();
		
	}
}
