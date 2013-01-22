package com.rose.ChainofResponsibility;

public abstract class Handler

{
	private int level = 0;
	private Handler  nextHanlder;
	public Handler(int level)
	{
		this.level = level;
	}
	public final void HandleMessage(IWomen women)
	{
		//System.out.println("***level**"  + level);
		if(women.getType() == this.level)
		{
			this.response(women);
		}
		else{
			if(this.nextHanlder != null)
			{
				this.nextHanlder.HandleMessage(women);
			}
			else
			{
				System.out.println("cant't find handler");
			}
		}
	}
	public void setNext(Handler handler)
	{
		this.nextHanlder = handler;
	}
	public abstract void response(IWomen women);
}
