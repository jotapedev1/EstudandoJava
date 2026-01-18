package LayersHackathon.Tradicionais.Palindrome;

public class Palindrome {
    static boolean isPalindrome(String s){
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
        String word = "arara";
        boolean res = isPalindrome(word);
}
