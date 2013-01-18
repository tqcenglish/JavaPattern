package com.rose.FactoryMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class HumanFactory
{
	private static HashMap<String, Human> humans = new HashMap<String, Human>();

	public static Human createHuman(Class<?> c)
	{
		Human human = null;
		try
		{
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e)
		{// 你要是不说个人种颜色的话,没法烤,要白的黑,你说话了才好烤
			System.out.println("必须指定人种的颜色");
		} catch (IllegalAccessException e)
		{ // 定义的人种有问题,那就烤不出来了,这是...

			System.out.println("人种定义错误!");
		} catch (ClassNotFoundException e)
		{ // 你随便说个人种,我到哪里给你制造去?!
			System.out.println("混蛋,你指定的人种找不到!");
		}

		return human;
	}

	public static Human createHuman()
	{
		Human human = null;
		// 首先是获得有多少个实现类,多少个人种
		List<?> concreteHumanList = ClassUtils
				.getAllClassByInterface(Human.class); // 定义了多少人种
		// 八卦炉自己开始想烧出什么人就什么人
		Random random = new Random();
		int rand = random.nextInt(concreteHumanList.size());
		human = createHuman((Class<?>) concreteHumanList.get(rand));
		return human;

	}

	public static Human createHumanOther(Class c)
	{
		Human human = null;
		try
		{
			if(humans.containsKey(c.getSimpleName()))
			{
				human = humans.get(c.getSimpleName());
			}
			else
			{
				human = (Human)Class.forName(c.getName()).newInstance();
				humans.put(c.getSimpleName(), human);
			}
		} catch (InstantiationException e) {//你要是不说个人种颜色的话,没法烤,要白的黑,你说话了才好烤
			System.out.println("必须指定人种的颜色");
			} catch (IllegalAccessException e) { //一定定义的人种有问题,那就烤不出来了,这是...
			System.out.println("人种定义错误!");
			} catch (ClassNotFoundException e) { //你随便说个人种,我到哪里给你制造去?!
			System.out.println("混蛋,你指定的人种找不到!");
			}
			return human;

	}
}
