package com.rui.core.gof.abstractFactory;
/**
 * 创建高端汽车
 * @author ruihu
 * @date 2018-12-09
 */
public class LuxuryCarFacotry implements CarFactory {

	public Engine createEngine() {
		return new LuxuryEngine();
	}

	public Seat createSeat() {
		return new LuxurySeat();
	}

	public Tyre createTyre() {
		return new LuxuryTyre();
	}

}
