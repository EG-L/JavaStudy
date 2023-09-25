/*
 *  알파벳 ==> 문자열은 안됨
 *           ---------- 비교연산자를 사용할 수 없다.
 *           compare() 음수 / 양수 / 0
 *           String s = "H";
 *           String s1 = "K";
 *           
 *           s.compare(s1);
 *           -         --
 *           H          K ==> -3
 *           
 *       K, D, M, E, J ==> ASC / DESC > <
 *      -- --
 *      D  K
 *      --    --
 *      D     M
 *      --       --
 *      D        E
 *      --          --
 *      D           J
 *      ---------------- 1Round
 *         -- --
 *         K  M
 *         --    --
 *         E     K
 *         --       --
 *         E        J
 *      ---------------- 2Round
 *            -- --
 *            K  M
 *            --    --
 *            J     K
 *      ---------------- 3Round
 *               -- --
 *                K  M
 *     ----------------- 4Round
 *     D  E   J   K  M
 * */
import java.util.*;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "H";
//		String s1 = "K";
//		
//		System.out.println(s.compareTo(s1));
		char[] alpha = new char[10];
		for(int i = 0; i<alpha.length;i++) {
			alpha[i] = (char)((Math.random()*26)+65);
		}
		System.out.println("==== 정렬 전 ====");
		System.out.println(Arrays.toString(alpha));
		
		System.out.println("==== 정렬 후 ====");
		for(int i =0; i<alpha.length-1;i++) {
			for(int j = i+1;j<alpha.length;j++) {
				if(alpha[i]>alpha[j]) {
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
			System.out.println((i+1)+"Round ==>"+alpha[i]);
			System.out.println(Arrays.toString(alpha));
		}
		System.out.println(Arrays.toString(alpha));
		
		

	}

}
