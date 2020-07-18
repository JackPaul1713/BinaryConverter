package converter;

import display.*;
import input.*;

public class BinaryConverter
{
	public static void main(String[] args)
	{
		//var
		int convDir = 0;
		String message = "";
		String translatedMessage = "";
		//inp
		DispIntro.dispIntro();
		convDir = GetConvDir.getConvDir();
		message = GetMessage.getMessage(convDir);
		//convrt
		if (convDir == 1)
		{
			translatedMessage = TextToBin.textToBin(message);
		}
		else if (convDir == 2)
		{
			translatedMessage = BinToText.binToText(message);
		}
		DispResults.dispResults(convDir, translatedMessage);
	}
}
