package com.rose.Observer;

import java.util.Observer;

public class Client
{
	public static void main(String[] args)
	{
		Observer liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		hanFeiZi.addObserver(liSi);
		hanFeiZi.haveBreakFast();
	}
}
