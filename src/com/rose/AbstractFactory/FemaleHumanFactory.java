package com.rose.AbstractFactory;

public class FemaleHumanFactory extends AbstractHumanFactory
{

	@Override
	public Human createYellowHuman()
	{
		return super.createHuman(HumanEnum.YelloFemaleHuman);
	}

	@Override
	public Human createWhiteHuman()
	{

		return super.createHuman(HumanEnum.YelloFemaleHuman);

	}

	@Override
	public Human createBlackHuman()
	{
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}

}
