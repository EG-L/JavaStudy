//1~100까지 정수 4의 배수의 합
public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a4 = 0;
		
		for(int i = 1; i<101;i++) {
			if(i%4==0) a4+=i;
		}
		System.out.println("4의 배수의 합 : "+a4);

	}

}
