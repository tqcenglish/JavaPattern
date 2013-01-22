/**
 * 
 */
package com.rose.Iterator;

import java.util.ArrayList;

/**
 * @author miracle
 * 
 */
public class ProjectIterator implements IProjectIterator
{
	private ArrayList<IProject> projectList = new ArrayList<>();
	private int currentItem = 0;

	// 构造函数传入projectList
	public ProjectIterator(ArrayList<IProject> projectList)
	{
		this.projectList = projectList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext()
	{
		// 定义一个返回值
		boolean b = true;
		if (this.currentItem >= projectList.size()
				|| this.projectList.get(this.currentItem) == null)
		{
			b = false;
		}
		return b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Project next()
	{
		return (Project) this.projectList.get(this.currentItem++);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove()
	{
		// TODO Auto-generated method stub

	}

}
