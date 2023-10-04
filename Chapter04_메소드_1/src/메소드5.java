//사칙연산 => 메소드 4 + 조립기 => 5개
import java.util.Scanner;
//정수 2개 => 연산자 1개
public class 메소드5 {
	//반복 제거
	public static int user_input(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg+" 정수 입력 : ");
		return sc.nextInt();
	}
	public static char opInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자 입력(+,-,*,/) : ");
		return sc.next().charAt(0);
	}
	public static void process() {
		int num1 = user_input("첫 번째");
		int num2 = user_input("두 번째");
		char op = opInput();
		
		switch(op) {
			case '+':
				// 리턴형 : int , 매개변수 : int , int
				System.out.printf("%d%s%d=%d",num1,op,num2,(num1+num2));
				break;
			case '-':
				System.out.printf("%d%s%d=%d",num1,op,num2,(num1-num2));
				break;
			case '*':
				System.out.printf("%d%s%d=%d",num1,op,num2,(num1*num2));
				break;
			case '/':
				// 리턴형 : String , 매개변수 : int, int
				if(num2==0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else {
					System.out.printf("%d%s%d=%.2f",num1,op,num2,(num1/(double)num2));
				}
				break;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
	}

}
