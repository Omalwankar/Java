
public class FileFun {
		public static void main (String [] args) {
			String myTarzan = FileIO.getFile("Tarzan");
			String myFoo = FileIO.getFile("foo"); 
			System.out.println(countWords(myTarzan)); 
			//System.out.println(removePunctuation(myTarzan)); 
			//System.out.println(countWord(myTarzan, "book"));
			//System.out.println(myFoo.indexOf("fun"));
			//System.out.println(countQs(myFoo)); 
		}
		
		public static int countQs(String input) {
			int count = 0;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i)  == 'q') {
					count++; 
				}
			}
			return count;
		}
		public static int countLetter(String input, char letter) {
			int count = 0;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == letter);
				count++;
			}
			return count;
		}
		public static int countWord(String input, String word ) {
			int position = 0;
			int count = 0;
			while (position >= 0) {
				position = input.indexOf(word, position);
				if (position >= 0) {
					position++; 
					count++;
				}
			}
			return count;
		}
		public static int countWords(String input) {
			return removePunctuation(input).split(" ").length; 
		}
		public static String removePunctuation(String input) {
			StringBuilder output = new StringBuilder();
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if ( c != '.' && c != '?' && c != ',' && c != '-' && c != ':' && c != ';' && c != '\'' && c != '\"') {
					output.append(c);
				}
			}
			return output.toString();
		}
		
		public static String reverse(String input) {
			StringBuilder output = new StringBuilder();
			
			for (int i = input.length()-1; i >= 0; i--) {
				output.append(input.charAt(i));
			}
			
			return output.toString(); 
		}
		
		public static String caesarCipher(String input) {
			return input;
		}
		
		public static boolean isPalindrome(String input) {
			return false;
		}
		public static double averageWordLength(String input) {
			return 0;
		}
		public static String longestWord(String input) {
			return "";
		}
		// Hard
		public static char mostCommonLetter(String input) {
			return 'e';
		}
		
}
