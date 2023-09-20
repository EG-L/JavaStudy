/*
 *   ★★★★★
 *   ★★★★★
 *   ★★★★★
 *   ★★★★★
 *   
 *   줄수 별표
 *    1   5
 *    2   5
 *    3   5
 *    4   5
 *   줄수
 *     for(int i =1 ;i<=4;i++){
 *          for(int j = 1;j<6;j++)
 *          {
 *              System.out.print("★");
 *          }
 *          System.out.println();
 *     }
 *     
 *     ABCDE
 *     FGHIJ
 *     KLMNO
 *     PQRST
 *     --------
 *     
 *     ABCDE
 *     ABCDE
 *     ABCDE
 *     ABCDE
 *     
 *     ★☆☆☆
 *     ☆★☆☆
 *     ☆☆★☆
 *     ☆☆☆★
 * */
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i =1 ;i<=4;i++){
//			for(int j = 1;j<6;j++){
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		char c = 'A';
//		for(int i = 1;i<5;i++) {
//			for(int j = 1;j<=5;j++) {
//				System.out.print(c);
//				c++;
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i<5;i++) {
//			for(char c='A';c<='E';c++) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i = 1; i<5;i++) {
//			char c = 'A';
//			for(int j = 1;j<=5;j++) {
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
		
		for(int i =1;i<5;i++) {
			for(int j = 1;j<5;j++) {
				if(j==i)System.out.print("★");
				else System.out.print("☆");
			}
			System.out.println();
		}

	}

}
