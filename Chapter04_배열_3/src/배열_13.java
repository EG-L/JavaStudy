import java.util.*;
public class 배열_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;//Scope => 사용범위
		while(true) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 최대 값, 최소 값");
			System.out.println("2. 총합");
			System.out.println("3. 평균");
			System.out.println("4. 종료");
			System.out.println("====================");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if(menu==4) {
				break;
			}
			else if(menu==1) {
				int max=arr[0],min=arr[0];
				for(int i = 0; i<arr.length;i++) {
					if(arr[i]>max) max=arr[i];
					if(arr[i]<min) min=arr[i];
				}
				System.out.println("최대 값 : "+max);
				System.out.println("최소 값 : "+min);
			}
			else if(menu==2) {
				sum = 0;
				for(int i:arr) {
					sum+=i;
				}
				System.out.println("총합 : "+sum);
			}
			else if(menu==3) {
				sum = 0;
				for(int i:arr) {
					sum+=i;
				}
				double avg = sum/10.0;
				System.out.printf("평균 : %.2f\n",avg);
			}
			else {
				continue;
			}
		}

	}

}
