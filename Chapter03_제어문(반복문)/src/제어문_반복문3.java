// 1~100 => 루프 변수
// 총합 , 짝수의 합, 홀수의 합 => 누적 변수
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0, odd_num = 0, even_num=0;
		for(int i = 1; i<101;i++) {
			// => 0 => 장바구니 => 결제금액
			total+=i;
//			System.out.println("sum="+total+",i="+i);
			if(i%2==0) even_num+=i; //짝수 누적 합
			else odd_num+=i;//홀수 누적 합
		}
		System.out.printf("총합 : %d, 짝수 합 : %d, 홀수 합 : %d",total,even_num,odd_num);

	}

}
