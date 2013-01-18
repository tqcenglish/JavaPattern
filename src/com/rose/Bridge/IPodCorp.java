package com.rose.Bridge;

public class IPodCorp extends Corp
{
/*
	@Override
	protected void produce()
	{
		System.out.println("生产iPod...");
		
	}

	@Override
	protected void shell()
	{
		System.out.println("iPod shell");
		
	}*/
	
	public IPodCorp(Product product)
	{
		super(product);
		// TODO Auto-generated constructor stub
	}

	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}
	
}
