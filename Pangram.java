public class Pangram {
    public static boolean isPangram(String sentence) {
       
        boolean[] isLetterPresent = new boolean[26];

       
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
               
                isLetterPresent[c - 'a'] = true;
            }
        }

       
        for (boolean letterPresent : isLetterPresent) {
            if (!letterPresent) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = isPangram(sentence);
        System.out.println("Is the sentence a pangram ? " + isPangram);
    }
}
