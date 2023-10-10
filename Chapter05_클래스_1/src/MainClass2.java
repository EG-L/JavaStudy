class Card{
	String type;
	int number; // 1 => A 11=> J
	static int width, height;
	
	Card()
	{
		System.out.println("메모리 생성 완료");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("메모리 해제");
	}
}
/*
 *   new Card()
 *   -----------
 *       ------
 *        type
 *       ------
 *       number
 *       ------
 *        width
 *       ------
 *       height
 *       ------
 *   -----------
 *   
 *   new Card()
 *   ----------- => 주소를 이용해서 접근이 가능하다.(.)
 *       ------
 *        type
 *       ------
 *       number
 *       ------
 *        width
 *       ------
 *       height
 *       ------
 *   -----------
 *   * 클래스는 여러 개의 데이터를 한 개로 묶어서 메모리에 저장 후 사용이 가능
 *           ------------- 클래스 설계
 *                         --------
 *                          => new를 이용해서 메모리에 저장
 *   * 주소에 대한 개념이 거의 없다.
 *     --- & --- *(자바에는 없다)
 *     클래스 / 배열 (주소를 가지고 있다)
 *   * 상속 => super / this
 *   * 한개, 한명에 대한 정보를 설계
 *     사원 10명 => 1개만 제작 => 메모리 공간 10개
 *                new => 10번
 *     -----------------------------------
 *       사용자 정의 데이터형 Board
 *       ---------------
 *       메소드 묶음 (액션 클래스) BoardSystem
 *       ---------------
 *         데이터형+메소드 혼합
 *       -------------------- 거의 없다.
 *     -----------------------------------
 *             |
 *            재사용 가능, 데이터 보호, 수정 및 추가
 *        *** 클래스는 단순화 작업 => 시뮬레이션
 *                  --------- 추상화 => 공통적으로 가지고 있는 특성
 *            예)
 *                시계
 *                 = 시침
 *                 = 분침
 *                 = 초침
 *                컴퓨터
 *                 = 모니터
 *                 = 본체
 *                 = 키보드
 *                 = 마우스
 *                사원
 *                 = 사번
 *                 = 이름
 *                 = 부서명
 *                 = 직위
 *                 = 근무처
 *                 = 입사일
 *                 = 연봉
 *                 
 *          *** 클래스는 일반(기본형) 동일하게 사용
 *             ------   .      ,배열은 index로 구분
 *                |
 *               형변환 => 상속(is-a), 포함(has-a) 
 * */
// 52개 저장 => new => 메모리 공간이 다르다. (다른 값을 저장할 수 있다.)

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         카트 1장 생성
		Card c1 = new Card();
		c1.type = "♥";
		c1.number = 1;
		c1.width = 150;
		c1.height = 200;
		
		Card c2 = new Card();
		c2.type = "♠";
		c2.number = 2;
		c2.width = 150;
		c2.height = 200;
		
		System.out.println("카드 1 타입"+c1.type);
		System.out.println("카드 1 번호"+c1.number);
		System.out.println("카드 1 너비"+c1.width);
		System.out.println("카드 1 높이"+c1.height);
		
		System.out.println("카드 2 타입"+c2.type);
		System.out.println("카드 2 번호"+c2.number);
		System.out.println("카드 2 너비"+c2.width);
		System.out.println("카드 2 높이"+c2.height);
		// 변경
		c1.width = 250;
		c1.height = 300;
		System.out.println("============================");
		System.out.println("카드 1 타입"+c1.type);
		System.out.println("카드 1 번호"+c1.number);
		System.out.println("카드 1 너비"+c1.width);
		System.out.println("카드 1 높이"+c1.height);
		
		System.out.println("카드 2 타입"+c2.type);
		System.out.println("카드 2 번호"+c2.number);
		System.out.println("카드 2 너비"+c2.width);
		System.out.println("카드 2 높이"+c2.height);
		
//		c1 = null;
//		c2 = null;
		
//		System.gc();
	}

}
