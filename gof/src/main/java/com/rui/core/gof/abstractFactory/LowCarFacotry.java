package com.rui.core.gof.abstractFactory;
/**
 * 创建低端汽车
 * @author ruihu
 * @date 2018-12-09
 */
public class LowCarFacotry implements CarFactory {

	public Engine createEngine() {
		return new LowEngine();
	}

	public Seat createSeat() {
		return new LowSeat();
	}

	public Tyre createTyre() {
		return new LowTyre();
	}

}
