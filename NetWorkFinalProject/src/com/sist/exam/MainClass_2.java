package com.sist.exam;
/*
 *  Thread : 한 개의 프로그램에서 여러개의 기능을 동시에 수행
 *  ------ 실시간 변경(증권, 은행) => Ajax
 *  1) 생성 
 *     new Thread()
 *     => 이름부여 (Thread-0....)
 *     => 이름 읽기 => getName()
 *     => 이름 변경 => setName()
 *     => 우선순위 (1~10) => 10번이 가장 높은 순위 (작업이 제일 빠르다)
 *       1. MIN_PRIORITY : GC() => 1
 *       2. NORM_PRIORITY : 사용자 정의 => 5
 *       3. MAX_PRIORITY : main() => 10
 *  2) start() => 대기(Runnable)
 *  3) run() => Running 상태
 *  4) sleep() => Wait
 *  5) interrupt => 종료 상태
 * */
class MyThread2 extends Thread{
	public void run() {
		for(int i = 1; i<11;i++) {
			System.out.println(Thread.currentThread()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class MainClass_2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		MyThread2 t4 = new MyThread2();
		MyThread2 t5 = new MyThread2();
		
		t1.setName("홍길동");
		t2.setName("심청이");
		t3.setName("강감찬");
		t4.setName("이순신");
		t5.setName("김나박이");
		
		t1.setPriority(10);
		t2.setPriority(2);
		t3.setPriority(3);
		t4.setPriority(4);
		t5.setPriority(5);
		
		// 대기상태 => 동작
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		
	}

}
