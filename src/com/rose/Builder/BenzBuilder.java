package com.rose.Builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder
{
	private BenzModel benz = new BenzModel();
	@Override
	public void setSequence(ArrayList<String> sequence)
	{
		this.benz.setSequence(sequence);
		
	}

	@Override
	public CarModel getCarModel()
	{
		return this.benz;
	}
}
