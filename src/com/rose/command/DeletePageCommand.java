package com.rose.command;

public class DeletePageCommand extends Command
{

	@Override
	public void execute()
	{
		super.pg.find();
		super.pg.delete();
		super.rg.plan();
		
	}
	
}
