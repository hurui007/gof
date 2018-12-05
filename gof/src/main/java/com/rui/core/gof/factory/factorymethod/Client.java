package com.rui.core.gof.factory.factorymethod;

public class Client {
	public static void main(String[] args) {
		//通过工厂方法模式创建的对象
		Car c1 = new AudiFactory().createCar();
		Car c2 = new BydFactory().createCar();
		c1.run();
		c2.run();
	}
}
