package com.tqcenglish.singleton;
/**
 * 饿汉模式.
 * <p>
 * 若创建过程new SingletonClassE1非常耗时 且又没有使用到则性能上需要优化
 * 
 * @author tqcenglish
 *
 */
public class SingletonClassE1
{
	private  static final SingletonClassE1 mInstance = new SingletonClassE1();;
	private SingletonClassE1()
	{
	}
	public static SingletonClassE1 getInstance()
	{
		return mInstance;
	}
}
