package com.tqcenglish.singleton;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestSingletonClass
{
	@Test
	public void test()
	{
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		assertEquals(s1, s2);
	}
}
