package com.sist.client;
import java.awt.Color;
import java.util.*;
import java.text.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;
import com.sist.VO.*;
import com.sist.manager.*;

import javax.swing.*;
public class BoardListPanel extends JPanel implements ActionListener,MouseListener{
	JLabel la,pageLa;
	JButton b1,b2,b3,b4;
	JTable table;
	DefaultTableModel model;
	ControlPanel cp;// 화면 변경 ==> <jsp:include>
	int curpage = 1;
	int totalPage = 0;
	BoardManager bm = new BoardManager();
	public BoardListPanel(ControlPanel cp){
		this.cp = cp;
		String[] col = {"번호","제목","이름","작성일","조회수"};
		String[][] row = new String[0][5];
		model = new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		table = new JTable(model);
		table = new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);//데이터 헤더 이동 방지
		table.setShowVerticalLines(false);// 버티컬 삭제
		table.setRowHeight(40);//테이블 높이 조정
		table.getColumn("번호").setPreferredWidth(30);
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(100);
		table.getColumn("작성일").setPreferredWidth(150);
		table.getColumn("조회수").setPreferredWidth(50);
		JScrollPane js = new JScrollPane(table);
		
		b1 = new JButton("새글");
		b2 = new JButton("검색");
		b3 = new JButton("이전");
		b4 = new JButton("다음");
		
		la = new JLabel("자유게시판");
		pageLa = new JLabel("1 page / 1 pages");
		
		//배치
		setLayout(null);
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("굴림체",Font.BOLD,35));
		la.setBounds(10, 15, 700, 50);
		this.add(la);
		
		b1.setBounds(10, 75, 100, 30);
		this.add(b1);
		
		js.setBounds(10, 115, 710, 400);
		this.add(js);
		
		JPanel p = new JPanel();
		p.add(b3);
		p.add(pageLa);
		p.add(b4);
		
		p.setBounds(10,570, 710, 35);
		this.add(p);
		b1.addActionListener(this);
		b3.addActionListener(this);//이전
		b4.addActionListener(this);//다음
		table.addMouseListener(this);
		//=>this => 처리한느 메소드 위치 => 클래스 내부에 존재
		boardList();
	}
	public void boardList() {
		// 전체를 지운다.
		for(int i = model.getRowCount()-1;i>=0;i--) {
			model.removeRow(i);
		}
		ArrayList<BoardVO> list = bm.boardListData(curpage);
		totalPage = bm.boardTotalPage();
		pageLa.setText(curpage+"page / "+totalPage+"pages");
		for(int i = list.size()-1;i>=0;i--) {
			BoardVO vo = list.get(i);
			String[] data = {String.valueOf(vo.getNo()),vo.getSubject(),vo.getName(),new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()),String.valueOf(vo.getHit())};
			
			model.addRow(data);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			cp.bip.tf1.setText("");
			cp.bip.tf2.setText("");
			cp.bip.tf3.setText("");
			cp.bip.ta.setText("");
			cp.card.show(cp, "insert");//바뀐 화면 , 버튼
			
		}
		else if(e.getSource() == b3) {
			if(curpage>1) {
				curpage--;
				boardList();
			}
		}
		else if(e.getSource() == b4) {
			if(curpage<totalPage) {
				curpage++;
				boardList();
			}
		}
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//더블 클릭했을 때 처리
		if(e.getSource()==table) {
			if(e.getClickCount()==2) {//더블클릭
				//게시물번호 가지고 오기
				//윈도우 , 웹 => 클라이언트(전송):서버(응답)
				//             ------------ --------
				//                  문자열     해당 데이터로 변경(Wrapper)
				/*
				 *      오라클 => 숫자(Number) => int, long, double
				 *              문자열(VARCHAR2) => String
				 *              날짜(DATE) => Date
				 * */
				int row=table.getSelectedRow();
				String no = model.getValueAt(row, 0).toString();
//				JOptionPane.showMessageDialog(this, no);
				BoardVO vo = bm.boardDetailData(Integer.parseInt(no));
				cp.dp.noLa.setText(no);
				// 화면 출력시에 => 데이터형이 없다 (문자열 출력)
				/*
				 *    String => String.valueOf(); => 기본형
				 *    Object => toString()
				 * */
				cp.dp.nameLa.setText(vo.getName());
				cp.dp.subLa.setText(vo.getSubject());
				cp.dp.hitLa.setText(String.valueOf(vo.getHit()));
				cp.dp.pane.setText(vo.getContent());
				cp.dp.dateLa.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
				cp.card.show(cp, "detail");
				
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
