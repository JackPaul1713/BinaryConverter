package binaryConverter;

import binaryToEnglish.*;
import englishToBinary.*;

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
			
			translatedMessage = EnglishToBinary.englishToBinary(message);
			
		}
		else if (convDir == 2)
		{
			
			translatedMessage = BinaryToEnglish.binaryToEnglish(message);
			
		}
		
		DispResults.dispResults(convDir, translatedMessage);
		
	}
	
}