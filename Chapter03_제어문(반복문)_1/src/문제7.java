//1~10까지의 숫자 중 3의 배수를 제외하고 출력
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<11;i++) {
			if(i%3==0) continue;
			System.out.printf("%d ",i);
		}

	}

}
