package com.rose.Builder;

import java.util.ArrayList;

public abstract class CarBuilder
{
	public abstract void setSequence(ArrayList<String> sequence);

	public abstract CarModel getCarModel();

}
