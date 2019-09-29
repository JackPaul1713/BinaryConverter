package binaryToEnglish;

public class BinaryToEnglish
{

	public static String binaryToEnglish(String message)
	{
		
		//variables
		
		String refinedMessage;
		String[] refinedMessageArray;
		String convertedMessage;
		
		//action
		
		refinedMessage = RefineMessage.refineMessage(message);
		refinedMessageArray = RefinedMessageToArray.refinedMessageToArray(refinedMessage);
		convertedMessage = ConvertMessage.convertMessage(refinedMessageArray);
		
		//return
		
		return(convertedMessage);
		
	}
	
}
