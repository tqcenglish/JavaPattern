package com.rose.State;

public class RunningState extends LiftState
{

	@Override
	public void open()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void close()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void run()
	{
		System.out.println("电梯上下跑...");


	}

	@Override
	public void stop()
	{
		super.context.setLiftState(Context.stoppingState); //环境设置为停止状态;
		super.context.getLiftState().stop();


	}

}
