package com.rose.AbstractFactory;

public class NvWa
{
	public static void main(String[] args)
	{
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		HumanFactory femaleHumanFactory =  new FemaleHumanFactory();
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		maleYellowHuman.cry();
		maleYellowHuman.laugh();
		femaleYellowHuman.sex();

	}
}
