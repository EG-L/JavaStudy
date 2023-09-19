/*
 *   식별자 => 변수/상수/메소드/클래스/인터페이스
 *   
 *     자바에서 제공하는 제어문
 *     -----------------
 *      조건문 : 형식, 사용처
 *       = 선택문 : 값이 1개 => 키볻, 서버 프로그램 => Application
 *         형식)
 *             switch(정수,문자,문자열)
 *             {
 *             	case 값:
 *             		실행문장;
 *             		break; => 실행문장 수행 후 종료
 *                 -------- 중복적으로 실행문장이 있는 경우에는 break생략이 가능
 *              case 값:
 *                 ...
 *                 ...
 *              default : 값이 없는 경우 실행 문장
 *             }//버튼 클릭 , 메뉴 선택
 *       = 단일조건문
 *         형식) 
 *              if(조건문) => 조건(true/false)
 *              {           --------------- 비교연산자/논리연산자/부정연산자
 *              	조건이 true일 때 수행
 *              }
 *              => 웹) 상세보기 , 로그인 , 아이디 찾기
 *              => 독립적이다 (if문마다 따로 수행)
 *              => 조건에 해당되는 모든 내용 출력 ...
 *       = 다중조건문
 *         형식)
 *              if(조건문)
 *              {
 *                  조건이 true일 때 수행 및 종료
 *                  조건이 false일 때 => 다음 if문을 찾아간다.
 *              }
 *              else if(조건문)
 *              {
 *                  조건이 true일 때 수행
 *                  조건이 false일 때 => 다음 if문을 찾아간다.
 *              }
 *              else
 *              {
 *              	조건이 없을 때 처리
 *              
 *              }
 *           = 제어문 / 변수 / 연산자 ==> 자바스크립트, 오라클
 *       = 선택조건문 : true 와 false를 나눠서 처리
 *          형식)
 *              if(조건문)
 *              {
 *              	조건이 true일 때 처리 => 로그인 시
 *              }
 *              else
 *              {
 *               	조건이 false일 때 처리 => 로그인이 안 됐을 시
 *              } 
 *      반복문 => 65page
 *      ===============================
 *           DB단 : DBA
 *           View단 : HTML, JS
 *           Back단 : Java
 *           --------------------
 *       => 종류, 형식
 *       1) 종류
 *          ***for => 반복 횟수가 있는 경우 65page
 *                 웹) 목록출력 , 쿠키 출력 ...
 *                 => 출력용 (javascript)
 *          ***while => 반복횟수가 없는 경우 => 선조건
 *                 서버프로그램, 게임 ...
 *                 데이터베이스프로그램 , 파일읽기
 *                 데이터 관리(java)
 *                 int a = 10;
 *          while(조건문) a!= 10
 *          {
 *          	반복 실행 문장
 *          }
 *          do~while => 반복횟수가 없는 경우 ==> 무조건 1회 실행
 *                   => 후조건
 *          do
 *          {
 *          	반복 실행 문장
 *          }
 *          while(조건문) a!=10
 *      
 *      1) for => 2차 for (알고리즘) => 코테
 *         형식)            false => 종료
 *         		   1 =>  2 <- 4
 *            for(초기값;조건식;증감식)
 *            {        ----
 *            		   true
 *                      |3
 *            	반복실행문장
 *            }
 *            1 => 2 => 3 => 4
 *                ============ 반복 수행
 *                2  => 3 => 4
 *                ============
 *                2  => 3 => 4
 *                ============
 *                2 => false가 될 때까지 반복
 *                     1      2   4   
 *            for(int i = 1;i<=10;i++)
 *            {
 *                수행 3
 *            }
 *            
 *            초기값 : 조건식에 사용할 변수 선언 => 값은 한번만 사용
 *            조건식 : 반복 횟수 => 반복문 중단 여부 확인
 *                   false => 종료
 *                   true => 반복수행
 *            증가식 : 조건식이 false가 되는 조건을 만든다
 *            ----
 *             한개 ++
 *             여러개 +=
 *      
 *      반복제어문
 *   
 * */
public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("============for============");
		for(int i =0; i<10;i++) {
			System.out.println("Hello For문");
		}
		System.out.println("============for============");
		for(int i = 1; i<=10;i++) {
			System.out.println("Hello For문");
		}
		System.out.println("============for============");
		               // 증감식
		for(int i = 10;i>=0;i--) {
			System.out.println("Hello For문");
		}
	}

}
