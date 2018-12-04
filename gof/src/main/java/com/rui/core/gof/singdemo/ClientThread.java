package com.rui.core.gof.singdemo;

import java.util.concurrent.CountDownLatch;

/**
 * 多线程环境下测试各个单例的性能
 * @author ruihu
 * @date 2018-12-04
 */
public class ClientThread {

	public static void main(String[] args) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		int threadNum = 10;
		//这个 final 这个关键字可以让内部类访问这个变量，不加的访问不到
		final CountDownLatch countDowdLatch = new CountDownLatch(threadNum); 
		
		for(int k = 1;k<= threadNum;k++) {
			new Thread(new Runnable() {
				
				public void run() {
					for(int i = 1;i<= 100000;i++) {
						SingDemo sin = SingDemo.getIntance();
					}
					countDowdLatch.countDown();
				}
			}).start();
		}
		
		countDowdLatch.await();
		long end =System.currentTimeMillis();
		System.out.println("耗时：" + (end - start));
	}

}
