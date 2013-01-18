package com.rose.FactoryMethod;

public class NvWa
{
	public static void main(String[] args)
	{
		System.out.println("------------造出的第一批人是这样的:白人-----------------");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();
		whiteHuman.talk();
		System.out.println("\n\n------------造出的第二批人是这样的:黑人-----------------");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();
		// 第三批人了,这次火候掌握的正好,黄色人种(不写黄人,免得引起歧义),备注:RB人不属
		System.out.println("\n\n------------造出的第三批人是这样的:黄色人种-----------------");

		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
		yellowHuman.talk();

		// 女娲烦躁了,爱是啥人种就是啥人种,烧吧
		for (int i = 0; i < 10L; i++)
		{
			System.out.println("\n\n------------随机产生人种了-----------------" + i);
			Human human = HumanFactory.createHuman();
			human.cry();
			human.laugh();
			human.talk();
		}
	}
}
