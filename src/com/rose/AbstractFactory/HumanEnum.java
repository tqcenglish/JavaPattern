package com.rose.AbstractFactory;

public enum HumanEnum
{
	YelloMaleHuman("com.rose.AbstractFactory.YellowMaleHuman"), YelloFemaleHuman(
			"com.rose.AbstractFactory.YellowFemaleHuman"), WhiteFemaleHuman(
			"com.rose.AbstractFactory.WhiteFemaleHuman"), WhiteMaleHuman(
			"com.rose.AbstractFactory.WhiteMaleHuman"), BlackFemaleHuman(
			"com.rose.AbstractFactory.BlackFemaleHuman"), BlackMaleHuman(
			"com.rose.AbstractFactory.BlackMaleHuman");
	private String value = "";

	// 定义构造函数,目的是Data(value)类型的相匹配
	private HumanEnum(String value)
	{
		this.value = value;
	}

	public String getValue()
	{
		return this.value;
	}

}
