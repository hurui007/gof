package com.rui.core.gof.factory.factorymethod;

public class BydFactory implements CarFactory {

	public Car createCar() {
		return new Byd();
		
	}

}
