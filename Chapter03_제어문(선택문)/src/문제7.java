/*
 * 7) 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
   (switch~case 사용) 
 * */
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("+,-,*,/ 입력 : ");
		op = sc.next().charAt(0);
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();
		
		switch(op) {//정수,문자,문자열
			case '+':
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case '*':
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case '-':
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case '/':
				switch(num2) {
						case 0:
							System.out.println(num2+"로 나눌 수 없습니다.");
							break;
						default:
							System.out.println(num1+"/"+num2+"="+(num1/num2));
					}
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}

	}

}
