/*
 * 
 *  배열
 *  --- 묶어서 관리
 *      --------
 *      1) 변수 => 같은 유형의 변수가 3개이상 => 묶어서 처리
 *                                       --------
 *                                       변수명을 하나로 관리
 *            => 같은 데이터형
 *            => 다른 데이터형 (*******) => 클래스
 *               (Spring)(MyBatis)(JSP)
 *               => ~VO , ~DTO , ~Bean 클래스이름 뒤에 붙음
 *                 ------ ----- -------
 *               데이터묶음 데이터전송
 *                       
 *      2) 명령문 : 관련된 명령끼리 묶어서 구조적 프로그램
 *                메소드 ==> 단락
 *    
 *    기본 문법--------
 *    데이터 묶기 (변수)
 *    명령문 묶기 (명령문) => 소스코딩 ;
 *                |
 *               입력
 *               처리
 *               출력
 *              -----
 *    배열 : 같은 데이터형을 여러 개 묶어서 관리하는 상태
 *    1) 장점
 *       여러 개의 변수명을 한개로 통합하여 사용
 *                     ---------
 *       => 데이터마다 구분 => 인덱스 (순차적) => 반복문
 *    2) 단점
 *       고정적이다 => 메모리 할당 (10)
 *       --------
 *       크기 변경이 불가능하다 => 큰 배열을 재생성
 *       같은 데이터형만 모아서 저장
 *    ---------------------------------------------
 *    1. 배열선언
 *       데이터형[] 배열명; 자바(권장)
 *       데이터형 배열명[]; c언어
 *       -------------------
 *    2. 배열 초기화
 *       int[] arr = {1,2,3,4,5,6}; => 6개
 *            -----
 *              |변수식별자와 동일
 *              
 *       int[] arr = new int[6]; => 메모리 할당 (int 6개를 모아 관리)
 *                  ------------- => 자동 초기화 0
 *         int[] arr;
 *                   스택       힙  
 *               arr       |
 *              -----      |
 *                         |
 *              -----      |
 *                              arr+1*4
 *       arr = new int[5]; |          arr+2*4
 *                                            arr+3*4 
 *                                                 arr+4*4
 *                           100  104  108   112    116  120
 *               arr       |--------------------------------
 *              ------     |  |0   |    0|    0|    0|    0|
 *               100       |  |------------------------------
 *              ------     | arr(100) => arr+0*4 ==> 100
 *                                          |         |
 *                                        arr[0]    arr[1] ........... arr[4]
 *                                        -----------------------------------
 *                                                 | 일반 변수와 동일
 *       
 *    3. 값 변경
 *      => 1번째 값 변경
 *         arr[0] = 100;      |100 |    0|    0|    0|    0|
 *         arr[4] = 200;      |100 |    0|    0|    0|  200|
 *    4. 출력
 *        int[] arr; ==> 데이터형을 for-each문과 일치 시켜야 됨
 *        for(int a:arr){
 *            
 *        }
 *    
 * */
import java.util.Scanner;
//3명의 학생 => 국어 , 영어, 수학 => 총점 , 평균 출력
public class 배열_생성 {
	public static void print(int dan) {
		for(int i=1;i<10;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int total1,total2,total3;
		double avg1,avg2,avg3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 학생의 국어 점수 :");
		kor1 = sc.nextInt();
		
		System.out.print("첫 번째 학생의 영어 점수 :");
		eng1 = sc.nextInt();
		
		System.out.print("첫 번째 학생의 수학 점수 :");
		math1 = sc.nextInt();
		
		System.out.print("두 번째 학생의 국어 점수 :");
		kor2 = sc.nextInt();
		
		System.out.print("두 번째 학생의 영어 점수 :");
		eng2 = sc.nextInt();
		
		System.out.print("두 번째 학생의 수학 점수 :");
		math2 = sc.nextInt();
		
		System.out.print("세 번째 학생의 국어 점수 :");
		kor3 = sc.nextInt();
		
		System.out.print("세 번째 학생의 영어 점수 :");
		eng3 = sc.nextInt();
		
		System.out.print("세 번째 학생의 수학 점수 :");
		math3 = sc.nextInt();
		
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		total3=kor3+eng3+math3;
		
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor1,eng1,math1,total1,total1/3.0);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor2,eng2,math2,total2,total2/3.0);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor3,eng3,math3,total3,total3/3.0);

	}

}
