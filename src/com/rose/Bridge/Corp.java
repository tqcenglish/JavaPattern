package com.rose.Bridge;

public abstract class Corp

{
	/*protected abstract void produce();
	protected abstract void shell();
	public void makeMoney()
	{
		this.produce();
		this.shell();
	}*/
	
	private Product product;
	public Corp(Product product)
	{
		this.product = product;
	}
	public void makeMoney()
	{
		this.product.beProducted();
		this.product.beSelled();
	}
}
