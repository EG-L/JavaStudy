package com.sist.lib;
/*
 *     Random : 임의의 난수 발생
 *       => nextInt(int bound) ==> 0~bound-1 발생
 *     326page
 *      Arrays : 배열과 관련된 기능 제어
 *      ------
 *       1) sort => 정렬
 *          ==> ORDER BY no DESC(ASC) => 시간이 오래 걸린다.
 *              ==> index (최적화) ***
 *       2) copyOf => 다른 배열에서 복사
 *       3) toString() => 배열값 출력
 *     328page  StringTokenizer
 *       ==> 문자열 분리
 *       ==> split() => 정규식을 이용 => 쉽게 제작
 *       ==> 네트워크 / 빅데이터 / 웹
 *       ==> 기능(메소드)
 *           1) countToekns() : 분리된 데이터 개수
 *           2) nextToken() : 실제 분리된 데이터 ( 읽기 )
 *           3) hasMoreToken() : 분리된 수만큼 루프 수행
 *      
 * */
import java.util.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[7];
		Random r = new Random();
		for(int i = 0; i<arr.length;i++) {
			arr[i] = r.nextInt(100)+1;
		}
		System.out.println("========= 정렬 전 =========");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("========= 정렬 후 =========");
		Arrays.sort(arr); // ASC
		System.out.println(Arrays.toString(arr));
		// 가변 배열
		// 작은 배열을 만들 때
		int[] subarr = Arrays.copyOf(arr, 3);
		// 나머지 영역은 초기값 설정
		/*
		 *    int => 0
		 *    double = 0.0
		 *    class = null
		 *    boolean = false
		 * */
		System.out.println(Arrays.toString(subarr));
		// 큰 배열로 변경할 때
		int[] subarr2 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(subarr2));

	}

}
