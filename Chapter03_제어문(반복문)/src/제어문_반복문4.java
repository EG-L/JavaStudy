// 1~100까지 => 3의 배수의 합, 5의 배수 합, 7의 배수의 합 => 출력
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int three=0,five=0,seven=0;
		
		for(int i =1;i<101;i++) {
			if(i%3==0) three+=i;//15
			if(i%5==0) five+=i;//15
			if(i%7==0) seven+=i;
		}
		System.out.printf("3의 배수의 합 : %d, 5의 배수의 합 : %d, 7의 배수의 합 : %d",three,five,seven);

	}

}
