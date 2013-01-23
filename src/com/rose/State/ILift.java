package com.rose.State;

public interface ILift
{
	public final static int OPENING_STATE = 1; //门敞状态
	public final static int CLOSING_STATE = 2; //门闭状态
	public final static int RUNNING_STATE = 3; //运行状态
	public final static int STOPPING_STATE = 4; //停止状态;

	public void open();
	public void close();
	public void stop();
	public void run();
	public void setState(int state);
}
