package com.sist.manager;
import java.util.*;

import com.sist.VO.FoodCategoryVO;
import com.sist.VO.FoodHouseVO;
import com.sist.client.ClientMainForm;

import java.io.*;
public class FoodManager {
	private static ArrayList<FoodCategoryVO> cList = new ArrayList<FoodCategoryVO>();
	private static ArrayList<FoodHouseVO> fList = new ArrayList<FoodHouseVO>();
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
//		FileReader fr = null;
//		BufferedReader br = null;
//		FileInputStream fis = null;
//		ObjectInputStream ois = null;
//		try {
//			fis = new FileInputStream("c:\\java_data\\food_house.txt");
//			br = new BufferedReader(new InputStreamReader(fis));
////			ois = new ObjectInputStream();
//			StringBuffer sb = new StringBuffer();
//			while(true) {
//				String data = br.readLine();
////				data=data.substring(0,data.indexOf("?"));
//				if(data==null) {
//					break;
//				}
//				data+="\n";
//				sb.append(data);
//			}
//			String food_data = sb.toString();
//			String[] fd = food_data.split("\n");
//			System.out.println(Arrays.toString(fd));
//			for(String s :fd) {
//				StringTokenizer st = new StringTokenizer(s,"|");
//				
//				FoodHouseVO vo = new FoodHouseVO();
//				vo.setFno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
//				vo.setCno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
//				vo.setName(st.nextToken());
//				vo.setScore(Double.parseDouble(st.nextToken()));
//				vo.setAddr(st.nextToken());
//				vo.setPhone(st.nextToken());
//				vo.setType(st.nextToken());
//				vo.setPrice(st.nextToken());
//				vo.setParking(st.nextToken());
//				vo.setTime(st.nextToken());
//				vo.setMenu(st.nextToken());
//////				String k = st.nextToken();
////				while(st.hasMoreTokens()) {
////					k+= "|"+st.nextToken();
////				}
//				vo.setPoster(st.nextToken());
//				fList.add(vo);
//			}
//			
//			FileOutputStream fos = new FileOutputStream("c:\\java_data\\fh.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(fList);
//			
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();//에러 확인
//		}
//		finally {
//			try {
//				fis.close();
//				br.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
//		fis = null;
//		ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\fh.txt");
			ois = new ObjectInputStream(fis);
			fList = (ArrayList<FoodHouseVO>)ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		FoodManager fm = new FoodManager();
		for(FoodHouseVO vo:fList) {
			System.out.println(vo.getFno());
			System.out.println(vo.getCno());
			System.out.println(vo.getName());
			System.out.println(vo.getAddr());
			System.out.println(vo.getPhone());
			System.out.println(vo.getMenu());
			System.out.println(vo.getPoster());
		}
	}
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
	public FoodCategoryVO categoryInfoData(String title) {
		FoodCategoryVO vo = new FoodCategoryVO();
		for(FoodCategoryVO fVO : cList) {
			if(fVO.getTitle().equals(title)) {
				vo = fVO;
				break;
			}
		}
		return vo;
	}
	
	public ArrayList<FoodHouseVO> foodHouseListData(int cno){
		ArrayList<FoodHouseVO> list = new ArrayList<FoodHouseVO>();
		for(FoodHouseVO fVO:fList) {
			if(fVO.getCno()==cno) {
				list.add(fVO);
			}
		}
		return list;
	}
	
	public FoodHouseVO foodInfoData(int fno) {
		FoodHouseVO vo = new FoodHouseVO();
		for(FoodHouseVO fVO:fList) {
			if(fVO.getFno()==fno) {
				vo=fVO;
				break;
			}
		}
		return vo;
	}

}
