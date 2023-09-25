/*
 * 3명의 학생 => 국어, 영어, 수학 : 총점 평균 학점 등수 출력
 *                                      -----
 * */

import java.util.Scanner;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] kor = new int[3];
		int [] eng = new int[3];
		int [] math = new int[3];
		int [] total = new int[3];
		int [] rank = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		
		// 1명 => index번호가 같은 것
		// 초기화
		// ----- 국어, 영어, 수학
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<kor.length;i++) {
			System.out.print((i+1)+"번째 학생 국어 점수 : ");
			kor[i] = sc.nextInt();
			
			System.out.print((i+1)+"번째 학생 영어 점수 : ");
			eng[i] = sc.nextInt();
			
			System.out.print((i+1)+"번째 학생 수학 점수 : ");
			math[i] = sc.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			
			avg[i] = total[i]/(double)total.length;
		}
		/*
		 *   -----
		 *   98
		 * */
		//학점 출력
		for(int i=0;i<kor.length;i++) {
			switch((int)avg[i]/10) {
				case 10:case 9:
					score[i]='A';
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
		//등수 구하기
		for(int i = 0; i<total.length;i++) {
			rank[i] = 1;
			for(int j=0;j<total.length;j++) {
				if(total[i]<total[j]) rank[i]+=1;
			}
		}
		//출력
		for(int i = 0; i<kor.length;i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c%-5d\n",kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}

	}

}
