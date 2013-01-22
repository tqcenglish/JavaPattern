package com.rose.Iterator;

import java.util.ArrayList;

public class Project implements IProject
{

	private ArrayList<IProject> projectList = new ArrayList<>();
	private String name = "";
	private int num = 0;
	private int cost = 0;

	public Project(String name, int num, int cost)
	{
		super();
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	public Project()
	{

	}

	@Override
	public void add(String name, int num, int cost)
	{
		this.projectList.add(new Project(name, num, cost));

	}

	@Override
	public String getProjectInfo()
	{
		String info = "";
		// 获得项目的名称
		info = info + "项目名称是:" + this.name;
		// 获得项目人数
		info = info + "\t项目人数: " + this.num;
		// 项目费用
		info = info + "\t 项目费用:" + this.cost;
		return info;
	}

	@Override
	public IProjectIterator iteratror()
	{

		return new ProjectIterator(this.projectList);

	}

}
