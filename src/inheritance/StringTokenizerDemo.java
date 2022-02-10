package inheritance;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		int count=0;
		String quotes = "Honesty is the best policy and is good policy and is health policy";
		StringTokenizer tokenizer = new StringTokenizer(quotes);
		
		System.out.println("Number of words :"+tokenizer.countTokens());
		
		while(tokenizer.hasMoreTokens()) {
			String temp = tokenizer.nextToken();
			if(temp.equals("and"))
				count++;
		}
		
		System.out.println("Count of \"and\" in the string :"+count);
	}

}
