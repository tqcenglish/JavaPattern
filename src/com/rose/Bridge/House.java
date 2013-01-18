package com.rose.Bridge;

public class House extends Product
{

	@Override
	public void beProducted()
	{
		System.out.println("生产出的房子是这个样子的...");

	}

	@Override
	public void beSelled()
	{
		System.out.println("生产出的房子卖出去了...");

	}

}
