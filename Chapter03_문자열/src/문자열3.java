import java.util.Scanner;
//문자열 입력을 받아서 A,a가 몇개인지 확인
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String data = sc.next();
		
		int a_count = 0;//a || A 의 합계
		//charAt => 문자를 한 개씩 자르는 경우 사용
		//"Hello" 01234 ==> charAt(5) => 오류
		for(int i =0;i<data.length();i++) {
			if(data.charAt(i)=='a'||data.charAt(i)=='A') a_count+=1;
		}
		
		System.out.println("A||a의 합계 : "+a_count);

	}

}
