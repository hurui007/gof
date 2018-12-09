package com.rui.core.gof.abstractFactory;
/**
 * 座椅
 * @author ruihu
 *
 */
public interface Seat {
	void massage();

}

class LuxurySeat implements Seat{

	public void massage() {
		System.out.println("可以按摩");
		
	}
	
}

class LowSeat implements Seat{

	public void massage() {
		System.out.println("不可以按摩");
		
	}
	
}