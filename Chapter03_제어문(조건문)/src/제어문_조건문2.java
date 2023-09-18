/*
 *    단일 조건문은 true일 때만 처리 => false는 건너 뜀
 *    선택 조건문 => true일 때 처리, false일 때 처리 분리 작업
 *    --------    예) 아이디 중복 체크
 *                    중복일 경우 ==> 이미 사용 중인 아이디입니다.
 *                    중복이 아닐 경우 ==> 사용이 가능한 아이디입니다.
 *                    
 *    형식)
 *        if(조건문){
 *        	// 조건문이 true일 경우
 *        }
 *        else{
 *        	// 조건이 false일 경우
 *        }
 *        ===> 간결하게 처리 삼항연산자 (웹,게임)
 *        
 *        => 짝수/홀수
 *        => 대문자/소문자
 *        => 웹 => 페이지
 *    
 * */
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		//대문자 /소문자 확인
		if(c>='A'&&c<='Z') System.out.println(c+"는(은) 대문자입니다."); // 대문자 확인 여부
//		if(c>='a'&&c<='z') System.out.println(c+"는(은) 소문자입니다.");
		else System.out.println(c+"는(은) 소문자입니다.");
		//else문장은 독립적으로 사용 불가 => if문과 같이 사용
		//else문장을 바로 위에 있는 if만 지원한다.
		/*
		 * if()
		 * {
		 * }
		 * --------------
		 * if()
		 * {
		 * }
		 * --------------
		 * if()
		 * {
		 * }
		 * else
		 * {
		 * }
		 * --------------
		 * */
		int a =10;
		if(a%2==0) System.out.println(a+"는(은) 짝수입니다.");
		else System.out.println(a+"는(은) 홀수입니다.");

	}

}
