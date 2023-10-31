package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import com.sist.VO.*;
import com.sist.common.ImageChange;
public class PosterCard extends JPanel{
	JLabel poLa = new JLabel();
	JLabel tLa = new JLabel();
	public PosterCard(FoodCategoryVO vo) {
		this.setLayout(null);
		poLa.setBounds(5, 5, 400, 150);
		tLa.setBounds(5, 160, 280, 30);
		
		this.add(poLa);
		this.add(tLa);
		
		try {
			if(vo.getPoster()!=null) {
				URL url = new URL(vo.getPoster()+"|");
				Image image = ImageChange.getImage(new ImageIcon(url), 400, 150);
				poLa.setIcon(new ImageIcon(image));
				tLa.setText(vo.getTitle());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
