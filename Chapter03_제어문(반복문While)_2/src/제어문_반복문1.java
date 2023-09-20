/*
 *   while => 1차
 *   ----------- 응용 (파일 읽기, 데이터베이스(오라클연동))
 *   일반 프로그램의 반복문 ( for )
 *   형식)
 *       초기값 =========1
 *       while(조건식)2{ => 무한루프 ( while(true) )
 *          반복 수행 문장3
 *          증감식4 =============>2번 이동
 *                              ------ false 종료
 *                              ------ true 문장 수행
 *       }
 *       
 *       ==> 응용
 *       for()
 *       {
 *         for()
 *         {
 *         
 *         }
 *       }
 *       ------------------
 *       for()
 *       {
 *          while()
 *          {
 *              if()
 *              {
 *                  for()
 *                  {
 *                  }
 *              }
 *          }
 *       }
 *       -------------------
 *       
 * */
//1~100까지의 짝수의 합, 홀수의 합 (while)
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,odd=0,even=0;
		int i =1;
		while(i<101) {
			if(i%2==0) even+=i;
			else odd+=i;
			
			i++;
		}
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);

	}

}
