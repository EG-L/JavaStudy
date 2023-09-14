/*
 * ==> 윤년여부
 * ---> 4년마다 윤년
 *      100년마다 한번씩 제외
 *      400년마다 한번씩 윤년
 * */
import java.util.Scanner;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		System.out.println(
			(year%4==0&&year%100!=0)||(year%400==0)?year+"년도는 윤년이다.":year+"년도는 윤년이 아니다."
		);

	}

}
