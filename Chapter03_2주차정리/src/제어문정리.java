/*
 *    자바 제어문 종류
 *    ------------
 *    조건문
 *      = 단일 조건문
 *       if(조건문) => true/false (부정연산자, 논리연산자, 비교연산자만 사용 가능)
 *       {
 *          조건이 true일 때 수행 문장
 *       }
 *       => 독립적인 경우 
 *      = 선택 조건문 => true / false 나눠서 처리 (삼항연산자 처리 가능)
 *      예) 로그인 => OX, 아이디 중복 체크 , 검색
	 *       if(조건문)
	 *       {
	 *         조건이 true일 때 수행 문장
	 *         조건이 false일 시 else if 문장 수행
	 *       }
	 *       else if(조건문)
	 *       {
	 *         조건이 true일 때 수행 문장
	 *       }
 *      = 다중 조건문 : 한개의 문장만 수행 ( Switch~Case 문 처리 가능 )
 *        if(조건문)
 *        {
 *            조건이 true일 때 수행 문장
 *            조건이 false일 시 else if 문장 수행
 *        }
 *        else if(조건문)
 *        {
 *            조건이 true일 때 수행 문장
 *            조건이 false일 시 else 문장 수행
 *        }
 *        else
 *        {
 *           조건이 true일 때 수행 문장
 *        }
 *    선택문 : 한 개의 값을 선택한 경우에 처리
 *           별점...
 *           => 카테고리 , 메뉴 ..., 서버 프로그램
 *           switch(정수,문자,문자열)//실수형은 사용이 안된다.
 *           {
 *              case 값:
 *                처리문장;
 *                break;
 *              default: // 예외 가능
 *                처리문장
 *           }
 *    반복문
 *      for : 횟수가 지정이 된 경우 => 배열, 컬랙션
 *                               ---------- index번호 => 일정하게 
 *                               => for문 (for-each)
 *                                  for a of list
 *                                  for i in
 *              => 1차
 *                           false
 *                     1     |2    4
 *                 for(초기값;조건식;증감식)
 *                 {     3   |true
 *                    반복문장수행;
 *                 }
 *                 ===> 1->2->3->4->2->3->4 false될 때 까지 반복 수행
 *              => 2차
 *                 => 알고리즘 (2차) => SORT, 등수구하기 ...
 *                      1     2    7
 *                 for(초기값;조건식;증감식)
 *                 {        3    4     6
 *                     for(초기값;조건식;증감식)
 *                     {       5
 *                         반복 수행 문장;
 *                     }
 *                     줄바꿈
 *                 }
 *      while : 횟수가 지정이 안된 경우
 *      do~while : 횟수가 지정이 안됐지만 한번은 무조건 수행
 *    반복제어문
 * */
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int a:arr) {//for-each 웹 출력(목록)
			System.out.println(a);
		}

	}

}
