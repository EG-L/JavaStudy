// 클래스 => 데이터형 => 배열 사용이 가능
/*
 *   3명의 학생 => 이름 , 국어, 영어, 수학 , 총점, 평균
 * */
import java.util.*;
class Student1{
	String name;
	int kor;
	int eng;
	int math;
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1[] std = new Student1[3];//객체 배열 => 일반 배열과 동일
		// => 메모리 할당이 아니다 ... 배열선언
		//std[0] = null
		//std[1] = null
		//std[2] = null
		System.out.println(std[0]);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<std.length;i++) {
			std[i] = new Student1(); // 주소지 선언
			System.out.print((i+1)+"번 째 이름 :");
			std[i].name = sc.next();
			System.out.print((i+1)+"번 째 국어 :");
			std[i].kor = sc.nextInt();
			System.out.print((i+1)+"번 째 영어 :");
			std[i].eng = sc.nextInt();
			System.out.print((i+1)+"번 째 수학 :");
			std[i].math = sc.nextInt();
		}
		
		//출력
		for(int i = 0; i<std.length;i++) {
			System.out.printf("%-7s%-5d%-5d%-5d\n",std[i].name,std[i].kor,std[i].eng,std[i].math);
		}

	}

}
