package com.rose.State;

public class Client
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*ILift lift = new Lift();
		lift.setState(2);
		lift.open();
		lift.close();
		lift.run();
		lift.stop();
		System.out.println("*********");*/
		
		Context context = new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();

	}

}
