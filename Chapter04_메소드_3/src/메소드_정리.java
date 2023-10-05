/*    * 프로그램의 유형
 *      = 네트워크 : 게임 , 화상채팅 ...
 *      = 데이터베이스 : 웹 ***
 *    1. 리턴형
 *      = 요청 처리에 대한 결과값 전송
 *                    ------
 *                    = 한개 (기본형) => 정수, 실수, 문자, 논리
 *                    = 여러개 (배열,클래스)
 *                               ------ 상세보기, 목록 ..
 *      = 결과값이 존재하지 않는 경우 : 추가, 수정, 삭제(CRUD) => void
 *                              ==> 출력
 *      = 결과값이 존재하는 경우 : 목록, 상세보기 , 검색 ...
 *    2. 매개변수(parameter)
 *      = 사용자가 요청값을 받을 경우
 *      = 여러개 사용이 가능 => 3개이상이면 배열 또는 클래스로 처리
 *      = 가변 매개변수 (...)
 *    3. 메소드명
 *      = 식별자 => 문자 개수(제한x) => 되도록 10글자 이내로
 *      = 두개의 단어가 있는 경우
 *        userInput(), user_input()
 *        aaa()X => delete()
 *        bbb()X => board_insert()
 *    4. 리턴문
 *      => 가급적이면 메소드 마지막에 설정
 *      => void면 생략 가능
 *      
 *    5. 형식
 *       리턴형 메소드명(매개변수...)
 *       ----
 *       {
 *           return 값;
 *                 ---
 *       }
 *    6. 메소드 유형
 *       리턴형        매개변수
 *         o            o
 *         o            x
 *         ---------------- 출력 내용이 존재
 *         x            o
 *         x            x
 *         ---------------- 메소드 자체 처리(void)
 *    7. 사용 목적
 *        = 다른 클래스와 연결 (메시지) => 메소드 호출
 *        = 재사용
 *        = 반복 제거
 *        = 수정이 편리하게
 *        = 에러 처리가 쉽게
 *    8. 메소드 형태
 *       = static
 *       = instance : 교재 
 * */
public class 메소드_정리 {
	public static void data(String...s) {//가변 매개변수
		for(String ss:s) {
			System.out.print(ss+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data("Java");
		data("Java","ORACLE");
		data("Java","ORACLE","HTML");

	}

}
