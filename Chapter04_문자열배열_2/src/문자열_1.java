/*
 *   문자열 저장 => String => "";
 *   한개 저장
 *     String 변수명 = "";
 *   다중 저장
 *     String[] 배열명 = {"",""};
 *     String[] 배열명 = new String[2];
 *    String은 클래스 => 메소드 (기능)
 *                    ------
 *               1. 메소드명 : 기능
 *               2. 결과값 확인
 *               3. () => 매개변수 확인
 *    => length()
 *       => 원형 : int length() => 문자의 개수
 *               -----
 *               String s = "Hello";
 *               s.length() => Hello의 문자 개수 확인
 *              ------------
 *               5로 값 반환
 *    => toUpperCase()
 *       => 원형 : String toUpperCase() => 대문자 변환
 *               -------
 *               String s = "Hello";
 *               s.toUpperCase();
 *               ----------------
 *               "HELLO"로 반환
 *    => toLowerCase()
 *       => 원형 : String toLowerCase() => 소문자 변환
 *               -------
 *    => substring() => 문자 자르기
 *       => 원형 : String substring(int begin)
 *               --------         -----------
 *                 리턴형             매개변수
 *                                 -------- 사용자 요청
 *                 ----- 요청 처리 결과
 *                 => 예) 로그인
 *                       ----- 요청 => id, pwd => 결과값 boolean
 *                       boolean isLogin(String id,String pwd)
 *                 => String ss = s.substring(1)
 *                String substring(int begin,int end)
 *    => startsWith() => 동일 시작 문자열 확인
 *       => 원형 : boolean startsWith(String msg)
 *                => if문에서 주로 처리
 *                String s="Hello Java"
 *                if(s.startsWith("H")) => True 반환
 *                LIKE 'A%'
 *    => endsWith() => 동일 종료 문자열 확인
 *       => 원형 : boolean endsWith(String msg)
 *                =>서제스트 (자동완성기), 확장자(jpg,png,gif..) => 갤러리 게시판
 *                LIKE '%A'
 *    => contains() => 문자열 내에 문자 포함 여부 확인
 *       => 원형 : boolean contains(String msg)
 *                =>검색 (*********)
 *                LIKE '%A%'
 *    => trim() => 좌우 공백 제거
 *       => 원형 : String trim()
 *              => 로그인 입력 , 검색어 입력, 회원가입
 *              => 유효성 검사
 *    => equals() => 같은 문자인지 확인 (대소문자 구분)
 *       => 원형 : boolean equals(String msg)
 *              => 로그인 (아이디, 비밀번호)
 *    => replace() => 문자, 문자열 변경 => 데이터베이스
 *                     ||(문자열 결합), &(입력값) => 오라클
 *                     => 이미지 (URL)
 *       => 원형 : String replace(char c, char c1)
 *                              ------- --------
 *                               old      new
 *                String replace(String s, String s2)
 *                              ---------  ----------
 *                                old         new
 *    => valueOf() : 모든 데이터형을 문자열로 변환
 *      => 원형 : String valueOf(int a or boolean a or double a ..)
 *      => static : 자동 메모리 할당
 *         String.valueOf()
 *    => toString() : 생략이 가능 => 객체의 주소값 출력
 *    => indexOf() : 지정된 문자 위치값 확인 (문자번호 0번부터)
 *      => 원형 : int indexOf(char)
 *               int indexOf(String)
 *    => lastIndexOf() : 지정된 문자위치값 확인 (문자번호 , length()-1)
 *      => 원형 : int lastIndexOf(char)
 *               int lastIndexOf(String)
 *    => concat() : 문자열 결합 (+)[
 *      => 원형 : String concat(String s)
 *    => split() => 특정 문자를 중심으로 잘라서 배열에 저장
 *      => 원형 : String[] split(String regex)
 *                                    ------- 정규표현식
 *    => replaceAll() => 문자열 변환
 *       => 원형 : String replaceAll(String regex)
 *  ---------------------------------------------------------------
 * */
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문자열_1 a = new 문자열_1();
		//클래스 저장
//		System.out.println(a.toString());
		String[] names = {"홍길동","박문수","심청이","이순신","강감찬"};
		// String은 문자저장이 제한이 없다.
		/*     
		 *      Stack             Heap
		 *      names        names[0] ...              names[4] 
		 *     -------       -------------------------------
		 *       100          홍길동   박문수  심청이  이순신  강감찬
		 *     -------       |-------------------------------
		 *                  메모리 주소 (100)
		 *                  
		 *     1. 선언
		 *        데이터형[] 배열명;
		 *        데이터형 배열명[];
		 *     2. 초기값
		 *        데이터형[] 배열명 = {};
		 *        데이터형[] 배열명 = new 데이터형[개수];
		 *        for문
		 *        난수발생 ...
		 *     3. 활용 / 변경,출력
		 *                 ---- for-each
		 *        배열명[0] ="";
		 * */               
		//출력
		for(String name:names) System.out.println(name); //실제 저장된 값 출력
		//인덱스를 이용한 출력 가능
		//속도가 빠르다.
		
		System.out.println("====================");
		for(int i =0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("====================");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String fnd_name = sc.next();
		int index= 0;
		for(String s:names) {
			if(s.equals(fnd_name)) {
				break;
			}
			index+=1;
		}
		
		System.out.printf("%s는(은) %d 번째 입니다.",fnd_name,index+1);

	}

}
