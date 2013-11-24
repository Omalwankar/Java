import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Hangman {
	static char[] word;
	static char guess;
	static boolean[] shown;
	static int limit;
	public static void main(String[] args){
		getWord();
		while (! done()) {	
			printGame();
			getGuess();
		    int found = processGuess();
		    if (found == 0){
		    	System.out.println("Didn't guess correctly!");
		         limit++;
		         if (limit == 6){
		        	 System.out.println("Out of guesses!");
		         }
		}
		    else {
		    	System.out.println();
		    }
		}
		System.out.println(word);
	}
	public static void printGame(){
		int index = 0;
		while (index < word.length){
			if (word[index] == ' '){
				System.out.println(" ");
			}
			if (shown[index]){
				System.out.print(word[index]);
				limit++;
				
			}
			else {
				System.out.print("_");
			}
			index++;
			
		}
		System.out.println();
	}
	public static void getGuess() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a guess: ");
		String input = s.nextLine();
		guess =  input.toUpperCase().charAt(0);
	}
	public static int processGuess() {
		int found = 0;
		for (int index =0; index < word.length; index++) {
			if (word[index] == guess) {
				shown[index] = true;
				found++;
			}
		}
		return found; 
	}
	public static void getWord() {
		String[] words = new String[3];
		File f= new File("words");
		try {
			Scanner s = new Scanner(f);
			for(int x=0; x <3; x++){
				words[x] = s.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		String str = words[(int) (Math.random()*3)];
		word = str.toUpperCase().toCharArray();
		shown = new boolean [word.length];
		limit = 0;
	}
	public static boolean done() {
		if ( limit == 6){
			return true;
		}
		for ( int index = 0; index < word.length; index++){
			if (! shown[index]){
				return false;
			}
		}
		return true;
	}
}
