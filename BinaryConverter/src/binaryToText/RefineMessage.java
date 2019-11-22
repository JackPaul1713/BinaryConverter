package binaryToText;

public class RefineMessage
{

	public static String refineMessage(String message)
	{
		
		//variables
		
		int messageLength;
		String refinedMessage = "";
		
		//action
		
		message = message.replace(" ", "");
		messageLength = message.length();
		
		for (int ml = 0; ml < messageLength; ml = ml + 1)
		{
			
			refinedMessage = refinedMessage + message.substring(ml, ml + 1);
			
			if ((ml + 1) % 8 == 0)
			{
				
				refinedMessage = refinedMessage + "~";
				
			}
			
		}
		
		//return
		
		return(refinedMessage);
		
	}
	
}
