import java.util.Scanner;
// 리턴값을 받는 경우
public class 메소드3 {
	public static int plus(int a, int b) {
		System.out.println("plus() call");
		System.out.println("요청처리 종료...");
		System.out.println("결과값을 전송");
		return a+b;
		// 코딩할 수 없음
	}
	/*
	 * main에서는 가급적이면 처리 하지 않는다. => 시작 메소드만 호출
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 값 입력");
		int a = sc.nextInt();
		System.out.print("두 번째 값 입력");
		int b = sc.nextInt();
		
		int c = plus(a,b);
		
		System.out.println("결과 값 : "+c);
		

	}

}
