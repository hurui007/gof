package com.rui.core.gof.singdemo;
/**
 * @title 饿汉式单例
 * 线程安全，效率高，但是不是延时加载，而是随着类初初始化就创建了实例
 * @author hurui
 * @date 2018-12-02
 */
public class SingDemo {
	/**
	 * 因为随着类一起初始化，所以是线程安全的，但是一开始就创建了实例，没有延时加载
	 */
	private static final SingDemo singDemo = new SingDemo();
	//私有化的构造器，不是public
	private SingDemo() {}
	
	/**
	 * @title 这个方式是获取实例的唯一方法，每次获取的都是同一个实例
	 * 这个方法调用效率高
	 * @author huri
	 * @date 2018-12-02
	 */
	public static SingDemo getIntance() {
		return singDemo;
	}
	
	

}
