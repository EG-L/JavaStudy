package com.sist.client;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.sist.common.ImageChange;
import com.sist.vo.AlbumVO;

public class AlbumFindPanel extends JPanel implements ActionListener{
	JTextField tf;
	JLabel image1;
	JComboBox<String> cb;
	JButton b1;
	ControlPanel cp;
	JTable table;
	DefaultTableModel model;
	
	public AlbumFindPanel(ControlPanel cp) {
		this.cp = cp;
		image1 = new JLabel();
		String[] choose = {"가수명","곡명"};
		tf = new JTextField(20);
		cb = new JComboBox<String>(choose);
		b1 = new JButton("검색");
		
		JPanel p = new JPanel();
		p.add(cb);
		p.add(tf);
		p.add(b1);
		
		String[] col = {"","앨범명","대표곡","가수명","발매일"};
		Object[][] row = new Object[0][5];
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
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		
		this.setLayout(new BorderLayout());
		this.add("Center",js);
		this.add("North",p);
		
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			if(cb.getSelectedItem()=="곡명") {
				
			}
			else {
				
			}
		}
		
	}
	
	public void AlbumPrint(AlbumVO list) {
		try {
			URL url = new URL(list.getImage());
			Image image = ImageChange.getImage(new ImageIcon(url), 90, 90);
			image1.setIcon(new ImageIcon(image));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
