package com.sist.manager;

import java.util.*; // ArrayList, Date
import java.text.*; // SimpleDateFormat
import java.io.*; // File관련 => ObjectInputStream/ObjectOutputStream
import com.sist.VO.*;
public class BoardManager {
	//게시물 목록 => 모아서 관리
	private static ArrayList<BoardVO> bList = new ArrayList<BoardVO>();
	//값을 채운다.
	static{
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\board.txt");
			ois = new ObjectInputStream(fis);
			
			bList = (ArrayList<BoardVO>)ois.readObject();
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
	// 목록 출력
	public ArrayList<BoardVO> boardListData(int page){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		int j =0;
		int rowSize =10; //화면에 출력하는 갯수
		int pagecnt = (page*rowSize)-rowSize;
		/*
		 *   1page => 0~9
		 *   2page => 10~19
		 *   3page => 20~29
		 * */
		// 오라클 => 인라인뷰
		// MySql => LIMIT
		for(int i = 0; i<bList.size();i++) {
			if(j<10 && i>=pagecnt) {
				BoardVO vo = bList.get(i);
				list.add(vo);
				j++;
			}
		}
		return list;
	}
	
	public int boardTotalPage() {
		return (int)(Math.ceil(bList.size()/10.0));
		// ceil => 올림함수 => 소수점이 0이 아닌 경우 올라간다.
	}
	public void boardInsert(BoardVO vo) {
		bList.add(vo);//메모리 => 프로그램 종료 시 사라짐
		fileSave();
	}
	public void fileSave() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("c:\\java_data\\board.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(bList);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				fos.close();
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	// 데이터 추가 ===
	// 상세보기
	public BoardVO boardDetailData(int no) {
		BoardVO vo = new BoardVO();
		for(int i = 0; i<bList.size();i++) {
			BoardVO bVO = bList.get(i);
			if(bVO.getNo()==no) {
				bVO.setHit(bVO.getHit()+1);//조회수 증가
				vo=bVO;
				fileSave();//파일과 list가 동일
				break;
				// 다음주부터 =>파일 /오라클
				//UPDATE board SET hit = hit+1 WHERE no=1;
				//오라클 (웹 핵심) => SQL
				//SQL (CRUD => SELECT, INSERT, UPDATE, DELETE)
			}
		}
		return vo;
	}
	// 수정하기 ===
	public BoardVO boardUpdateData(int no) {
		BoardVO vo = new BoardVO();
		//SELECT * FROM board WHERE no=1;
		for(BoardVO bVO:bList) {
			if(bVO.getNo()==no) {
				vo = bVO;
				break;
			}
		}
		return vo;
	}
	public String boardUpdate(BoardVO vo) {
		String result = "NO";
		for(int i = 0; i<bList.size();i++) {
			BoardVO pVO = bList.get(i);
			if(vo.getNo()==pVO.getNo() && vo.getPwd().equals(pVO.getPwd())) {
				result = "YES";
				pVO.setContent(vo.getContent());
				pVO.setName(vo.getName());
				pVO.setSubject(vo.getSubject());
				//bList의 i번째 인덱스의 위치를 vo로 바꾼다.
				fileSave();
				break;
			}
		}
		
		return result;
	}
	// 삭제하기 === 동일 코딩 ==> 파일에 저장 
	public String boardDelete(int no, String pwd) {
		String result = "NO";//NO,YES
		
		for(int i =0;i<bList.size();i++) {
			BoardVO vo = bList.get(i);
			if(vo.getNo()==no && vo.getPwd().equals(pwd)) {
				result="YES"; // 삭제
				bList.remove(i);
				fileSave();
				break;
			}
		}
		
		return result;
		
	}
	// 검색하기
	// 자동 증가번호 만들기 => sequence
	// SELECT MAX(no)+1 FROM Board
	public int boardSequence() {
		int max = 0;
		for(BoardVO vo:bList) {
			if(vo.getNo()>max) {
				max = vo.getNo();
			}
		}
		return max+1;
	}
	// 공통 => 파일 저장
}
