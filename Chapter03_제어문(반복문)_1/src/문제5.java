//1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라.
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=30;i++) {
			if(i%2==0) {
				System.out.printf("%2d\t",i);
			}
			if(i%6==0) {
				System.out.println();
			}
			
		}
	}

}
