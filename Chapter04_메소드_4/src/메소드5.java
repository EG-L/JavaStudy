/*
 *    1. 반복이 많은 경우
 *    예)
 *       오라클 연결
 *       오라클 닫기
 *       데이터 추가
 *         //= 오라클 연결
 *         = 데이터 추가 처리
 *         //= 오라클 닫기
 *       데이터 수정
 *         //= 오라클 연결
 *         = 데이터 수정 처리
 *         //= 오라클 닫기
 *       데이터 삭제
 *         //= 오라클 연결
 *         = 데이터 삭제 처리
 *         //= 오라클 닫기
 *       데이터 검색
 *         //= 오라클 연결
 *         = 데이터 검색 처리
 *         //= 오라클 닫기
 *    2. 다른 클래스와 연결
 *      --------------- 웹
 *    3. 재사용 => 미리 제작하고 필요시마다 호출
 *      ------ 기능을 한가지만 수행하게 만든다.
 *      
 *    3명의 학생의 국어, 영어, 수학 => 총점 , 평균 , 학점 , 등수 출력
 *    ---------------------------------------------------
 *    
 *    => 자바 / 오라클 / HTML / CSS / JavaScript
 *    ---------------------------------------------------
 *           |      R        Python(개인프로젝트)
 *          JSP / Spring / Spring-boot ==> 서버단(Back-End)
 *          DBCP  MyBatis    JPA
 *          -------------  -----------
 *             ORACLE        MySQL
 *          --------------------------
 *          => DataBase 연동
 *            ------------- 웹 흐름   ====> Front(Jquery,Ajax)
 *          => Spring => 라이브러리 ( 기능 ) ====> Front(View.js ==> Vuex)
 *          => 실무에서 사용하는 기술 ==> Front(ReactJs==>Redux)
 * */
// 응용 => 
import java.util.Scanner;
public class 메소드5 {
	public static void user_input(int[] kor, int[] eng,int[] math,int[] total,double[] avg) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<kor.length;i++) {
			System.out.print((i+1)+"번 째 국어 점수:");
			kor[i] = sc.nextInt();
			
			System.out.print((i+1)+"번 째 영어 점수:");
			eng[i] = sc.nextInt();
			
			System.out.print((i+1)+"번 째 수학 점수:");
			math[i] = sc.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
	}
	public static void hakjum(char[] score,double[] avg) {
		//학점
		for(int i = 0; i<score.length;i++) {
			switch((int)(avg[i]/10.0)) {
				case 10: case 9:
					score[i] = 'A';
					break;
				case 8:
					score[i] = 'B';
					break;
				case 7:
					score[i] = 'C';
					break;
				case 6:
					score[i] = 'D';
					break;
				default:
					score[i] = 'F';
			}
		}
	}
	public static void rank(int[] rank,int[] total) {
		//등수 구하기
		for(int i = 0;i<3;i++) {
			rank[i]=1;
			for(int j=0;j<3;j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
	}
	public static void print(int[] kor, int[] math,int[] eng,int[] total,double[] avg,char[] score,int[] rank) {
		//출력
		for(int i = 0; i<3;i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%5c%5d\n",kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
	}
	public static void process() {
		int[] kor = new int[3];
		int[] math = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		int[] rank = new int[3];
		user_input(kor, eng, math, total, avg);
		hakjum(score, avg);
		rank(rank, total);
		print(kor,math,eng,total,avg,score,rank);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call by reference
		process();

	}

}
