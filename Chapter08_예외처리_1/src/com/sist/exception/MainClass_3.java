package com.sist.exception;
import java.io.IOException;
import java.sql.SQLException;
//다중 catch => 에러마다 따로 처리
/*    => 에러 코드 ==> 계층 구조 확인 => 크기 (순서가 존재)
 *      try{
 *         문자열 => 정수로 변한 에러
 *      }
 *      catch(NumberFormtaException e){   | 작은 것
 *      }                                 |
 *      catch(NullPointerException e){    |
 *      }                                 |
 *      catch(Exception e){               |
 *      }                                 | 큰 것
 *      
 *                Throwable
 *                ---------
 *                    |
 *         -------------------------
 *         |                       |
 *        Error                  Exception
 *                                 |
 *                       -------------------------
 *                       |                       |
 *                      IOException          RuntimeException
 *                      SQLException             |
 *                                           NumberFormatException
 *                                           ...
 * */
//문자열을 입력 ==> 정수 변환 ==> 배열에 첨부 ===> 배열에 있는 값 /
import java.util.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		String s = sc.next();
		System.out.print("정수 입력 :");
		String s1 = sc.next();
		int[] arr = new int[2];
		try {
			int i = Integer.parseInt(s);
			int i2 = Integer.parseInt(s1);
			arr[0] = i;
			arr[1] = i2;
			
			int result = arr[0]/arr[1];
			System.out.println("result :"+result);
		}
		catch(NumberFormatException e) {
			System.out.println("정수 변환을 할 수 없습니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(RuntimeException e) {
			System.out.println("실행 시 에러...");
		}
		catch(Exception e) {
			System.out.println("기타 에러 발생...");
		}
		catch(Throwable e) {
			System.out.println("에러와 예외처리 잡는다.");
		}
		System.out.println("프로그램 종료");
		//RuntimeException , Throwable
		//SQLException

	}

}
