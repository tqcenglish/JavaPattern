package com.tqcenglish.singleton;
/**
 * 加锁的懒汉模式.
 * <p>
 * 可以在多线程下运行，由于synchronized修饰同步块，则性能会下降
 * @author tqcenglish
 *
 */
public class SingletonClassE3
{
	private static SingletonClassE3 mInstance;
	public synchronized SingletonClassE3 getInstance()
	{
		if(null == mInstance)
		{
			mInstance = new SingletonClassE3();
		}
		return mInstance;
	}
	private SingletonClassE3()
	{
		
	}
}
