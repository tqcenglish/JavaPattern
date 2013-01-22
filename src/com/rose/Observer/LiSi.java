package com.rose.Observer;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer
{

	@Override
	public void update(Observable o, Object arg)
	{
		System.out.println("report");
		this.report(arg.toString());

	}
	
	private void report(String str)
	{
		System.out.println("lisi" + str);
	}

}
