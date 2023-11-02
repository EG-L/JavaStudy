package com.sist.client;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import com.sist.vo.*;
import com.sist.manager.*;

public class BoardUpdatePanel extends JPanel implements ActionListener{
	ControlPanel cp;
    JLabel titleLa;
    JLabel la1,la2,la3,la4,la5;
    JTextField tf1,tf2;
    JPasswordField pf;
    JTextArea ta;
    JButton b1,b2;
    BoardManager bm=new BoardManager();
    public BoardUpdatePanel(ControlPanel cp)
    {
   	     this.cp=cp;
   	     titleLa=new JLabel("수정하기");
    	 titleLa.setFont(new Font("맑은 고딕",Font.BOLD,45));
    	 titleLa.setHorizontalAlignment(JLabel.CENTER);
    	 
    	 la1=new JLabel("이름");//<label for="name">이름</label>
    	 la2=new JLabel("제목");
    	 la3=new JLabel("내용");
    	 la4=new JLabel("비밀번호");
    	 la5=new JLabel("");
    	 la5.setVisible(false);//인비저블 상태
    	 tf1=new JTextField();//<input type=text>
    	 tf2=new JTextField();
    	 ta=new JTextArea();//<textarea></textarea>
    	 JScrollPane js=new JScrollPane(ta);
    	 pf=new JPasswordField();//<input type=password>
    	 
    	 b1=new JButton("수정");//<input type=button>
    	 b2=new JButton("취소");
    	 
    	 // 배치 
    	 setLayout(null);// css
    	 titleLa.setBounds(400, 15, 720, 60);
	   	 add(titleLa);
	   	 
	   	 la1.setBounds(400,85, 80, 30);
	   	 tf1.setBounds(485,85,150, 30);
	   	 
	   	 la2.setBounds(400,120, 80, 30);
	   	 tf2.setBounds(485,120,450, 30);
	   	 
	   	 la3.setBounds(400,155, 80, 30);
	   	 js.setBounds(485,155,450, 350);
	   	 
	   	 la4.setBounds(400,510, 80, 30);
	   	 pf.setBounds(485,510,150, 30);
	   	 
	   	 JPanel p=new JPanel();
	   	 p.add(b1);
	   	 p.add(b2);
	   	 p.setBounds(450, 545,525 , 35);
	   	 add(la5);
	   	 // 추가
	   	 add(la1);add(tf1);
	   	 add(la2);add(tf2);
	   	 add(la3);add(js);
	   	 add(la4);add(pf);
	   	 add(p);
	   	 
	   	 b1.addActionListener(this);
	   	 b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) {
			cp.card.show(cp, "Detail");
		}
		else if(e.getSource()==b1) {
			String name = tf1.getText();
			String subject = tf2.getText();
			String content = ta.getText();
			String pwd = String.valueOf(pf.getPassword());
			if(pwd.trim().length()<1) {
				JOptionPane.showMessageDialog(this, "비밀번호를 입력해주세요.");
				pf.requestFocus();
				return;
			}
			
			String no = la5.getText();
			BoardVO vo = new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			vo.setNo(Integer.parseInt(no));
			
			String result = bm.boardUpdate(vo);
			
			if(result.equals("YES")) {
				cp.card.show(cp, "Board");
				cp.blp.boardList();
				
			}
			else {
				JOptionPane.showMessageDialog(this, "비밀번호를 다시 입력해주세요.");
				pf.setText("");
				pf.requestFocus();
				return;
			}
			//sendRedirect("detail.jsp")

		}
	}
}