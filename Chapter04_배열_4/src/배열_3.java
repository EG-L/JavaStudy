/*
 *  ***알고리즘 : 정렬(선택 정렬, 버블 정렬)
 *  ***자료구조 : 데이터 관리 (추가 => 가지고 오기)
 *              Stack (LIFO)/ Queue (FIFO)/ Deque(둘다 가능)
 *              :메모리        :네트워크
 *  ------------------------------------------------------
 *  선택 정렬 => 한 개를 선택해서 변경
 *  버블 정렬 => 인접한 것끼리 변경
 *  
 *    선택 정렬
 *    30  10  20  50  40
 *    --  --
 *    10  30
 *    --      --
 *    10      20
 *    --          --
 *    10          50
 *    --              --
 *    10              40
 *    ------------------ 1 Round
 *        --  --
 *        20  30
 *        --      --
 *        20      50
 *        --          --
 *        20          40
 *    ------------------ 2 Round
 *            --  --
 *            30  50
 *            --      --
 *            30      40
 *    ------------------ 3 Round
 *                --  --
 *                40  50
 *    ------------------ 4 Round
 *    10  20  30  40  50
 *    
 *    
 *    버블 정렬 => 오른쪽 정렬
 *    ------
 *    30  10  20  50  40
 *    --  --
 *    10  30
 *        --  --
 *        20  30
 *            --  --
 *            30  50
 *                --  --
 *                40  50
 *    ------------------
 *    10  20  30  40
 *    --  --
 *    10  20
 *        --  --
 *        20  30
 *            --  --
 *            30  40
 *    ------------------
 *    10  20  30
 *    --  --
 *    10  20
 *        --  --
 *        20  30
 *    ------------------
 *    10  20
 *    --  --
 *    10  20
 *    ------------------
 * */
import java.util.Arrays;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i =0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("=========== 정렬 전 ===========");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=========== 정렬 후 ===========");
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("========= "+(i+1)+"Round =========");
		}
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
