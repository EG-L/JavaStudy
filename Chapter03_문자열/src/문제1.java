import java.util.Scanner;
/*

 * */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력(10~99) : ");
		int num = sc.nextInt();
		
		if((num%10)==(num/10)) System.out.println("10의 자리와 1의 자리가 같습니다.");
		else System.out.println("10의 자리와 1의 자리가 다릅니다.");

	}

}
