package com.rui.core.gof.factory.simplefactory;
/**
 * car的工厂类 简单工厂模式
 * @author ruihu
 * @date 2018-12-05
 */
public class SimpleCarFactory {
	
	public static Car createAndi() {
		return new Audi();
	}
	
	public static Car createByd() {
		return new Byd();
	}

}
