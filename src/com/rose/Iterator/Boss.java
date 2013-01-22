package com.rose.Iterator;

public class Boss
{
	public static void main(String[] args)
	{
		IProject project = new Project();
		// 增加星球大战项目
		project.add("星球大战项目ddddd", 10, 100000);
		// 增加扭转时空项目
		project.add("扭转时空项目", 100, 10000000);
		// 增加超人改造项目
		project.add("超人改造项目", 10000, 1000000000);
		IProjectIterator projectIterator = project.iteratror();
		while (projectIterator.hasNext())
		{
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}

	}
}
