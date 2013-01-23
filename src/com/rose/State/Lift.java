package com.rose.State;

public class Lift implements ILift
{
	private int state;

	@Override
	public void open()
	{
		switch (this.state)
		{
		case OPENING_STATE: // 如果已经在门敞状态,则什么都不做
			// do nothing;
			break;
		case CLOSING_STATE: // 如是电梯时关闭状态,则可以开启
			this.openWithoutLogic();
			this.setState(OPENING_STATE);

			break;
		case RUNNING_STATE: // 正在运行状态,则不能开门,什么都不做
			// do nothing;
			break;
		case STOPPING_STATE: // 停止状态,淡然要开门了
			this.openWithoutLogic();
			this.setState(OPENING_STATE);
			break;
		}

	}

	private void stopWithoutLogic()
	{
		System.out.println("lift stop");
	}

	private void openWithoutLogic()
	{
		System.out.println("lift open");
	}

	@Override
	public void close()
	{
		switch (this.state)
		{
		case OPENING_STATE:
			this.setState(CLOSING_STATE);
			closeWithoutLogic();
			break;
		case CLOSING_STATE: // 如果电梯就是关门状态,则什么都不做
			// do nothing;
			break;
		case RUNNING_STATE: // 如果是正在运行,门本来就是关闭的,也说明都不做
			// do nothing;
			break;
		case STOPPING_STATE: // 如果是停止状态,本也是关闭的,什么也不做
			// do nothing;
			break;

		}

	}

	private void closeWithoutLogic()
	{
		System.out.println("lift close");
	}

	@Override
	public void stop()
	{

		switch (this.state)
		{
		case OPENING_STATE: // 如果已经在门敞状态,那肯定要先停下来的,什么都不做
			// do nothing;
			break;
		case CLOSING_STATE: // 如是电梯时关闭状态,则当然可以停止了
			this.stopWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case RUNNING_STATE: // 正在运行状态,有运行当然那也就有停止了
			this.stopWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case STOPPING_STATE: // 停止状态,什么都不做
			// do nothing;
			break;
		}

	}

	@Override
	public void run()
	{
		switch (this.state)
		{
		case OPENING_STATE: // 如果已经在门敞状态,则不你能运行,什么都不做
			// do nothing;
			break;
		case CLOSING_STATE: // 如是电梯时关闭状态,则可以运行
			this.runWithoutLogic();
			this.setState(RUNNING_STATE);
			break;
		case RUNNING_STATE: // 正在运行状态,则什么都不做
			// do nothing;
			break;
		case STOPPING_STATE: // 停止状态,可以运行
			this.runWithoutLogic();
			this.setState(RUNNING_STATE);

		}

	}

	private void runWithoutLogic()
	{
		System.out.println("lfit run");
	}

	@Override
	public void setState(int state)
	{
		this.state = state;

	}

}
