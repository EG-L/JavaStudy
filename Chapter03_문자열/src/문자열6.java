import java.util.Scanner;
//startsWith,endsWith,contains => 검색기 자동완성기
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {"Java와 JSP","Java와 Oracle","Oracle Programming","JQuery AND AJAX","Spring AND Java"};//배열
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색어 입력 : ");
		String findData = sc.nextLine();//next 공백 앞 , nextLine 전체 줄
		System.out.println(findData);
		
		for(int i =0;i<data.length;i++) {
//			if(data[i].startsWith(findData)) {//앞의 문장
//			if(data[i].endsWith(findData)) {//맨 뒤의 문장
			if(data[i].contains(findData)) {//전체 포함된 문장
				try {
					Thread.sleep(1000);
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
				System.out.println(data[i]);
			}
		}

	}

}
