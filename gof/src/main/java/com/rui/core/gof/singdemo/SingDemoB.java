package com.rui.core.gof.singdemo;
/**
 * @title 懒汉式单例
 * 线程安全，效率不高(synchronized)，延时加载
 * @author hurui
 * @date 2018-12-02
 */
public class SingDemoB {
	/**
	 * 类初始化之后，不马上创建这个实例，可以延时加载，要用的时候才加载实例
	 */
	private static SingDemoB singDemoB;
	//私有化的构造器，不是public
	private SingDemoB() {}
	
	/**
	 * @title 这个方式是获取实例的唯一方法，每次获取的都是同一个实例
	 * 这个方法调用效率不高，
	 * 只有我们要使用这个实例的时候，才创建
	 * @author huri
	 * @date 2018-12-02
	 */
	public static synchronized SingDemoB getIntance() {
		if(singDemoB == null) {
			singDemoB = new SingDemoB();
		}
		return singDemoB;
	}
	
	

}
