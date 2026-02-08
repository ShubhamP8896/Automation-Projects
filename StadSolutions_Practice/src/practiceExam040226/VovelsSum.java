package practiceExam040226;

public class VovelsSum 
{
	 public static void main(String[] args) {

	        String word = "Automation Program";
	        int vowels = 0;
	        int consonants = 0;

	        word = word.toLowerCase();

	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);

	            if (ch >= 'a' && ch <= 'z') { // check only letters
	                if (ch == 'a' || ch == 'e' || ch == 'i' || 
	                    ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	    }

}
