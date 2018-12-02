package com.rui.core.gof.singdemo;
/**
 * @title 静态内部类式单例模式
 * 线程安全，效率高，延时加载
 * @author hurui
 * @date 2018-12-02
 */
public class SingDemoC {
	
	private static class SingtonClassIntance{
		private static final SingDemoC singDemoc = new SingDemoC();
	}
	//私有化的构造器，不是public
	private SingDemoC() {}
	
	/**
	 * 这种方式获取的单例模式，线程安全，调用效率高，并且只在调用的时候才加载实例
	 * @return
	 */
	public static SingDemoC getIntance() {
		return SingtonClassIntance.singDemoc;
	}
	
	

}
