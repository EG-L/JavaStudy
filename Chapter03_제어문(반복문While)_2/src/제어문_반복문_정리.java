/*
 *   2차 for
 *   -------
 *   for(초기값;조건식;증감식) ==> 줄수 (rows)
 *   {
 *     for(초기값;조건식;증감식) ==> 행수 (columns) => 실제 출력
 *     {        ---- 설정 (수열 = 방정식) => 수와 수의 관계
 *                       ----------- 분석 (넘파이,판다스)
 *                          Matplotlib => 시각화
 *                          R => 자바 연동 (Rserve)
 *        반복 수행 문장
 *     }
 *     System.out.println();
 *   }
 *   
 *   ==> 등수 구하기 , 빈도수 구하기 , 정렬(선택,버블) .. 
 *       
 *       *
 *      **
 *     ***
 *    ****
 *      i    j  k
 *     줄수  공백 별표
 *      1    3  1
 *      2    2  2
 *      3    1  3
 *      4    0  4  ==> k == i
 *     -------------
 *     i + j = 4 j = 4-i
 * */
public class 제어문_반복문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<5;i++) {
			for(int j = 1;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*          i   j   k
		 *         줄수 공백 별표
		 * ****     1   0   4
		 *  ***     2   1   3
		 *   **     3   2   2
		 *    *     4   3   1
		 *         k = 5-i;
		 *         j = i-1;
		 * */
		
		for(int i = 1; i<5;i++) {
			for(int j = 1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=5-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
