package regex;

public class Split {
	
	//In String class
	//public String[] split(String regexStr)
	
	public static void main(String[] args) {
		
		String source = "There are thirty_three big-apple";
		String[] tokens = source.split("\\s+|-|_"); //whitespace(s) or -
		for (String token : tokens) {
			System.out.println(token);
		}
		String date = "12/13/2010";
		//extract day, month and year from this String
		String[] tokens2 = date.split("/");
		for (String token : tokens2) {
			System.out.println(token);
	}
	
	}

}
