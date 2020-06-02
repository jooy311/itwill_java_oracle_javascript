package site.itwill.util;

public class ExtendsGenericApp {
	public static void main(String[] args) {
		ExtendsGeneric<Integer> eg1 = new ExtendsGeneric<Integer>();
		
		eg1.setField(100);
		int eg1V = eg1.getField().intValue();
		System.out.println("정수형 = " + eg1V);

		
		ExtendsGeneric<Double> eg2 = new ExtendsGeneric<Double>();
		eg2.setField(78.32);
		double eg2V = eg2.getField().doubleValue();
		System.out.println("실수형 = " + eg2V);
		
		//String은 Number클래스를 상속받지 않아 에러가 발생
//		ExtendsGeneric<String> eg3 = new ExtendsGeneric<Double>();
//		eg2.setField(78.32);
//		System.out.println("실수형 = " + eg2);
		
	}
}
