package com.rose.Iterator;

public interface IProject
{
	public void add(String name, int num, int cost);
	public String getProjectInfo();
	public IProjectIterator iteratror();
}
