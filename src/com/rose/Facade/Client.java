package com.rose.Facade;

public class Client
{
	public static void main(String[] args)
	{
		/*LetterProcess letterProcess = new LetterProcessImpl();
		letterProcess.writeContext("Hello");
		letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
		letterProcess.letterInotoEnvelope();
		letterProcess.sendLeter();*/
		
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		String address = "Happ Road No. 666";
		String content = "Hello";
		hellRoadPostOffice.sendLetter(content, address);
	}
}
