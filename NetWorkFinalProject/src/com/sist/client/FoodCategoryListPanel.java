package com.sist.client;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.sist.VO.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;
import java.net.*;
public class FoodCategoryListPanel extends JPanel implements ActionListener{
	JLabel la1,la2;
	JButton b1;
	JTable table;
	DefaultTableModel model;
	ControlPanel cp;
	FoodManager fm = new FoodManager();
	public FoodCategoryListPanel(ControlPanel cp){
		this.cp = cp; // 화면 이동
		la1 = new JLabel();
		la2 = new JLabel();
		
		b1 = new JButton("목록");
		
		String[] col = {"","이미지","맛집 정보"};
		Object[][] row = new Object[0][3];
		
		model = new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0,columnIndex).getClass();//데이터블안에 이미지 출력
			}
			
		};
		table = new JTable(model);
		
		JScrollPane js = new JScrollPane(table);
		table.getColumn("이미지").setPreferredWidth(80);
		table.getColumn("맛집 정보").setPreferredWidth(500);
		table.getColumnModel().removeColumn(table.getColumnModel().getColumn(0));//감추기 => 맛집 번호(테이블 내)
		
		table.getTableHeader().setReorderingAllowed(false);//테이블 제목 이동 방지
		table.setShowVerticalLines(false);
		table.setRowHeight(100);
		
		//배치
		this.setLayout(null);
		la1.setHorizontalAlignment(JLabel.CENTER);
		la1.setFont(new Font("맑은 고딕",Font.BOLD,45));
		la2.setHorizontalAlignment(JLabel.CENTER);
		
		la1.setBounds(10, 15, 750, 55);
		la2.setBounds(10, 75, 750, 35);
		b1.setBounds(10, 120, 100, 30);
		js.setBounds(10, 160, 750, 450);
		
		this.add(la1);
		this.add(la2);
		this.add(b1);
		this.add(js);
		
	}
	public void foodPrint(ArrayList<FoodHouseVO> list) {
		for(int i = model.getRowCount()-1;i>=0;i--) {
			model.removeRow(i);
		}
		try {
			for(int i = 0; i<10;i++) {
				FoodHouseVO vo = list.get(i);
				URL url = new URL(vo.getPoster()+"|");
				Image image = ImageChange.getImage(new ImageIcon(url), 120, 150);
				String data = "<html>"+vo.getName()+"&nbsp;"+"<span style=\"color:orange\">"+vo.getScore()+"</span><br>"+vo.getAddr()+"<br>"+vo.getPhone()+"<br>"+vo.getType()+"</html>;";
				                         //         ------- 공백
				Object[] obj = {vo.getFno(),new ImageIcon(image),data};
				model.addRow(obj);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
