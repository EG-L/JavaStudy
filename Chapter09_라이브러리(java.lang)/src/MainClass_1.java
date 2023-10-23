/*
 *    java.lang       
 *    java.util       
 *    java.io      
 *    java.text       
 *    java.net       
 *    java.sql
 *    -------------- 클래스 / 메소드
 *    java.lang => import 생략 가능
 *    => 기본이 되는 클래스의 집합
 *    => Object : 모든 클래스의 상위 클래스
 *                라이브러리 / 사용자 정의 클래스 => 항상 상속을 내리는 클래스
 *           = toString() : 객체를 문자열화 => 생략이 가능
 *              => 객체 주소 출력
 *             class A
 *             A a = new A();
 *             System.out.println(a)
 *             System.out.println(a.toString())
 *           = finalize() : 소멸자 : 메모리 해제시 호출
 *           = clone() : 복제 => 메모리 복제 => 새로운 객체 생성
 *    => **String / StringBuffer
 *       StringBuffer : 문자열 결합 시 최적화
 *            -------- 임시 저장 장소
 *            -------- append() 문자열 결합
 *       String : 문자열관리
 *       ------
 *         equals : 문자열이 같은지 확인
 *         length : 문자 길이 확인
 *         contains : 포함문자 확인
 *         startsWith : 시작 문자 확인
 *         endsWith : 끝 문자 확인
 *         subString : 문자 자르기
 *         indexof : 인덱스 위치 찾기
 *         lastindexof : 마지막 인덱스 위치 찾기
 *         valueof : 모든 데이터형을 문자열로 변환
 *         split : 문자열 분해
 *         --------------------------------
 *         
 *    => System
 *       => println() , print()
 *       => gc() : 메모리해제
 *       => exit() : 프로그램 종료
 *    => Math : 수학
 *       => random() : 임의의 난수 발생
 *       => ceil() : 올림 함수 => 총페이지
 *       => floor() : 내림 함수
 *       => round() : 반올림 함수
 *    => **Wrapper : 모든 데이터형을 관리하기 쉽게 클래스화
 *                   => 데이터형 변경 (제닉릭스는 클래스만 가능)
 *                   <int> => <Integer>
 *       int => Integer => parseInt() : 문자열 정수형 변경
 *       double = > Double => parseDouble()
 *       boolean => Boolean => parseBoolean
 *       byte => Byte => parseByte
 *       => 변환이 쉽게 
 *          => if(a.equals("1"))
 *             int a = 1; ==> 42억
 *    -----------------------------------------------
 *    
 * */
public class MainClass_1 {
	public String name;
	public int age;
	public MainClass_1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	//가장 많이 재정의되는 메소드 : 멤버변수값을 출력
	//메모리 주소 => 싱글톤 검색 (메모리 주소가 동일)
	public String toString() {
		// TODO Auto-generated method stub
		return "이름"+name+"나이"+age;
	}

	public static void main(String[] args) {
		//toString => 객체를 문자열화
		//생략이 가능
		MainClass_1 m = new MainClass_1("홍길동",20);
		System.out.println(m);
		System.out.println(m.toString());
	}
}
