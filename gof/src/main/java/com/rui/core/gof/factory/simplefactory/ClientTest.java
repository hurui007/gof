package com.rui.core.gof.factory.simplefactory;

public class ClientTest {
	public static void main(String[] args) {
		
		//通过简单工厂模式创建的对象
		Car andi = SimpleCarFactory.createAndi();
		Car byd = SimpleCarFactory.createByd();
		andi.run();
		byd.run();
	}
	

}
