package com.rose.AbstractFactory;

public abstract class AbstractBlackHuman implements Human
{

	@Override
	public void laugh()
	{
		System.out.println("黑人会笑");


	}

	@Override
	public void cry()
	{
		System.out.println("黑人会哭");


	}

	@Override
	public void talk()
	{
		System.out.println("黑人可以说话,一般人听不懂");


	}
}
