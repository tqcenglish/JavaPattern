package com.rose.Decorator;

public class FouthGradeSchoolReport extends SchoolReport
{

	@Override
	public void report()
	{
		System.out.println("this is FouthGradeSchoolReport");
		
	}

	@Override
	public void sign(String name )
	{
		System.out.println("please sign your name" + name);
		
	}

}
