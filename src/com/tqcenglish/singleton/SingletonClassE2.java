package com.tqcenglish.singleton;

/**
 * 懒汉模式.
 * <p>懒汉模式相对饿汉模式性能上可能提高<br>
 * 然后在多线程下会出错
 * @author tqcenglish
 *
 */
public class SingletonClassE2
{
	private static SingletonClassE2 mInstance; 
	public static SingletonClassE2 getInstance()
	{
		if(null == mInstance)
		{
			mInstance = new SingletonClassE2();
		}
		return mInstance;
	}
	private SingletonClassE2()
	{
		
	}
}
