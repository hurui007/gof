package com.rui.core.gof.abstractFactory;

public class Client {
	public static void main(String[] args) {
		
		//这样通过好车工厂创建引擎，就是好引擎
		CarFactory factory  = new LuxuryCarFacotry();
		Engine engine = factory.createEngine();
		engine.run();
		engine.start();
	}
	
	

}
