package com.rui.core.gof.abstractFactory;
/**
 * 轮胎
 * @author ruihu
 *
 */
public interface Tyre {
	void revolve();

}

class LuxuryTyre implements Tyre{

	public void revolve() {
		System.out.println("不磨损");
		
	}
	
}

class LowTyre implements Tyre{

	public void revolve() {
		System.out.println("磨损快");
		
	}
	
}