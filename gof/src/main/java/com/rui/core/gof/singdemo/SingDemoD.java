package com.rui.core.gof.singdemo;
/**
 * 可以通过枚举的方式实现单例
 * 调用效率高，线程安全，但是没有延时加载效果
 * @author ruihu
 * @date 2018-12-02
 */
public enum SingDemoD {
	//这个枚举元素，本身就是单例
	INSTANCE;
	
	public void singDemoDOperation() {
		//TODO 这里可以添加其他功能的实现
	}

}
