import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		System.out.println("일 입력 : ");
		int day = sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
		// 메모리 할당 => 싱글톤 (한개만 생성)
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);//month가 0번부터 시작해서 -1 입력 1월 => 0
		cal.set(Calendar.DATE, day);
		
		char[] strWeek = {'일','월','화','수','목','금','토'};
		int week = cal.get(Calendar.DAY_OF_WEEK);//요일 읽기
		System.out.println(year+"년도 "+month+"월 "+day+"일 "+ strWeek[week-1]+ "요일 입니다.");
	}

}
