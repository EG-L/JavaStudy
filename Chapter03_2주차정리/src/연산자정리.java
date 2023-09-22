/*
 *   연산자
 *   -----
 *    => 결과값 (데이터형 사용)
 *    1) 피연산자 / 연산자
 *       ----- 연산대상
 *       
 *       1개 = 단항연산자 ++a !a (char)10
 *            -증감연산자
 *             =======
 *                |
 *             ++ , -- => 1증가, 1감소
 *             int a = 10;
 *             a++; => a=a+1;
 *              
 *             전치 연산자 : 선증가 후대입
 *             후치 연산자 : 선대입 후증가
 *             
 *             int a = 10;
 *             int b = a++; >> b = 10
 *                  ---
 *                   1
 *                   ------
 *                      2
 *             
 *             int a = 10;
 *             int b = ++a; >> b = 11
 *                    -----
 *                      1
 *                   ------
 *                     2
 *             int a = 10;
 *             System.out.println(a++); >> a = 10;
 *             System.out.println(++a); >> a = 11; ==>>게시물 번호 ==> --a
 *             
 *            -부정연산자 ==> boolean ( 조건문 )
 *             boolean bCheck= false;
 *             !bCheck => true
 *             bCheck = !bCheck;
 *             
 *             String s = "aaa";
 *             s.replace('a','b') => "bbb"
 *             s = "aaa";
 *             
 *            -형변환연산자
 *             -------- boolean 제외
 *       2개 = 이항연산자 a+b
 *            -산술연산자
 *              + , - , * , / , %
 *             --          --  --
 *             =>장바구니 => *
 *             => + (문자열 결합)
 *                int 이하 데이터형은 연산 시 int로 반환
 *                double + int => double
 *                char + char => int
 *                char + byte => int
 *                byte + byte => int
 *               => / => 정수/정수 => 정수
 *                  / => 정수/0 => 오류 발생
 *               => % => 부호가 왼쪽편 부호를 따라간다.
 *                  % => -%- => -
 *                       -%+ => -
 *                       +%- => +
 *                       +%+ => +
 *            -비교연산자 : 조건문 / 반복문(조건식)
 *              == , !=, > , < , >= , <= : boolean
 *              1. 문자열 비교는 할 수 없다.
 *                 equals
 *            -논리연산자
 *              &&  ||
 *              --
 *              (조건) && (조건) ==> 두 개의 조건이 true일 때 처리
 *              ----     -----
 *                 |     |
 *                 ------- true && true => true
 *                   => 범위 지정, 기간
 *                   => (조건) && (조건)
 *                      -----
 *                       false => 뒤에 있는 조건은 수행하지 않음
 *                       => 효율적인 연산
 *                       
 *              (조건) || (조건) ==> 두 개의 조건 중 하나라도 true일 때 수행
 *              ----     -----
 *                 |     |
 *                 -------  true || true, true || false , false || true 일 때 수행
 *                 => 사용처 (오류처리,잘못된 입력,범위를 벗어난 경우)
 *                 
 *                 => (조건) || (조건)
 *                    -----
 *                    true => 뒤에 있는 조건은 수행하지 않음
 *                    => 효율적인 연산
 *            -대입연산자
 *             = , +=, -=
 *             +=
 *             int a = 10;
 *             a+=1; ==> a = a+1; ==> a = 11;
 *             ==> 1개증가보다 여러개 증가
 *             a+=2 a+=3 ...
 *             => 비행기 , 총알 게임 ...
 *       3개 = 삼항연산자 (조건)?값1:값2 ==> 페이지 변경
 *                    -----
 *                    true => 값1
 *                    false => 값2
 *              =>if~else
 *                    
 * */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean bCheck = false;
//		if(!bCheck) {
//			System.out.println("출력");
//		}
//		bCheck = !bCheck;
//		System.out.println(bCheck);
//		
//		int a = 10;
//		a++; // a=a+1;
//		System.out.println(a);
//		byte b = 1;
//		byte b2= 2;
//		int b3 = b+b2;//int long float double만 설정 가능
		
		String s = "Hello";
		String s1 = new String("Hello");
		
		if(s==s1) System.out.println("같다"); //문자의 주소가 다르다.
		else System.out.println("같지 않다.");
		
		if(s.equals(s1)) System.out.println("같다");
		else System.out.println("같지 않다.");

	}

}
