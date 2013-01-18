package com.rose.Bridge;

public class Clothes extends Product
{

	@Override
	public void beProducted()
	{
		System.out.println("生产出的衣服是这个样子的...");

		
	}

	@Override
	public void beSelled()
	{
		System.out.println("生产出的衣服卖出去了...");

		
	}

}
