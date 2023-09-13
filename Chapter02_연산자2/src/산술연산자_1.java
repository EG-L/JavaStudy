// % => 배수 ==> 화폐매수 구하기
public class 산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));
		
		System.out.println("===========================");
		
		int c = 369;
		// 백단위 : 3 , 십단위 : 6, 단단위 : 9
		int temp = c/100; //369/100 => 3
		int temp2 = (c%100)/10; // 369%100 => 69/10 =>6
		int temp3 = (c%10); // 369%10 => 9
		
		System.out.println(temp);
		System.out.println(temp2);
		System.out.println(temp3);
		
		// "합계:"+90+90+90
		//--------- "합계:90"
		//-------------"합계:9090"
		//----------------"합계:909090"
		//
		// "합계:"+(90+90+90) => "합계 : 270"
	}

}
