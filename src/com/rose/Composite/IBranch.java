package com.rose.Composite;

import java.util.ArrayList;

public  interface IBranch
{
	public void addSubordinate(ICorp corp);
	public ArrayList<ICorp>getSubordinate();
}
