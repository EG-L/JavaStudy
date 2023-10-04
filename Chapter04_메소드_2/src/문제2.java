public class 문제2 {
	//1~10까지 출력하는 메소드 구현
	public static void get_data() {
		for(int i =1;i<11;i++) {
			System.out.print(i+" ");
		}
	}
	//1~10까지 합을 출력하는 메소드 구현
	public static void sum_data() {
		int sum = 0;
		for(int i = 1;i<11;i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합 : "+sum);
	}
	//1~n까지의 합을 출력하는 메소드 구현
	/*
	 * Method
	 *  = callback => main => 자동 호출되는 메소드(시작점)
	 *  = 사용자 정의 : 프로그래머가 직접 제작
	 *  = 라이브러리 : 이미 제작된 메소드 => 만들지 못하는 프로그램
	 *    = 자바 제공 라이브러리
	 *    = 외부 라이브러리 (Jsoup,Spring) => mvnrespository.com
	 *    = CBD => 조립식
	 *    -------------- 메소드 호출
	 *  = 조립할 때 , 재사용 , 유지보수가 편리하게 만든다
	 *  = 재사용
	 *    Method 호출
	 *    ----------
	 *     int aaa() ===> int a = aaa();
	 *     double bbb() ===> double b = bbb();
	 *     void ccc() ===> ccc();
	 *     boolean ddd() ===> boolean d = ddd();
	 *     --------------------------------------
	 *     
	 *     class A{
	 *        int aaa(){
	 *        }
	 *     }
	 *     class B{
	 *        main(){
	 *           aaa(); <<== 사용 불가
	 *           A.aaa(); <<== 사용 가능
	 *        }
	 *     }
	 * */
	public static void sum_data2(int end) {
		int sum = 0;
		for(int i = 1;i<end+1;i++) {
			sum+=i;
		}
		System.out.printf("1~%d까지의 합 : %d",end,sum);
	}
	//두 정수를 나눗셈 결과를 구해주는 메소드 구현
	public static void divide_data(int a, int b) {
		if(b==0)System.out.println("0으로 나눌 수 없습니다.");
		else System.out.printf("%d/%d = %d\n",a,b,(a/(double)b));
	}
	//문자열 소문자를 대문자로 바꿔주는 메소드 구현
	public static void cross_data(String msg) {
		String result = "";
		for(int i = 0; i<msg.length();i++) {
			char c = msg.charAt(i);
			if(c>='a'&&c<='z') result+=String.valueOf(c).toUpperCase();
			else if(c>='A'&&c<='Z') result+=String.valueOf(c).toLowerCase();
			else result+=c;
		}
		System.out.println("결과 값 :"+result);
	}
	//문자열을 거꾸로 출력하는 메소드 구현
	public static void change_data(String msg) {
		for(int i = msg.length()-1;i>=0;i--) {
			System.out.print(msg.charAt(i));
		}
	}
	
	public static void process() {
		get_data();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
