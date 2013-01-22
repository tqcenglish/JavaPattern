package com.rose.Observer;

import java.util.Observable;

public class HanFeiZi extends Observable
{
	public void haveBreakFast()
	{
		System.out.println("eat start");
		super.setChanged();
		super.notifyObservers("hanfeizi eat");
	}
	public void haveFun()
	{
		System.out.println("fun start");
		super.setChanged();
		this.notifyObservers("hanfeizi have fun");
	}
}
