//가장 기본이 되는 연산자 : 산술연산자 ( 38 page )
/*
 *    산술연산자 : + , - , * , / , %(나누고 나머지 값)
 *    ----------- 이항 연산자(피연산자 (연산 대상) 2개)
 *    
 * */
import java.util.Scanner;
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+(산술)
		// 국어, 영어, 수학 점수의 총점을 구하여라
		int kor = 89;
		int eng = 90;
		int math = 88;
		int total = kor+eng+math;
		
		System.out.println("국어 점수 : "+kor);
		System.out.println("수학 점수 : "+math);
		System.out.println("영어 점수 : "+eng);
		System.out.println("총점 : "+total);
		System.out.println("평균 : " + total/3.0 );
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * kor = sc.nextInt();
		 * 
		 * eng = sc.nextInt();
		 * 
		 * math = sc.nextInt();
		 * 
		 * total = kor+eng+math;
		 * 
		 * System.out.println("국어 점수 : "+kor); System.out.println("수학 점수 : "+math);
		 * System.out.println("영어 점수 : "+eng); System.out.println("총점 : "+total);
		 * System.out.println("평균 : " + total/3.0 ); double avg = total/3.0;
		 * System.out.printf("평균 : %.2f" ,avg );
		 */
		
		System.out.println("============== % ==================");
		int a = 5;
		int b = 2;
		System.out.println(a+"%"+b+"="+(5%2));
		System.out.println(-a+"%"+b+"="+(-5%2));
		System.out.println(a+"%"+-b+"="+(5%-2));
		System.out.println(-a+"%"+-b+"="+(-5%-2));
		
		System.out.println("============== 형변환 ==================");
		/*
		 * 자동 형변환
		 * UpCasting(작은 데이터형 -> 큰 데이터형)
		 * 강제 형변환
		 * DownCasting(큰 데이터형 -> 작은 데이터형)
		 * byte < char < int < long < float < double
		 *        short
		 *      <============= 강제 형변환
		 *      
		 *   자동형변환
		 *   int a = 'A';
		 *    => a = 65
		 *   double d = 100;
		 *              --- int
		 *      > d = 100.0
		 * */
		
		int aa = 'A';
		System.out.println("aa : "+aa);
		double dd = 100;
		System.out.println("dd : "+dd);
		
		System.out.println(100+10.5+10.5F+'A');
		//               100.0       10.5 65.0
		// 자동 형변환이 있는 경우 => 연산은 같은 데이터형끼리만 연산
		
		/*
		 *  'A'+10
		 *  --- -- int
		 *  char =>65 + 10 = 75
		 * */
		System.out.println('A'+'B'); // 65+66 = 131
		// int 이하의 경우 (byte, char,short) 연산 => 결과 값은 int

	}

}
