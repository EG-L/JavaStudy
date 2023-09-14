import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공 개수 : ");
		int basketball = sc.nextInt();
		
		System.out.println(basketball%5==0?"필요한 상자의 수 : "+basketball/5:"필요한 상자의 수 : "+((basketball/5)+1));

	}

}
