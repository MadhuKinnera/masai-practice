package com.day12.q1;

public interface Z extends X , Y {
	void funZ();
	public default void funDef1() {
		System.out.println("This is funDef1 from Zimpls");
	}

}
