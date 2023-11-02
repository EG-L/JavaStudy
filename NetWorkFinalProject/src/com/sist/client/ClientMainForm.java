package com.sist.client;
import com.sist.VO.FoodCategoryVO;
import com.sist.client.*;
import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.FoodManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.net.*;
/*
 * FlowLayout - JPanel
 *   -------------------
 *     버튼   버튼  버튼  버튼  ---> ... 버튼 
 *   -------------------
 * GridLayout
 *   -------------------
 *     버튼  버튼  버튼
 *     버튼  버튼  버튼
 *   -------------------
 * BorderLayout - JFrame
 *   -------------------
 *          North
 *   -------------------
 *        |       |
 *   East | Center| West
 *        |       |
 *   -------------------
 *       South
 *   -------------------
 * ---------------
 * CardLayout : 감춘다 => 클릭시 보여준다.
 * */
public class ClientMainForm extends JFrame implements ActionListener,Runnable{
	MenuPanel mp = new MenuPanel();
	ControlPanel cp = new ControlPanel();
	JLabel logo = new JLabel();
	Login login = new Login();
	FoodManager fm = new FoodManager();
	
	//네트워크 관련
	Socket s; // 전화기
	OutputStream out; //송신
	BufferedReader in; // 수신
	public ClientMainForm() {
		this.setLayout(null); // 직접 배치
		logo.setBounds(10, 15, 100, 150);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 100, 150)));
		this.add(logo);
		mp.setBounds(10,175,100,250);//버튼 크기 설정, x위치,y위치,너비,높이
		this.add(mp);//JFrame에 menupanel 추가
		
		cp.setBounds(135, 15, 1500, 830);
		this.add(cp);
		this.setSize(1650,880);//JFrame 사이즈 설정
//		this.setVisible(true);//JFrame 화면 크기 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//X버튼 눌렀을 시 메모리 해제 과정 
		
		//등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this);
		
		ArrayList<FoodCategoryVO> list = fm.foodCategoryData(1);
		cp.hp.cardPrint(list);
		
		cp.cp.tf.addActionListener(this);
		
		cp.cp.b6.addActionListener(this);//프로그램 종료
		
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");//화면 변경
		}
		catch(Exception ex) {}
		new ClientMainForm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1) {
			cp.card.show(cp,"Home");
		}
		else if(e.getSource()==mp.b2) {
			cp.card.show(cp,"find");
		}
		else if(e.getSource()==mp.b3) {
			cp.card.show(cp,"Chat");
		}
		else if(e.getSource()==mp.b4) {
			cp.card.show(cp,"Board");
		}
		else if(e.getSource()==mp.b5) {
			cp.card.show(cp,"News");
		}
		else if(e.getSource()==mp.b6) {
//			System.exit(0);
			try {
				out.write((Function.EXIT+"|\n").getBytes());
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		else if(e.getSource()==login.b1) {
			//서버연결
//			login.setVisible(false);
//			this.setVisible(true);
			String id = login.tf1.getText();
			if(id.trim().length()<1) {
				login.tf1.requestFocus();
				return ;
			}
			
			String name = login.tf2.getText();
			if(name.trim().length()<1) {
				login.tf2.requestFocus();
				return ;
			}
			String sex = "";
			if(login.rb1.isSelected()) {
				sex="남자";
			}
			else {
				sex="여자";
			}
			//서버연결
			connect(id, name, sex);
		}
		else if(e.getSource() == cp.cp.tf) {
			String msg = cp.cp.tf.getText();
			if(msg.trim().length()<1) {
				cp.cp.tf.requestFocus();
				return ;
			//채팅 메시지 전송
			}
			try {
				out.write((Function.WAITCHECK+"|"+msg+"\n").getBytes());//서버로 전송
			} catch (Exception e2) {
				// TODO: handle exception
			}
			cp.cp.tf.setText("");
		}
		else if(e.getSource()==cp.cp.b6) {
			try {
				out.write((Function.EXIT+"|\n").getBytes());
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void connect(String id, String name, String sex) {
		try {
			s = new Socket("localhost",8080);//서버연결
			out = s.getOutputStream();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
	
		}
		//서버로부터 들어오는 데이터를 처리
		new Thread(this).start();
	}
	//=>서버 동작 처리

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				switch(protocol) {
					case Function.LOGIN:{
						String[] data= {
								st.nextToken(),
								st.nextToken(),
								st.nextToken(),
								st.nextToken()
						};
						cp.cp.model2.addRow(data);
					}
					break;
					case Function.MYLOG:{
						login.setVisible(false);
						this.setVisible(true);
					}
					break;
					case Function.WAITCHECK:{
						cp.cp.bar.setValue(cp.cp.bar.getMaximum());
						cp.cp.pane.append(st.nextToken()+"\n");
					}
					break;
					case Function.MYEXIT:{
						System.exit(0);
					}
					break;
					case Function.EXIT:{
						String id = st.nextToken();
						for(int i=0;i<cp.cp.model2.getRowCount();i++) {
							String temp = cp.cp.model2.getValueAt(i, 0).toString();//id 찾기
							if(id.equals(temp)) {
								cp.cp.model2.removeRow(i);
								break;
							}
						}
					}
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
