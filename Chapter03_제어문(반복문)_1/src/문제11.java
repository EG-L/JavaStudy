//1~100 3의 배수이고 5의 배수 출력
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1;i<101;i++) {
			if((i%3==0)&&(i%5==0))System.out.printf("%d\t",i);
		}

	}

}
