package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

import com.sist.client.*;
import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.AlbumManager;
import com.sist.manager.MagazineManager;
import com.sist.manager.RealTimeChartManager;
import com.sist.vo.MagazineVO;
import com.sist.vo.RealTimeChartVO;

public class ClientMainForm extends JFrame implements ActionListener,Runnable{
	MenuPanel mp = new MenuPanel();
	JLabel logo = new JLabel();
	ControlPanel cp = new ControlPanel();
	Login login = new Login();
	MagazineManager mm = new MagazineManager();
	AlbumManager am = new AlbumManager();
	RealTimeChartManager rtcm = new RealTimeChartManager();
	
	//네트워크 관련
	Socket s; // 전화기
	OutputStream out; //송신
	BufferedReader in; // 수신
	public ClientMainForm() {
		this.setLayout(null);
		logo.setBounds(10, 15, 100, 150);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\java_data\\logo.png"), 100, 150)));
		
		this.add(logo);
		
		mp.setBounds(10,175,100,250);
		this.add("North",mp);
		
		cp.setBounds(130,15,1500,830);
		this.add(cp);
		
		this.setSize(1650, 880);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setResizable(false);
		
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this);
		
		ArrayList<MagazineVO> list = mm.MagazineCategoryData(1);
		cp.hp.cardPrint(list);
		
		ArrayList<RealTimeChartVO> rtList = rtcm.ReadMusicData();
		cp.mp.MusicPrint(rtList);
		
		cp.cp.tf.addActionListener(this);
		
		cp.cp.b6.addActionListener(this);//프로그램 종료
		
		cp.cp.b4.addActionListener(this);
		
		cp.afp.AlbumPrint(am.AlbumDataRead());
		
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		
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
			cp.card.show(cp, "Home");
		}
		else if(e.getSource()==mp.b2) {
			cp.card.show(cp, "AlbumFind");
		}
		else if(e.getSource()==mp.b3) {
			cp.card.show(cp, "Chat");
		}
		else if(e.getSource()==mp.b4) {
			cp.card.show(cp, "Board");
		}
		else if(e.getSource()==mp.b5) {
			try {
				out.write((Function.EXIT+"|\n").getBytes());
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		else if(e.getSource()==login.b1) {
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
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());//서버로 전송
			} catch (Exception e2) {
				// TODO: handle exception
			}
			cp.cp.tf.setText("");
		}
		else if(e.getSource()==mp.b6) {
			cp.card.show(cp, "Music");
		}
		else if(e.getSource()==cp.cp.b4) {
			String[] info = new String[4];
			int row = cp.cp.table2.getSelectedRow();
			if(row==-1) {
				JOptionPane.showMessageDialog(this, "정보를 보기 위한 사용자를 클릭해주세요.");
				return;
			}
			UserInfoPanel uip = new UserInfoPanel();
			for(int i = 0;i<cp.cp.table2.getColumnCount();i++) {
				info[i] = String.valueOf(cp.cp.table2.getModel().getValueAt(row, i));
			}
			uip.UserData(info);
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
					case Function.WAITCHAT:{
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
