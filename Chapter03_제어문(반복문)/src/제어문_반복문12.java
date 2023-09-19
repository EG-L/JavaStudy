/*
 * 주사위 2개를 던져서 합이 6이 나올 경우수를 출력하시오.
 * */
public class 제어문_반복문12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//15 24 33 42 51
		// 5/36
		
		for(int i =1;i<=5;i++) {
			System.out.printf("[%d , %d]\n",i,6-i);
		}
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j == 6) {
					System.out.printf("[%d , %d]\n",i,j);
				}
			}
		}

	}

}
