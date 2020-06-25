package com.thread.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Test {
	public static void main(String[] args) {
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(parties);
		
		CountDown countDown = new CountDown(3);
		ThreadDemo t1 = new ThreadDemo(countDown);
		ThreadDemo t2 = new ThreadDemo(countDown);
		ThreadDemo t3 = new ThreadDemo(countDown);
		ThreadDemo t4 = new ThreadDemo(countDown);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
