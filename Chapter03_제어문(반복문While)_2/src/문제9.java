//0~12까지의 2의 배수,3의 배수의 합
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a2=0,a3=0;
		for(int i = 0; i<13;i++) {
			if(i%2==0) a2+=i;
			if(i%3==0) a3+=i;
		}
		
		System.out.printf("2의 배수 합 : %d, 3의 배수 합 : %d",a2,a3);

	}

}
