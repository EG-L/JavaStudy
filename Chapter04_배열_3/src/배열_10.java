// => 문자 10개 저장
// => 저장된 문자 출력
// => 저장된 문자 거꾸로 출력 => 0, length-1
import java.util.Arrays;
public class 배열_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = (char)((Math.random()*26)+65);
		}
		
		System.out.println("======= 정상 출력 =======");
		
		for(char c:arr) {//처음부터 출력
			System.out.print(c + " ");
		}
		
		System.out.println("\n======= 거꾸로 출력 =======");
		
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		// Arrays.sort() => ASC => DESC (반대로 출력)

	}

}
