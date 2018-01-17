
import java.util.Scanner;

public class PigLatinTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a phrase: ");
		String phrase = sc.nextLine();
		pigLatin pig = new pigLatin(phrase);
		
		String[] newWords = pig.piggedPhrase();
		
		for(String s : newWords)
			System.out.print(s + " ");
	}
}
