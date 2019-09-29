package englishToBinary;

public class EnglishToBinary
{

	public static String englishToBinary(String message)
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
