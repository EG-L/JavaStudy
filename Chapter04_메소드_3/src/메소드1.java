/*
 *  변수 / 연산자 / 제어문
 *       ------------- 명령문
 *  => 묶어서 사용
 *  변수 : 배열 / 클래스 (O)
 *  명령문 : 관련된 명령
 *        => 입력 관련 / 출력 관련 / 요청 관련 => 메소드
 *        => 동작 => 조립해서 사용 ( 객체 지향 프로그램 )
 *                 ----------- 수정 / 추가 ( 유지 보수 )
 *  메소드는 한 개의 기능만 수행
 *  => 자바는 클래스 영역을 벗어날 수 없다. (클래스 종속)
 *  1. 메소드 구성요소
 *    = 리턴형 : 사용자 요청에 대한 처리 결과 값
 *             결과 값은 반드시 한개만 사용이 가능하다.
 *                          --------
 *                             | 여러개인 경우 => 배열 / 클래스 / 컬렉션
 *             => 예측해서 설정 
 *    = 매개변수 : 사용자가 요청한 값
 *               웹에서 마우스 클릭, 엔터, 버튼 및 입력창에 요청
 *                    --------             ----------
 *             => 메소드는 사용자가 행위를 한 경우 => 메소드 호출
 *                      ---------- : 마우스 , 키보드 이용
 *    = 메소드명 : 식별자 (변수)
 *              => 소문자 시작 ...
 *    = return 문장 : 처리 결과 값 반환 , 메소드의 종료
 *     -------- 꼭 맨마지막에 사용하는 것이 아니라 중간에서도 사용이 가능하다.
 *     메소드()
 *     {
 *         if()
 *         {
 *            return ;
 *         }
 *         else
 *         {
 *            return ;
 *         }
 *     }
 *  2. 메소드 형식
 *  --------------------------------------------------------------
 *     [접근지정어][옵션사항] 리턴형 메소드명(매개변수(parameter)...) =>선언부
 *     {
 *        구현부
 *        ----변수 선언
 *        ----연산자
 *        ----제어문
 *        -------------결과 값 도출 : 파이썬(예측)
 *        return 결과값 출력;
 *        => 결과값이 없는 경우 void 사용 => return 생략 가능
 *                                     ----------
 *                                         | 모든 메소드는 return을 필요로 한다.
 *                                         | 컴파일러가 자동으로 return 추가
 *     }
 *     => return / import java.lang.* : 자동 추가
 *                        ------------ String , Math, System ...
 *        return에 생략할때는 void인 경우만 가능
 *      *** 모든 프로그램
 *      = 입력 => 변수에 대한 초기화  ORACLE- INSERT,SELECT,UPDATE,DELETE
 *      = 처리부 => 요청에 대한 처리 => CRUD(create, read, update, delete)
 *                                      추가     읽기   수정      삭제
 *                                            ------
 *                                            목록, 상세보기
 *      = 출력 => 사용자가 볼 수 있게 만든다. => HTML , CSS
 *      = main() => 프로그램의 시작과 종료
 *      
 *      public : 모든 클래스 사용 가능
 *      protected : 상속받은 경우 사용 가능, 같은 폴더 안에서 작동 가능
 *      default : 같은 폴더 안에서만 작동
 *      private : 자신의 클래스 안에서만 사용 가능(캡슐화 및 은닉화)
 *  --------------------------------------------------------------
 *      static : 자동 메모리 저장 => new
 *      abstract : 추상 메소드 => 선언만 할 때 사용 (설계 => 요구사항)
 *      final : 수정이 불가능 => String , Math ..
 *                                    -------
 *      리턴형(1개)으로 사용 가능 => 기본형 (int,long,byte,char,double,boolean)
 *                              ----               ----------------
 *                      => 참조형 : 배열 / 클래스
 *                          String , int[]
 *                      => 메소드 매개변수 전송법
 *                        ------------------
 *                         ***call by value
 *                         ***call by reference
 *      매개변수(0개이상)로 사용이 가능 => 기본형: call by value
 *                              => 참조형: call by reference
 *                                 *** 매개 변수가 3개이상이면 배열 / 클래스 사용
 *  
 *  3. 메소드 유형
 *     리턴형           매개변수
 *       o               o
 *         => Stirng substring(int begin) => 원형
 *            -------          ---------
 *            Stirng substring(int begin,int end) => 원형
 *       o               x
 *         => String trim()
 *            ------
 *            double random()
 *            ------
 *       x               o
 *         => void main(String[] args)
 *            ---- 메소드 자체 처리
 *       x               x
 *         => void println() => 다음줄 출력
 *         
 *         *** 한 개의 클래스 안에서 메소드명이 동일할 수 있다.
 *                             -------
 *                                |
 *                               매개변수의 개수나 데이터형이 다르다.
 *                             aaa(int a)
 *                             aaa(double d)
 *                             aaa(int a, int b) => 오버로딩
 *                               => 중복 정의 메소드
 *             plus(int,int) plus(char,char) plus(double,double)
 *    4. 메소드 호출
 *      ----------
 *        = 인스턴스 메소드 => new를 이용해서 메모리 저장
 *          Scanner sc = new Scanner(System.in);
 *          sc.nextInt();
 *        = 클래스 메소드 ( static ) => 공유 => 자동 저장
 *          Math.random();
 *          
 *        => static
 *           클래스명.메소드명()
 *           --------------
 *           => 같은 클래스일 경우 클래스명 생략 가능
 *        => aaa(int a, int b)
 *            =>aaa(10,5)
 *        => int aaa()
 *           int a = aaa() => 리턴형이 존재할 때
 *           ------
 *     5. 리턴값 설정 방법
 *        -----------
 *        int display()
 *        {
 *           return 10;
 *        }
 *        double display()
 *        {
 *           return 10.0;
 *        }
 *        String display()
 *        {
 *           return "10";
 *        }
 *        void display()
 *        {
 *           return;// 생략 가능
 *        }
 *        
 *        int[] display
 *        {
 *           int[] arr = new int[5];
 *           return arr;
 *        }
 *        
 *        ===> 중요 내용 => 여러분 호출이 가능 (재사용)
 *     6. 메소드 사용 목적
 *        = 반복되는 기능 제거
 *        = 코드 유지 보수
 *        = 소스가 간결하다.
 *        = 재사용성 ( 다른 클래스 연동 가능 )
 * */
//5개의 정수를 전송 => 정렬 int[]
//5자리 정수를 전송 => 거꾸로 출력 12345 => 54321 String
import java.util.Arrays;
import java.util.Scanner;
public class 메소드1 {
	public static int input_user() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static String reverse(int data) {
		String dt = String.valueOf(data);
		String result = "";
		for(int i = dt.length()-1;i>=0;i--) {
			result+=dt.charAt(i);
		}
		
		return result;
	}
	public static int[] sort(int[] arr,String type) {
			for(int i = 0; i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(type.equals("ASC")) {
						if(arr[i]>arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
					else if(type.equals("DESC")){
						if(arr[i]<arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
			return arr;
	}
	public static void sort_1(int[] arr,String type) {
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(type.equals("ASC")) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				else if(type.equals("DESC")){
					if(arr[i]<arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	}
	
	public static void process() {
		int[] arr = new int[5];
		for(int i = 0; i<arr.length;i++) arr[i] = (int)(Math.random()*100)+1;
//		System.out.println("정렬 전 : "+Arrays.toString(arr));
//		System.out.println("정렬 후 : "+Arrays.toString(sort(arr,"ASC")));
//		System.out.println("정렬 후 (내림차순): "+Arrays.toString(sort(arr,"DESC")));
		sort_1(arr,"ASC");//배열은 주소를 넘기기 때문에 변함 call by reference
		System.out.println(Arrays.toString(arr));
		sort_1(arr,"DESC");
		System.out.println(Arrays.toString(arr));
		System.out.print("값 입력 : ");
		System.out.println(reverse(input_user()));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 조립
		process();

	}

}
