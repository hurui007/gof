package com.rui.core.gof.factory.factorymethod;

public class AudiFactory implements CarFactory {

	public Car createCar() {
		return new Audi();
		
	}

}
