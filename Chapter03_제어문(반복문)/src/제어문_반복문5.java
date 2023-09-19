//1~100까지 5의 배수의 합과 개수 출력
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a5=0,a_num=0;
		
		for(int i =1;i<101;i++) {
			if(i%5==0) {
				a5+=i;
				a_num+=1;
			}
		}
		
		System.out.printf("5의 배수의 합 : %d, 개수 : %d",a5,a_num);

	}

}
