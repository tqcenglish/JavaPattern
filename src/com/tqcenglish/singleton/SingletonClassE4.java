package com.tqcenglish.singleton;
/**
 * 双检查的加锁的单例模式.
 * <p>性能和线程问题都解决<br>
 * volatile修饰的写变量不能和之前的读写代码调整，读变量不能和之后的读写代码调整
 * @author tqcenglish
 *
 */
public class SingletonClassE4
{
	private static volatile SingletonClassE4 mInstance;

	private SingletonClassE4()
	{
	}

	public SingletonClassE4 getInstance()
	{
		if (null == mInstance)
		{
			synchronized (SingletonClassE4.class)
			{
				if (null == mInstance)
				{
					mInstance = new SingletonClassE4();
				}
			}
		}
		return mInstance;
	}
}
