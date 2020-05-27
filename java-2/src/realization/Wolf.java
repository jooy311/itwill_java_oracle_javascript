package realization;

//상수필드와 추상메소드만 선언가능한 자료형
public interface Wolf {
	//인터페이스는 추상메소드만 선언가능하므로 public abstract지정자 생략 가능
	public abstract void cryLoudly();
	public abstract void fastWalk();
}
