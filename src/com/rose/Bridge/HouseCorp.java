package com.rose.Bridge;

public class HouseCorp extends Corp
{
/*
	@Override
	protected void produce()
	{
		System.out.println("房地产公司盖房子...");

	}

	@Override
	protected void shell()
	{
		System.out.println("房地产公司出售房子...");


	}*/
	
	public HouseCorp(Product product)
	{
		super(product);
		// TODO Auto-generated constructor stub
	}

	public void makeMoey()
	{
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}

}
