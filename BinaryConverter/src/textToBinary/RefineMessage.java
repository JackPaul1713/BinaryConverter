package textToBinary;

public class RefineMessage
{

	public static String refineMessage(String message)
	{
		
		//variables
		
		int messageLength;
		String refinedMessage = "";
		
		//action
		
		messageLength = message.length();
		
		for (int ml = 0; ml < messageLength; ml++)
		{
			
			refinedMessage = refinedMessage + message.substring(ml, ml + 1) + "~";
			
		}
		
		//return
		
		return(refinedMessage);
		
	}
	
}
