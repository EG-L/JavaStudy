//1~10 => 짝수만 출력
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for =====");
		for(int i = 1;i<11;i++) {
			if(i%2==0)System.out.print(i+" ");
		}
		System.out.println("\n===== while =====");
		int i =1;
		while(i<11) {
			if(i%2==0)System.out.print(i+" ");
			i++;
		}
		System.out.println("\n===== do~while =====");
		//초기값
		i = 1;
		do {
			if(i%2==0)System.out.print(i+" "); // 실행문장
			i++; // 증가식
		}while(i<11);
		// 반복문 안에 조건문 ....

	}

}
