//1~30까지 출력 => 짝수만 출력
/*
 *   2 4 6
 *   8 10 12
 *   
 * */
public class 제어문_반복문11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i = 2; i<=30; i+=2) {
			System.out.printf("%2d\t",i);
			cnt+=1;
			if(cnt%3==0) {
				System.out.println();
			}
		}

	}

}
