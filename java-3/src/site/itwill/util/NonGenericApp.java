package site.itwill.util;

//Object 필드가 선언된 클래스로 인스턴스를 생성하여 사용하는 프로그램
// => 필드에 모든 인스턴스를 전달하여 저장 가능 - 포함
//=> 필드에 저장된 인스턴스를 반환받아 사용할 경우 반드시 명시적 객체형변환을 해야한다.
public class NonGenericApp {
	public static void main(String[] args) {
		NonGeneric ng1=new NonGeneric();
		
		//Integer 인스턴스를 전달하여 Object 필드에 저장
		//ng1.setField(new Integer(100));
		ng1.setField(100);//오토박싱
		
		//필드값은 무조건 Object 인스턴스로 반환 - Object 클래스의 메소드만 호출 가능
		// => 명시적 객체 형변환을 을 이용하여 자식 인스턴스의 메소드 호출 가능
		int ng1Value=((Integer)ng1.getField()).intValue();
		
		//명시적 객체 형변환을 잘못할 경우 ClassCastException 발생
		//int ng1Value=((Double)ng1.getField()).intValue();
		
		System.out.println("정수값 = "+ng1Value);
		System.out.println("======================================");
		NonGeneric ng2=new NonGeneric();
		
		//Double 인스턴스를 전달하여 Object 필드에 저장
		ng2.setField(12.34);
		
		//★instanceof★ 연산자를 이용하여 명시적 객체 형변경에 대한 검증 작업
		if(ng2.getField() instanceof Double) {
			double ng2Value=((Double)ng2.getField()).doubleValue();
			System.out.println("실수값 = "+ng2Value);
		}
		
		
		System.out.println("======================================");
		NonGeneric ng3=new NonGeneric();
		
		//String 인스턴스를 전달하여 Object 필드에 저장
		ng3.setField("홍길동");
		
		if(ng3.getField() instanceof String) {
			String ng3Value = ((String)ng3.getField()).trim();
			System.out.println("문자열= " + ng3Value);
		}
		System.out.println("======================================");
	}
}
