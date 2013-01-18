package com.rose.TemplateMethod;

public class HummerH2Model extends HummerModel
{

	@Override
	public void start()
	{
		System.out.println("h2 start");

	}

	@Override
	public void stop()
	{
		System.out.println("h2 stop");
	}

	@Override
	public void alarm()
	{
		System.out.println("h2 alarm");

	}

	@Override
	public void engineBoom()
	{
		System.out.println("h2 engineBoom");

	}

	@Override
	protected boolean isAlarm()
	{
		
		return false;
	}

	/*@Override
	public void run()
	{
		this.start();
		engineBoom();
		alarm();
		stop();

	}*/

}
