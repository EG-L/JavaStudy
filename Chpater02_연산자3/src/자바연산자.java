/*
 *    변수 : 저장 공간
 *    ---
 *      자바 저장 공간을 설정(자료형, 데이터형)
 *      ---------------
 *       정수
 *        byte(1byte) = 0,1을 8개를 채워서 숫자 한 개 저장
 *           -128~127
 *        int (4byte) => ~21억 4천 ~ 21억 4천의 숫자를 저장
 *        -----------------------------default (컴퓨터에서 모든 숫자는 int를 인식)
 *        long (8byte) => 금융권, 빅데이터
 *       실수
 *        double(8byte) => 소수점 15자리 이상
 *       문자
 *        char(2byte) => 0~65535 (문자 번호)
 *             'A' (X) ==> 65
 *       논리
 *        boolean(1byte) => true , false만 저장
 *       ----------------------------------------
 *        정수 3개 저장
 *        int a,b,c;
 *        
 *        실수 2개 저장
 *        double d1, d2;
 *        
 *        문자 1개 저장
 *        char c;
 *        
 *        논리형 1개 저장
 *        boolean bb;
 *        
 *      ---> 데이터 저장 ---> 사용자 요청에 맞게 가공 ----> 화면 출력
 *      ---> 프로그램 (반복)          |
 *                               연산자              
 *      
 *      자바에서 제공하는 연산자
 *      -----------------
 *       단항 연산자 :
 *        = 증감연산자 (++,--) : 한 개 증가, 한 개 감소
 *          ++a : i 값을 1증가 시킨 후에 다른 값에 대입
 *          int a = 10;
 *          int b = ++a;
 *                  -- a = 11
 *                   증가(1)
 *               ----- b = 11
 *                  대입
 *          
 *          a++ : 다른 값에 대입 후에 i 값을 1증가
 *          int a = 10;
 *          int b = a++;
 *               ---- b = 10
 *                대입
 *                  ---- a = 11
 *                    증가(1)
 *          
 *          --a : a값을 먼저 감소하고 나중에 다른 값에 대입
 *          int a = 10;
 *          int b = --a;
 *                  ---- ==> a = 9
 *                    감소(1)
 *                ------ b = 9
 *                  대입
 *                  
 *          a-- : 다른 값에 대입 후에 a 값을 1감소
 *          int a = 10;
 *          int b = a--;
 *               --- b = 10
 *                대입
 *                ------ a = 9
 *                 감소(1)
 *                 
 *          ++,-- ==> 1증가 , 1감소
 *          
 *        = 부정연산자 (!) => boolean에서만 사용이 가능
 *           => true => false
 *              false => true
 *            예)
 *              boolean bCheck = false;
 *              bCheck=!bCheck; ==> bCheck = true;
 *              예약가능한 날 => !(예약가능한 날)
 *              
 *        = 형변환 연산자(type) => 강제형변환
 *          --------------- 객체지향 형변환 (클래스)
 *          숫자 관련 (정수, 실수, 문자)
 *          ----------------------
 *          ===============> 자동형변환
 *          byte < char < int < long < float < double
 *                 short
 *                 <=================== 강제형변환
 *                 
 *          Upcasting: 데이터형을 크게 만든다 (자동형변환)
 *          int => double
 *          char => int
 *          -----------------
 *          int a = 'A';
 *               ------- int 변경 a => 65;
 *          double d = 100
 *                 -------double 변경 d => 100.0;
 *                 
 *          Downcasting: 데이터형을 작게 만든다(강제형변환)
 *           char c = (char)65;  c=>'A'
 *           int i = (int)100.0; i => 100
 *           
 *           
 *        자동 형변환
 *        --------
 *          연산 처리시 많이 변경(자바자체)
 *          --------
 *             데이터형이 값은 같은 데이터형끼리만 연산이 된다.
 *             
 *             double + int (x)
 *                      ---
 *                      double로 변경
 *             char + int (x)
 *             ----
 *             int로 변경
 *             
 *             int + long (x)
 *             ---
 *             long으로 변경
 *             
 *             int + char + double
 *             ----------
 *             double로 변경
 *             
 *             *** 주의점(int이하 데이터형은 연산 시에 int로 변경)
 *             char + byte => int
 *             char + char => int
 *             byte + byte => int
 *             ------------
 *             int로 변경
 *             
 *       이항 연산자 :
 *        = 산술연산자(+,-,*,/,%)
 *              *** 우선 순위 (*,/,% => +, - )
 *                          -----    -----
 *                          선순위     후순위
 *               3+5*10 ==> 53
 *               (3+5)*10 ==> 80
 *              => 7+"7"+7-7;
 *                 ----
 *                  "77"
 *                  ------
 *                   "777"
 *                   -------
 *                   "777"-7 => error
 *                   
 *              => 7+"7"+(7-7);
 *                       ----
 *                         0
 *                ------
 *                 "77"
 *                   -------
 *                   "770"
 *                   
 *              => 7+"7"+7/7;
 *                       ----
 *                         1
 *                ------
 *                 "77"
 *                   -------
 *                   "771"
 *          + : 두 개의 값을 더한다 (1+2=3)
 *              문자를 합쳐준다 ("7"+7 = "77")
 *          / : 정수/정수 => 정수, 정수 / 실수
 *              정수/(double)정수
 *              int hit = 135;
 *              int count = 10;
 *              hit/count ==> 13
 *              hit/(double)count ==> 13.5
 *              *** 0으로 나눌 수 없다(0으로 나눌 경우 => 오류 발생)
 *          % : 왼쪽 부호
 *              => 윤년 구하기 , 숫자 자르기 ..., 배수 구하기
 *              
 *        = 비교연산자(==,!=,>=,>,<,<=) ==> 결과 값은 true/false
 *          ==> 문자, 정수, 실수
 *              ''(문자),""(문자열) ==> 자바는 Unicode를 사용 (모든 국가의 언어 사용이 가능)
 *                                        -------
 *                                         한 글자당 바이트 2byte
 *              '홍'(한글은 1글자당 2byte), 'a'(영어는 1글자당 1byte)
 *          == 같다
 *          != 같지 않다
 *          < 작다 (왼쪽 기준)
 *          > 크다
 *          <= 작거나 같다
 *          >= 크거나 같다
 *          *** 날짜,문자열은 비교할 수 없다.(자체 메소드 존재)
 *          
 *        = 논리연산자(&&,||)
 *          && : 직렬연산자 (조건 2개가 true 일 경우에만 true 반환)
 *            (조건) && (조건)
 *            ----     ----
 *            주로 사용처 : 기간, 범위가 포함된 상태
 *          || : 병렬연산자 (조건 2개 중 1개 이상이 true 일 경우 true 반환)
 *            (조건) || (조건)
 *            -----    -----
 *            주로 사용처 : 잘못된 입력
 *        = 대입연산자(=,+=,-=)
 *          = 일반 대입
 *          += =========> a+=1 ==> a = a+1; // 여러 개 증가시킬 때 사용
 *                        a+=2
 *                        a+=3
 *          -= =========> a-=1 ==> a = a-1; // 여러 개 감소시킬 때 사용
 *                        a-=10
 *                        a-=3
 *       삼항 연산자 : 조건연산자 a>b?조건1번값:조건2번값
 *       (조건)?값1:값2	
 *       ----
 *       true => 값1번
 *       false=> 값2번  ==> 페이징
 * */
// 산술연산자
// 정수 3개 입력을 받아서 총점 , 평균
import java.util.Scanner;//Scanner클래스를 가지고 온다.

// c => include
// c# => using
// 자바스크립트 => import

public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math;//변수 선언 시 소문자로 표기한다.
		int total;
		double avg;
		//변수 선언(메모리 저장하는 공간만 확보)
		//메모리 공간에 값을 첨부 => 변수 초기화
		//연산처리 ==> 
		Scanner sc = new Scanner(System.in);
		//                       --------- 키보드 입력
		System.out.println("국어,영어,수학 점수 입력(90 90 90) :");
		
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		total = kor+eng+math;
		avg = total/3.0;
		//new => 메모리에 저장 (클래스)
		
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f\n",avg);
		//결과 출력
		
		System.out.print(avg>=90 && avg<=100?"A학점":"");
		System.out.print(avg>=80 && avg<90?"B학점":"");
		System.out.print(avg>=70 && avg<80?"C학점":"");
		System.out.print(avg>=60 && avg<70?"D학점":"F학점");

	}

}
