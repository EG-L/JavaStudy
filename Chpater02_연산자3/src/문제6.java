import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		/*
		 * "ABC"
		 *  012
		 *  charAt(0) => 첫번째 값
		 *  charAt(1) => 두번째 값 
		 * */
		System.out.println("ch="+c);
		boolean b = ((c>='a'&&c<='z') ||(c>='A'&&c<='Z')||(c>='0'&&c<='9')?true:false);
		System.out.println("b = "+b);
		
	}

}
