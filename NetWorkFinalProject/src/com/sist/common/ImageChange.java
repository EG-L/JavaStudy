package com.sist.common;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageChange {
	public static Image getImage(ImageIcon icon, int w, int h) {//이미지 크기 재정의 함수
		return icon.getImage().getScaledInstance(w,h,Image.SCALE_SMOOTH);
	}
}
