package realization;

//인터페이스는 다른 인터페이스를 상속받아 작성가능
//=>extends키워드를 이용해서 상속처리
public interface BoatCar extends Car, Boat {
	void floating();
}
