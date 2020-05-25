package basic;

public class TwoArrayApp {
	public static void main(String[] args) {
		int[][] n = new int[2][3];
		
		System.out.println("n = " + n);

		System.out.println("=======================");
		
		System.out.println("n의 size = " + n.length);
		System.out.println("n의 size = " + n[0].length);
		System.out.println("n의 size = " + n[1].length);
		System.out.println("=======================");
		
		System.out.println("n[0] = " + n[0]);
		System.out.println("n[0] = " + n[1]);
		System.out.println("=======================");
		System.out.println("n[0] = " + n[0][0]);
		System.out.println("n[0] = " + n[0][1]);
		System.out.println("n[0] = " + n[0][2]);
		System.out.println("n[0] = " + n[1][0]);
		System.out.println("n[0] = " + n[0][1]);
		System.out.println("n[0] = " + n[0][2]);
		System.out.println("=======================");
		
		for(int i = 0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.println("n["+i+"]"+"["+j+"] = " + n[i][j]);
			}
		}
		
		int[][] su = {{10,20,30}, {40,50,60}};
		
		for(int[] arr : su) {
			for(int a : arr)
				System.out.print(a + " ");
			System.out.println();
		}
		System.out.println("=======================");
		
		//일차원 배열이 존재하지 않는 이차원 배열을 생성했다.
		int[][] number = new int[3][];
		
		//일차원 배열을 생성하여 이차원 배열 요소에 저장하도록한다.
		//일차원 배열에 요소값이 없으므로 자동적으로 null이 된다
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		
		//일차원 배열을 생성하여 2차원 배열 요소에 저장 : 가변배열 -> 다차원 배열에서만 가능
		//1차원 배열의 요소의 갯수를 다르게 선언하여 생성가능
		number[0] = new int[3];
		number[1] = new int[2];
		number[2] = new int[4];
		
		for(int i=0; i<number.length; i++) {
			int val = 0;
			for(int j=0; j < number[i].length; j++) {
				val += 10;
				number[i][j] = val;
				System.out.println("number["+i+"]"+"["+j+"] = " + number[i][j]);
			}
		}
		
	}
}
