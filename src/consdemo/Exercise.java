package consdemo;

public class Exercise {

	String sentence = "The quick brown fox jumps over the lazy dog";
	
	public void index() {
		//Print the character at the 12th index. 
		System.out.println("The character at 12th index : "+sentence.charAt(12));	
	}
	
	public void contains() {
		String word = "is";
		if (sentence.contains(word)) {
			System.out.println("This string does contain the word : 'is'");
		}
		else {
			System.out.println("This string doesn't contain the word : 'is'");
		}
	}
	
	public void addString() {
		sentence = sentence.concat(" and killed it");
		System.out.println(sentence);
	}
	
	public void ends() {
		String word = "dogs";
		if (sentence.endsWith(word)) {
			System.out.println("This string ends with the word : 'dogs'");
		}
		else {
			System.out.println("This string doesn't end with the word : 'dogs'");
		}
	}
	
	public void equals() {
		String word1 = "The quick brown Fox jumps over the lazy Dog";
		String word2 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		if (sentence.contentEquals(word1)) {
			System.out.println("This string is equal to 'The quick brown Fox jumps over the lazy Dog'");
		}
		else if (sentence.contentEquals(word2)){
		System.out.println("This string is equal to 'The quick brown Fox jumps over the lazy Dog'");
		}		
		else {
			System.out.println("The string isn't equal to either words.");
		}
	}
	
	public void length() {
		int length = sentence.length();
		System.out.println("The length of this string is : "+length);
	}
	
	//8
	public void match() {
		String word = "The quick brown Fox jumps over the lazy Dog";
		if (word.matches(sentence)) {
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {

		Exercise answer = new Exercise();
		answer.index();
		answer.contains();
		answer.addString();
		answer.ends();
		answer.equals();
		answer.length();
	}

}
