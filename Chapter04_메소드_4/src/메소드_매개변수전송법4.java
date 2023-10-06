
public class 메소드_매개변수전송법4 {
	public static void swap(int a,int b) {
		//새로운 메모리 생성
		System.out.println("변경 전 swap : a="+a+", b="+b);
		int temp = a;
		a = b;
		b= temp;
		System.out.println("변경 후 swap : a="+a+", b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;//기본형 => 값만 복사 call by value
		                   //배열,클래스 => 주소지 복사 call by reference
		System.out.println("변경 전=>main:swap : a="+a+", b="+b);
		swap(a,b);
		System.out.println("변경 후=>main:swap : a="+a+", b="+b);
	}

}
