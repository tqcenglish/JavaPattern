package com.tqcenglish.singleton;

public class SingletonClass
{
	private static class SingletonClassInstance
	{
		private static final SingletonClass instance = new SingletonClass();
	}

	public static SingletonClass getInstance()
	{
		return SingletonClassInstance.instance;
	}

	private SingletonClass()
	{
	}
}
