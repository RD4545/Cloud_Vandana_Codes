public class Pangram {
    public static void main(String[] args) {
        
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input.toLowerCase());
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean isPangram(String str) {
        
        boolean[] alphabet = new boolean[26];

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                alphabet[ch - 'a'] = true;
            }
        }

  
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
