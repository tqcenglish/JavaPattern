package com.rose.command;

public class Client
{
	public static void main(String[] args)
	{
		Invoker invoker = new Invoker();
		System.out.println("add a need");
		Command command = new AddRequeirementCommand();
		invoker.setCommand(command);
		invoker.action();
	}
}
