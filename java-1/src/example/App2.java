package example;

public class App2 {
	public static void main(String[] args) {
		// 245678초를 일시분초 형식으로 변환하여 출력하세요.
		int cho = 245678;

		int sec = cho % 60;
		int sec_tmp = cho / 60;
		int min = sec_tmp % 60;
		int min_tmp = sec_tmp / 60;
		int hour = min_tmp % 24;
		int hour_tmp = min_tmp / 24;
		int day = hour_tmp % 24;

		System.out.println(cho + "초 >> " + day + " 일  " + hour + " 시간  " + min + " 분  " + sec + " 초 ");
		System.out.println("===================================");

		// 한대의 가격이 1억 5천만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요.
		// 단, 15대 이상 구매할 경우 1대당 25% 할인율을 적용하여 계산하세요.
		double one_cost = 150_000_000;
		int how_many = 20;

		if (how_many >= 15) {
			one_cost = one_cost * 0.75;
			System.out.print(how_many + " 대의 비행기를 구매할 경우 1대당 25%의 할인을 받아 ");
		} else {
			System.out.print(how_many + " 대의 비행기를 구매할 경우 ");
		}
		long result = (long) (one_cost * how_many);
		System.out.println(result + "원 을 지불하시면 됩니다. ");
		System.out.println("===================================");
	}
}