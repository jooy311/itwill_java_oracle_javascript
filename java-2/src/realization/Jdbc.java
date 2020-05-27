package realization;

//클래스가 반드시 상속받아야 하는 기능
//->상속받은 자식클래스의 메소드 작성규칙을 제공
public interface Jdbc {

	void insert();

	void update();

	void select();

	void delete();

}