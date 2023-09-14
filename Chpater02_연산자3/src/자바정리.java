
public class 자바정리 {
	public static void main(String[] args) {
		int javaScore = 83;
		int pythonScore = 100;
		
		System.out.println(javaScore+pythonScore);//int+int => 183 출력
		System.out.println("두 시험 점수의 합 : "+javaScore+pythonScore);//str+int+int
		//                 ----------------------------
		//                   "두 시험 점수의 합 : 83"
		//                 ----------------------------------------
		//                       "두 시험 점수의 합 : 83100"
		
		System.out.println("두 시험 점수의 합 : "+(javaScore+pythonScore));
		/*
		 * 데이터의 묵시적 변환
		 *    byte < char < int < long < float < double
		 *           short
		 *     =====================================> UpCasting(자동형변환)
		 *    <=====================================  DownCasting(강제형변환)
		 * */
		
		char charA = 'A';
		int intA = charA;
		System.out.println("문자A(char) -> 정수(int) : "+ intA);
		
		int intZ = 90;
		char charZ = (char)intZ;
		System.out.println("정수90(int)->문자Z(char) : "+ charZ);
	}
}
