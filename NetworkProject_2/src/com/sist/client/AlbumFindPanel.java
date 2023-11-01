package com.sist.client;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.sist.common.ImageChange;
import com.sist.manager.AlbumManager;
import com.sist.vo.AlbumVO;

public class AlbumFindPanel extends JPanel implements ActionListener{
	JTextField tf;
	JLabel image1;
	JComboBox<String> cb;
	JButton b1;
	ControlPanel cp;
	JTable table;
	DefaultTableModel model;
	AlbumManager am = new AlbumManager();
	
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
		table.setRowHeight(100);
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
			String text = tf.getText();
			if(text.trim().length()<1) {
				JOptionPane.showMessageDialog(this, "검색어 입력해주세요");
				tf.requestFocus();
				return;
			}
			ArrayList<AlbumVO> listVO = null;
			if(String.valueOf(cb.getSelectedItem()).equals("가수명")) {
				listVO = am.AlbumInfoData(tf.getText(), "가수명");
			}
			else if(String.valueOf(cb.getSelectedItem()).equals("곡명")) {
				listVO = am.AlbumInfoData(tf.getText(), "곡명");
			}
			cp.afp.AlbumPrint(listVO);
			
		}
		
	}
	
	public void AlbumPrint(ArrayList<AlbumVO> list) {
		try {
			for(int i = model.getRowCount()-1;i>=0;i--) {
				model.removeRow(i);
			}
			for(AlbumVO vo:list) {
				URL url = new URL(vo.getImage());
				Image image = ImageChange.getImage(new ImageIcon(url), 90, 90);
				
				Object[] data = {
						new ImageIcon(image),vo.getAlbum(),vo.getTitle(),vo.getArtist(),vo.getRegdate()
				};
				model.addRow(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
