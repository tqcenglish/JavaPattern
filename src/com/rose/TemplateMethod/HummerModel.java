package com.rose.TemplateMethod;

public abstract class HummerModel
{
	/*
	 * public abstract void start(); public abstract void stop(); public
	 * abstract void alarm(); public abstract void engineBoom();
	 */
	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	protected abstract boolean isAlarm();

	final public void run()
	{
		start();
		engineBoom();
		if (isAlarm())
		{
			alarm();
		}
		stop();
	}
}
