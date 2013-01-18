package com.rose.FactoryMethod;

public class BlackHuman implements Human
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
