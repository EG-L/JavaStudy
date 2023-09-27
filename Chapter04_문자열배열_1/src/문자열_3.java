/*
 *  String toUpperCase() => 대문자 변환
 *  String toLowerCase() => 소문자 변환
 * */
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello Java";
//		msg = msg.toUpperCase();
		System.out.println(msg);
		char[] c_string = msg.toCharArray();
		// 대문자로 변환하는 것은 가끔
		// 처리 => 다시 저장하지 않는 경우에는 원본을 유지한다.
		// 오라클에서 대문자 구분
		for(int i = 0;i<msg.toCharArray().length;i++) {
			char c = msg.toCharArray()[i];
			if(c>='a'&&c<='z') {
				c_string[i] = String.valueOf(c).toUpperCase().toCharArray()[0];
			}
			else {
				c_string[i] = String.valueOf(c).toLowerCase().toCharArray()[0];			}
		}
		
		System.out.println(String.valueOf(c_string));

	}

}
