package com.rose.Decorator;

public class HighScoreDecorator extends Decorator
{

	public HighScoreDecorator(SchoolReport st)
	{
		super(st);
		// TODO Auto-generated constructor stub
	}
	private void reportHighScore()
	{
		System.out.println("reportHighScore");
	}
	public void report()
	{
		this.reportHighScore();
		super.report();
	}

}
