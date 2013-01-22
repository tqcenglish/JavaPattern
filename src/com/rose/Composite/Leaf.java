package com.rose.Composite;

public class Leaf implements ICorp
{
	//小兵也有名称
	private String name = "";
	//小兵也有职位
	private String position = "";
	//小兵也有薪水,否则谁给你干
	private int salary = 0;

	
	public Leaf(String name, String position, int salary)
	{
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}


	@Override
	public String getInfo()
	{
		String info = "";
		info = "姓名:" + this.name;
		info = info + "\t职位:"+ this.position;
		info = info + "\t薪水:" + this.salary;
		return info;

	}

}
