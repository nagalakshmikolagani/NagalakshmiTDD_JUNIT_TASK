package tdd_junit;

public class RemoveAInFirstTwoCharactersIfPresent {

	public String remove(String string) {
		String result="";
			if(string.length()>1)
			{
				 if(string.charAt(0)=='A' && string.charAt(1)=='A')
				   result=string.substring(2,string.length());
				 else if(string.charAt(0)=='A') 
				   result=string.substring(1,string.length());
				 else if(string.charAt(1)=='A')
					 result= string.substring(0,1)+string.substring(2,string.length()); 
				 else result=string;
			}
			else
			{
				if((string.length()==1 && string.charAt(0)=='A') || string.length()==0) result="";
				else result=string;
				
			}
		return result;
	}

}
