//두개의 주사위를 던졌을 때 눈의 합이 6이 되는 경우의 수를 출력
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1,5  2,4 3,3 4,2 5,1
		for(int i = 1;i<6;i++) {
			System.out.printf("[%d,%d]\t",i,6-i);
		}
		
		for(int i = 1; i<=6;i++) {
			for(int j = 1; j<=6;j++) {
				if(i+j==6) System.out.printf("[%d, %d]",i,j);
			}
		}

	}

}
