package com.rose.Adapter;

public class App
{
	public static void main(String[] args)
	{
		IUserInfo youngGir1 = new UserInfo();
		for(int i = 0; i < 101; i++)
		{
			youngGir1.getMobileNumber();
		}
		
		IUserInfo youngGir2 = new OuterUserInfo();
		for(int i = 0; i < 101; i++)
		{
			youngGir2.getMobileNumber();
		}
	}
}
