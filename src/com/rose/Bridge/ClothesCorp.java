package com.rose.Bridge;

public class ClothesCorp extends Corp
{

	/*@Override
	protected void produce()
	{
		System.out.println("服装公司生产衣服...");

	}

	@Override
	protected void shell()
	{
		System.out.println("服装公司出售衣服...");

		
	}*/
	
	public ClothesCorp(Product product)
	{
		super(product);
		// TODO Auto-generated constructor stub
	}

	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("服装公司赚小钱...");
	}

}
