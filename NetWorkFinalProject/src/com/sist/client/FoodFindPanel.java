package com.sist.client;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import com.sist.VO.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;
import java.net.*;
public class FoodFindPanel extends JPanel implements  ActionListener{
	JTextField tf;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model;
	ControlPanel cp;
	FoodManager fm = new FoodManager();
	
	public FoodFindPanel(ControlPanel cp) {
		this.cp = cp;
		tf = new JTextField(20);
		b1 = new JButton("검색");
		b2 = new JButton("홈이동");
		
		String[] col = {"","업체명","음식종류"};
		Object[][] row = new Object[0][3];//가변배열 지정
		
		//익명의 클래스 : 상속없이 오버라이딩 => 내부 클래스
		/*
		 *   내부 클래스 : 멤버 클래스(네트워크,쓰레드)
		 *   => 두 개의 클래스가 서로 공유하는 데이터가 있는 경우
		 *   => 네트워크 (서버)
		 *      = 대기 ==> 접속자의 IP
		 *      = 통신
		 *      
		 *      class Server
		 *      {
		 *         Vector vc = new Vector() => IP정보 저장
		 *         => 접속시 처리
		 *         class Client ==> Thread
		 *         {
		 *           => vc이용 => 클라이언트마다 통신
		 *         }
		 *      }
		 *      
		 *      ==> 실시간 데이터 수집 ==> 분석 => 실시간 시각화
		 *          ---------------------
		 *            |스파크
		 *   
		 * */
		model = new DefaultTableModel(row,col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
		};
		// Class.forName("")
		table = new JTable(model);
		table.setRowHeight(60);
		
		JScrollPane js = new JScrollPane(table);
		
		// 배치
		JPanel p = new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		this.setLayout(new BorderLayout());
		this.add("North",p);
		this.add("Center",js);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
		
	}
	
	public void findPrint(String title) {
		try {
			ArrayList<FoodHouseVO> list = fm.foddFindData(title);
			for(int i = model.getRowCount()-1;i>=0;i--) {
				model.removeRow(i);
			}
			
			for(FoodHouseVO vo:list) {
				URL url = new URL(vo.getPoster()+"|");
				Image image = ImageChange.getImage(new ImageIcon(url), 90, 90);
				Object[] obj = {
						new ImageIcon(image),vo.getName(),vo.getPhone()
				};
				model.addRow(obj);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1 || e.getSource()==tf) {
			String title = tf.getText();
			if(title.trim().length()<1) {
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return ;
			}
			
			findPrint(title);
		}
		else if(e.getSource() == b2) {
			tf.setText("");
			cp.card.show(cp, "Home");
		}
		
	}
}
