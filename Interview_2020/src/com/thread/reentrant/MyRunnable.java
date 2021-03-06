package com.thread.reentrant;

import java.util.concurrent.locks.Lock;

public class MyRunnable implements Runnable{
	Lock lock;
	
	public MyRunnable(Lock lock) {
		this.lock = lock;
			}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is waiting to acquire lock");
		
		lock.lock();
		
		System.out.println(Thread.currentThread().getName()+" has acquired lock..");
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+" is sleeping");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(Thread.currentThread().getName()+" has released lock");
		lock.unlock();
	}

}
