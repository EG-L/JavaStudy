//총 페이지
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공 개수 : ");
		int basketball = sc.nextInt();
//		System.out.print("필요한 상자의 수 : ");
//		System.out.println(basketball%5==0?basketball/5:((basketball/5)+1));
		System.out.println("필요한 박스:"+(int)(Math.ceil(basketball/5.0)));

	}

}
