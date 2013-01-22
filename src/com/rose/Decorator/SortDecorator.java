package com.rose.Decorator;

public class SortDecorator extends Decorator
{

	public SortDecorator(SchoolReport st)
	{
		super(st);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void report()
	{
		// TODO Auto-generated method stub
		super.report();
		this.reportSort();
	}
	private void reportSort()
	{
		System.out.println("reportSort");
	}
	

}
