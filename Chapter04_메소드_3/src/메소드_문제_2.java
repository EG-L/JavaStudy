//정수 하나 입력 => 3의 배수 여부 확인

public class 메소드_문제_2 {
	public static String check(int num) {
		String result = "";
		
		if(num%3 ==0) result+="3의 배수입니다.";
		else result+="3의 배수가 아닙니다.";
		
		return result;
	}
	public static void print(String result) {
		System.out.println(result);
	}
	public static void process() {
		int num = 메소드_문제_1.user_input();//재사용
		String check_data = check(num);
		print(check_data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
