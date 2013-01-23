package com.rose.State;

public class StoppingState extends LiftState
{

	@Override
	public void open()
	{
		super.context.setLiftState(Context.openningState);
		super.context.getLiftState().open();

	}

	@Override
	public void close()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void run()
	{
		super.context.setLiftState(Context.runningState);
		super.context.getLiftState().run();


	}

	@Override
	public void stop()
	{
		System.out.println("电梯停止了...");


	}

}
