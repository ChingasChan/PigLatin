
public class pigLatin {
	
	String phrase;
	String[] words;
	
	public pigLatin(String s) {
		phrase = s;
		words = phrase.split(" ");
	}
	
	public void listWords() {
		for(String word : words)
			System.out.println(word);
	}
	
	public String[] getWords() {
		return words;
	}
	
	public boolean isConstant(char letter) {
		
		int ascii = (int)letter;
		int[] testValues = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};
		boolean test = true;
		
		if((65 <= ascii && ascii <= 90) || (97 <= ascii && ascii <= 122)) {
			for(int x = 0; x < testValues.length; x++) {
				if(ascii == testValues[x]) {
					test = false;
					break;
				}
			}		
			return test;
		}
		else 
			return false;
	}
	
	public String pigged(String word) {
		String newWord;
		int index;
		
		for(index = 0; index < word.length(); index++) {		
			if(!isConstant(word.charAt(index)))
				break;
		}
		
		if(index != 0) {
			String part1 = word.substring(index, word.length());
			String part2 = word.substring(0, index);
			
			if(Character.isUpperCase(word.charAt(0))) {
				part1 = (char)((int)part1.charAt(0)-32) + part1.substring(1);		
				part2 = (char)((int)part2.charAt(0)+32) + part2.substring(1);
			}
			
			newWord = part1 + part2 + "ay";
		}
		else
			newWord = word + "yay";
		
		return newWord;
	}
	
	public String[] piggedPhrase() {
		String[] newWords = new String[words.length];
		
		for(int x = 0; x < words.length; x++) {
			newWords[x] = pigged(words[x]);
		}
		
		return newWords;
	}

}
