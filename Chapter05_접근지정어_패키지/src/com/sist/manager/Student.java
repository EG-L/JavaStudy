package com.sist.manager;

public class Student {
	// default(접근지정어) => 같은 패키지에서는 사용 가능 하지만 다른 패키지에서는 사용이 불가능하다.
	// public => 모든 패키지에서 접근 가능
	//단점 => 보안에 취약하다.
	public int hakbun;
	public String name;
	public int kor, eng, math;
}
