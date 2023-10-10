/*
 * 망고플레이트
 * 카테고리 => 맛집
 * 클래스는 반드시 구분자를 필요로 한다. => 정수형
 * 
 *    1) 변수를 묶는다.
 *    2) 구분자 => 참조번호 확인
 *    3) 여러개 있는 경우 => 배열 / 문자열 
 *                      ------------
 *    4) 데이터형 설정 => String , int , double
 *    5) 저장하는 과정
 *       new  동적 메모리 할당
 *    6) 사용법
 *      ------
 *       객체.변수명 => 읽기/쓰기 ==> .은 메모리 접근 연산자
 *       --------
 *       
 *       int a = 10;
 *       a = 100; 쓰기
 *       System.out.println(a); 읽기
 *    7) 사용자 정의 데이터형
 *      -----------------~VO , ~DTO, ~Bean
 *                      Spring MyBatis JSP
 *    8) 변수의 종류
 *      = 멤버변수
 *        => new를 사용하여 메모리 저장
 *        => 메모리 공간이 따로 배치
 *      = 정적변수(static)
 *        => 컴파일시 자동으로 메모리 할당
 *        => 메모리 공간이 1개 생성 ==> 공유변수
 *      = 나머지는 지역변수
 * */
class FoodCategory{
	int cno;
	String poster,title,subject;
}
class FoodHouse{
	int cno;//카테고리 번호
	int fno;//맛집 번호
	String[] poster = new String[5];
	//멤버변수 포함 => 기본형 , 클래스 , 배열
	String name;
	double score;
	String address;//substring
	String phone;
	String type;
	String price;
	String parking;
	String time;
	String menu; // a,b,c,d
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
