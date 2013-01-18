package com.rose.TemplateMethod;

public class HummerH1Model extends HummerModel
{
	private boolean alarmFlag = true;

	@Override
	public void start()
	{
		System.out.println("h1 start");
		
	}

	@Override
	public void stop()
	{
		System.out.println("h1 stop");
		
	}

	@Override
	public void alarm()
	{
		System.out.println("h1 alarm");
	}

	@Override
	public void engineBoom()
	{
		System.out.println("h1 engingBoom");
		
	}
/*
	@Override
	public void run()
	{
		start();
		engineBoom();
		alarm();
		stop();
		
	}*/

	@Override
	protected boolean isAlarm()
	{
		
		return alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm)
	{
		alarmFlag = isAlarm;
	}
	
}
