package realization;

//인터페이스는 다른 인터페이스를 상속받아 작성 가능
// => extends 키워드를 이용하여 상속 처리
// => 다중상속 가능
public interface BoatCar extends Car, Boat {
	void floating();
}
