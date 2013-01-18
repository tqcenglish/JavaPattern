package com.rose.Facade;

public class ModenPostOffice
{
	private LetterProcess letterProcess = new LetterProcessImpl();
	private Police letterPolice = new Police();
	public void sendLetter(String content, String address)
	{
		letterProcess.writeContext(content);
		letterProcess.fillEnvelope(address);
		
		letterPolice.checkLetter(content, address);
		
		letterProcess.letterInotoEnvelope();
		letterProcess.sendLeter();
	}
}

