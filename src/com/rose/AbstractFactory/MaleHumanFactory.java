package com.rose.AbstractFactory;

public class MaleHumanFactory extends AbstractHumanFactory
{

	@Override
	public Human createYellowHuman()
	{
		return super.createHuman(HumanEnum.YelloMaleHuman);

	}

	@Override
	public Human createWhiteHuman()
	{
		return super.createHuman(HumanEnum.WhiteMaleHuman);

	}

	@Override
	public Human createBlackHuman()
	{
		return super.createHuman(HumanEnum.BlackMaleHuman);

	}

}
