package com.sist.manager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.sist.vo.*;
public class AlbumManager {
	private static ArrayList<AlbumVO> aList = new ArrayList<AlbumVO>();
	
	public AlbumManager() {
//		FileReader fr = null;
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		try {
//			fr = new FileReader("c:\\java_data\\GenieAlbum.txt");
//			int i = 0;
//			StringBuffer sb = new StringBuffer();
//			while((i=fr.read())!=-1) {
//				sb.append((char)i);
//			}
//			/*
//			 * private int no;
//	private String image;
//	private String album;
//	private String title;
//	private String artist;
//	private String regdate;
//			 * */
//			String[] data = sb.toString().split("\n");
//			for(String s:data) {
//				AlbumVO vo = new AlbumVO();
//				String[] d = s.split("\\|");
//				vo.setNo(Integer.parseInt(d[0].replace("\ufeff", "")));
//				vo.setImage(d[1]);
//				vo.setAlbum(d[2]);
//				vo.setTitle(d[3]);
//				vo.setArtist(d[4]);
//				vo.setRegdate(d[5]);
//				
//				aList.add(vo);
//			}
//			fr.close();
//			fos = new FileOutputStream("c:\\java_data\\ad.txt");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(aList);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		finally {
//			try {
//				fos.close();
//				oos.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\ad.txt");
			ois = new ObjectInputStream(fis);
			aList = (ArrayList<AlbumVO>)ois.readObject();
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
//		AlbumManager am = new AlbumManager();
//		
//		for(AlbumVO a : aList) {
//			System.out.println(a.getNo());
//		}
//	}
	public ArrayList<AlbumVO> AlbumInfoData(String title,String dataForm){
		ArrayList<AlbumVO> list = new ArrayList<AlbumVO>();
		if(dataForm.equals("곡명")) {
			for(AlbumVO vo:aList) {
				if(vo.getTitle().contains(title)) {
					list.add(vo);
				}
			}
		}
		else if(dataForm.equals("가수명")) {
			for(AlbumVO vo:aList) {
				if(vo.getArtist().contains(title)) {
					list.add(vo);
				}
			}
		}
		
		return list;
	}
	
	public ArrayList<AlbumVO> AlbumDataRead(){
		
		return aList;
	}

}
