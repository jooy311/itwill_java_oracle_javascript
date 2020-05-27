package realization;

//클래스는 extends키워드를 이용하여 상속처리(단일상속)
//인터페이스는 implements키워드를 이용하여 상속처리(다중상속)
//상속받은 인텋페이스의 모든 추상메소드를 반드스 오버라이드 선언
public class WolfHuman extends Human implements Wolf {
	@Override
	public void cryLoudly() {
		System.out.println("[늑대] 큰소리를 울을 수 있는 능력");
		
	}
	
	@Override
	public void fastWalk() {
		System.out.println("[늑대] 네발로 빠르게 달릴 수 있는 능력");
		
		
	}
	
	public void change() {
		System.out.println("[늑대인간] 변신할 수 있는 능력");
	}
}
