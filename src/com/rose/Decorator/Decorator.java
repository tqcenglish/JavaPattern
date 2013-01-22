package com.rose.Decorator;

public class Decorator extends SchoolReport
{
	private SchoolReport st;
	public Decorator(SchoolReport st)
	{
		this.st = st;
	}
	@Override
	public void report()
	{
		this.st.report();
		
	}
	@Override
	public void sign(String name)
	{
		
		this.st.sign(name);
	}
	
}
