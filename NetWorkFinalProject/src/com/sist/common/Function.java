package com.sist.common;
//웹 => 구분자 없이 사용 => 파일명
//내부프로토콜
// 80(인터넷) 21(FTP 서버) => 서버에서 지시 => 클라이언트 수행 => 같은 내용(공유)
public class Function {
	// 서버에 요청 => 구분
	public static final int LOGIN=100;
	public static final int MYLOG = 110;
	public static final int WAITCHECK = 200;
	public static final int EXIT = 900;
	public static final int MYEXIT = 910;
	
}
