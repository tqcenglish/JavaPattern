package com.rose.visitor;

public class CommonEmployee extends Employee
{

	@Override
	public void accept(IVisitor visitor)
	{
		visitor.visit(this);
		
		
	}
	private String job;
	public String getJob()
	{
		return job;
	}
	public void setJob(String job)
	{
		this.job = job;
	}

}
