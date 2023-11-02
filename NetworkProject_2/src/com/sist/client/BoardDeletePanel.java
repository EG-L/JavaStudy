package com.sist.client;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;

public class BoardDeletePanel extends JPanel implements ActionListener{
	ControlPanel cp;// 화면 변경 
    JLabel titleLa;
    JLabel la,la1;
    JPasswordField pf;
    JButton b1,b2;
    BoardManager bm=new BoardManager();
    public BoardDeletePanel(ControlPanel cp)
    {
    	this.cp=cp;
    	titleLa=new JLabel("삭제하기");
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,45));
    	titleLa.setHorizontalAlignment(JLabel.CENTER);
    	
    	la=new JLabel("비밀번호");
    	pf=new JPasswordField();
    	la1=new JLabel();
    	la1.setVisible(false);
    	b1=new JButton("삭제");
    	b2=new JButton("취소");
    	setLayout(null);
    	titleLa.setBounds(400, 15, 720, 60);
  	    add(titleLa);
  	    add(la1);
  	    la.setBounds(590, 100, 80, 30);
  	    pf.setBounds(680, 100, 200, 30);
  	    add(la);add(pf);
  	    
  	    JPanel p=new JPanel();
  	    p.add(b1);
  	    p.add(b2);
  	    p.setBounds(590, 175, 290, 35);
  	    add(p);
  	    
  	    b1.addActionListener(this);
  	    b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			// 1. 번호 => la1
			String no = la1.getText();
			// 2. 비밀번호 =>
			String pwd = String.valueOf(pf.getPassword());
			if(pwd.trim().length()<1) {
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요.");
				pf.requestFocus();
				return ;
			}
			// => 비밀번호 확인
			String res = bm.boardDelete(Integer.parseInt(no), pwd);
			if(res.equals("YES")) {
				//목록으로 이동
				cp.blp.boardList();//변경된 내용 다시 읽기
				cp.card.show(cp, "Board");
			}
			else if(res.equals("NO")) {
				//비밀번호 재요청
				JOptionPane.showMessageDialog(this, "비밀번호를 다시 입력해주세요.");
				pf.requestFocus();
				return;
			}
			// 웹 => 출력시 문자열, 처리시 정수열
			//       String.valueOf() Integer.parseInt()
			// 웹에서 3대 클래스 => ArrayList, Integer , String
		}
		else if(e.getSource()==b2) {
			cp.card.show(cp, "Detail");//이전 화면으로 이동 history
			
			
		}
	}
}