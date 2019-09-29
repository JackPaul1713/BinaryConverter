package textToBinary;

public class TextToBinary
{

	public static String textToBinary(String message)
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
