package example;

public class MultiForExample {
	public static void main(String[] args) {
		// ¡Ú¡Ú¡Ú¡Ú¡Ú
		// ¡Ú¡Ú¡Ú¡Ú
		// ¡Ú¡Ú¡Ú
		// ¡Ú¡Ú
		// ¡Ú
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		System.out.println("============================================");

		// ¡Ú¡Ú¡Ú¡Ú¡Ú
		// ¡Ù¡Ú¡Ú¡Ú¡Ú
		// ¡Ù¡Ù¡Ú¡Ú¡Ú
		// ¡Ù¡Ù¡Ù¡Ú¡Ú
		// ¡Ù¡Ù¡Ù¡Ù¡Ú

		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print("¡Ù");
			}
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("¡Ú");
			}
			System.out.println();
		}

		System.out.println("============================================");
		// 	¡Ú1
		// ¡Ú¡Ú¡Ú3
		// ¡Ú¡Ú¡Ú¡Ú¡Ú5
		// ¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú
		// ¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú
		//        ¡Ú        
		//      ¡Ú¡Ú¡Ú      
		//    ¡Ú¡Ú¡Ú¡Ú¡Ú    
		//  ¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú  
		//¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú
		int count = 1; int s = 5;
		for(int k = 1;k<=5; k++) {//Çà
			for(int i = 1; i <=5; i++) {
				if(i == s) {
					for(int j = 1; j <=count; j++) {
						System.out.print("¡Ú");			
					}
					s--;
					count+=2;
				}else System.out.print("  ");
			}System.out.println();
		
		}
		
		/*int cnt = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= cnt; j++) {
				System.out.print("¡Ú");
			}
			cnt += 2;
			System.out.println();
		}*/

		System.out.println("============================================");
		// ¡Ú¡Ù¡Ù¡Ù¡Ú1,5
		// ¡Ù¡Ú¡Ù¡Ú¡Ù2,4
		// ¡Ù¡Ù¡Ú¡Ù¡Ù3
		// ¡Ù¡Ú¡Ù¡Ú¡Ù
		// ¡Ú¡Ù¡Ù¡Ù¡Ú
		int start = 1;
		int end = 5;
		for (int k = 1; k <= 5; k++) {
			for (int i = 1; i <= 5; i++) {
				if (i == start || i == end) {
					System.out.print("¡Ú");
				} else
					System.out.print("¡Ù");

				// if(start == end)break;
			}
			start++;
			end--;
			System.out.println();
		}
		System.out.println("============================================");
	}
}