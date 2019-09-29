package binaryConverter;

import binaryToText.*;
import textToBinary.*;

public class BinaryConverterMain
{

	public static void main(String[] args)
	{
		
		//variables
		
		int convDir = 0;
		String message = "";
		String translatedMessage = "";
		
		//action
		
		DispIntro.dispIntro();
		convDir = GetConvDir.getConvDir();
		message = GetMessage.getMessage(convDir);
		
		if (convDir == 1)
		{
			
			translatedMessage = TextToBinary.textToBinary(message);
			
		}
		else if (convDir == 2)
		{
			
			translatedMessage = BinaryToText.binaryToText(message);
			
		}
		
		DispResults.dispResults(convDir, translatedMessage);
		TerminateProgram.terminateProgram();
		
	}
	
}
