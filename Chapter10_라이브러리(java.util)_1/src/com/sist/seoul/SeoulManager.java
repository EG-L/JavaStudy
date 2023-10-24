package com.sist.seoul;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SeoulManager {
	private static Seoul[] seoul = null;
	public Seoul[] ReadSeoul() {
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\javaDev\\seoul_location.txt");
			StringBuffer sb = new StringBuffer();
			int i = 0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			StringTokenizer st = new StringTokenizer(sb.toString(),"\n");
			seoul = new Seoul[st.countTokens()];
			int k = 0;
			StringTokenizer st1 = null;
			while(st.hasMoreTokens()) {
				st1 = new StringTokenizer(st.nextToken(),"|");
				seoul[k] = new Seoul();
				
				String rank = st1.nextToken();
				rank = rank.replaceAll("\\uFEFF","");
				seoul[k].setNumber(Integer.parseInt(rank));
				seoul[k].setName(st1.nextToken());
				seoul[k].setContent(st1.nextToken());
				seoul[k].setAddr(st1.nextToken());
				
				k++;
			}
		}
		catch(Exception ex) {}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return seoul;
	}
}
