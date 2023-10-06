/*
 *    달력 만들기
 *    ---------
 *     절차적 언어 ==> 구조적 프로그램 == 객체지향 프로그램
 *                 => 메소드        => 메소드
 *                 => 지역변수       => 전역변수
 *               매개변수 전송, 리턴형
 *               
 *    1. 년도, 월을 사용자로부터 입력을 받는다.(1-메소드)
 *    2. 전년도까지의 총날수(1년도 1월 1일부터 ~전년도 12월 31일까지)
 *    3. 전달까지의 총날수
 *      -------------+1 (요청한 달의 1일자를 구한다)
 *    4. 총날수%7 => 요일
 *    5. 달력 출력
 *    --------------------------------------------------
 *    6. 조립
 * */
import java.util.Scanner;
public class 메소드4 {
	public static int user_input(String name) {
		Scanner sc = new Scanner(System.in);
		System.out.print(name+" 입력:");
		return sc.nextInt();
	}
	public static int[] yoonnyun(int year) {
		//3. 전달까지의 총날수
		int[] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		// 윤년 조건
		if((year%4==0&&year%100==0)||(year%400==0)) {
			lastday[1] = 29;
		}
		else {
			lastday[1] = 28;
		}
		
		return lastday;
	}
	public static int day(int year,int month) {
		//2. 전년도까지의 총날수(1년도 1월 1일부터 ~전년도 12월 31일까지)
		int total = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		
		int[] lastday = yoonnyun(year);
		
		for(int i = 0;i<month-1;i++) {
			total+=lastday[i];
		}
		
		//요청한 달의 1일자 요일 확인
		total+=1;
		
		//요일 구하기
		return total%7;
	}
	public static void date(int year, int month,int week) {
		//달력 출력
		String[] strWeek = {"일","월","화","수","목","금","토"};
		int[] lastday = yoonnyun(year);
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		for(String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i = 1;i<=lastday[month-1];i++) {
			if(i==1) {
				//공백
				for(int j = 0; j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				System.out.println();
				week = 0;
			}
		}
	}
	public static void process() {
		
		int year = user_input("년도");
		int month = user_input("월");
		
		int day = day(year,month);
		date(year,month,day);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
