package com.rui.core.gof.abstractFactory;
/**
 * @title 发动机接口
 * @author ruihu
 * @date 2018-12-09
 */
public interface Engine {
	void run();
	void start();
}

/**
 * @title 高端发动机
 * @author ruihu
 *
 */
class LuxuryEngine implements Engine{
	public void run() {
		System.out.println("跑得快！");
		
	}
	public void start() {
		System.out.println("转得快！可以自动启停!");
		
	}
}



/**
 * @title 低端发动机
 * @author ruihu
 *
 */
class LowEngine implements Engine{
	public void run() {
		System.out.println("跑得慢！");
		
	}
	public void start() {
		System.out.println("转得慢！");
		
	}
}