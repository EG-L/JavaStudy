package com.sist.manager;
import java.util.*;

import com.sist.VO.FoodCategoryVO;
import com.sist.VO.FoodHouseVO;
import com.sist.client.ClientMainForm;

import java.io.*;
public class FoodManager {
	private static ArrayList<FoodCategoryVO> cList = new ArrayList<FoodCategoryVO>();
	private static ArrayList<FoodHouseVO> flist = new ArrayList<FoodHouseVO>();
	/*
	 *                     Throwable
	 *                     ---------
	 *                         |
	 *            --------------------------------
	 *            |                              |
	 *           Error                        Exception
	 *                                           |
	 *                        ----------------------------------------
	 *                        |                                      |
	 *                      checkedException                   uncheckedException
	 *                      ----------------                   ------------------
	 *                      컴파일시 예외처리 확인                    예외처리 확인(X)
	 *                      ----------------                   -----------------------
	 *                       java.io                             java.lang
	 *                       java.net                            java.util
	 *                       java.Sql
	 *                목적 : 에러를 사전에 방지
	 *                      에러시 정상 수행을 할 수 있게 만든다.                            
	 * */
	//초기화블록 => static 변수가 있는 경우에 주로 사용
	// 자동수행이 된다, 상속은 안된다.
	static {
//		FileReader fr = null;
//		ObjectOutputStream oos = null;
//		FileOutputStream fos = null;
//		try {// 정상 수행 문장
//			fr = new FileReader("c:\\java_data\\food_category.txt");
//			StringBuffer sb = new StringBuffer();
//			int i = 0;
//			while((i=fr.read())!=-1) {
//				sb.append((char)i);
//			}
//			fr.close();
//			String[] cates = sb.toString().split("\n");
//			for(String s:cates) {
//				StringTokenizer st = new StringTokenizer(s,"|");
//				FoodCategoryVO vo = new FoodCategoryVO();
//				vo.setCno(Integer.parseInt(st.nextToken().replace("\ufeff","")));
//				vo.setTitle(st.nextToken());
//				vo.setSubject(st.nextToken());
//				vo.setPoster(st.nextToken());
//				cList.add(vo);
//			}
//			fos = new FileOutputStream("c:\\java_data\\fc.txt");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(cList);
//		} catch (Exception e) {//에러 확인 후 복구
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {//무조건 수행하는 문장
//			try {
//				fos.close();
//				oos.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\fc.txt");
			ois = new ObjectInputStream(fis);
			cList = (ArrayList<FoodCategoryVO>)ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
//	public static void main(String[] args) {
//		FoodManager fd = new FoodManager();
//		for(FoodCategoryVO vo:cList) {
//			System.out.println(vo.getCno());
//			System.out.println(vo.getTitle());
//			System.out.println(vo.getSubject());
//			System.out.println(vo.getPoster());
//			System.out.println("=======================================");
//		}
////		System.out.println("저장완료");
//	}
	public ArrayList<FoodCategoryVO> foodCategoryData(int no){
		ArrayList<FoodCategoryVO> list = new ArrayList<FoodCategoryVO>();
		int start = 0;
		int end = 0;
		if(no==1) {
			start=0;
			end=11;
		}
		else if(no==2) {
			start=12;
			end=17;
		}
		else if(no==3) {
			start=18;
			end=29;
		}
		for(int i =start;i<end+1;i++) {
			list.add(cList.get(i));
		}
		return list;
	}

}
