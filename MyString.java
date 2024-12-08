/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
            System.out.println("\nTesting spacedString:");
            System.out.println("silent -> \"" + MyString.spacedString("silent") + "\" (expected: s i l e n t)");
            System.out.println("a -> \"" + MyString.spacedString("a") + "\" (expected: a)");
            System.out.println("empty string -> \"" + MyString.spacedString("") + "\" (expected: )");
            System.out.println("hi -> \"" + MyString.spacedString("hi") + "\" (expected: h i)");
        
     //   System.out.println(subsetOf("runi", "runiiiii"));
    //  System.out.println(countChar(hello, 'h'));
    //    System.out.println(countChar(hello, 'l'));
    //    System.out.println(countChar(hello, 'z'));
    //    System.out.println(spacedString(hello));
    //    System.out.println(remove("committee", "meet"));
    //    System.out.println("\nTesting remove:");
    //   System.out.println("committee - meet -> " + MyString.remove("committee", "meet") + " (expected: comit)");
    //    System.out.println("abc - abc -> " + MyString.remove("abc", "abc") + " (expected: )");
    //    System.out.println("abc - b -> " + MyString.remove("abc", "b") + " (expected: ac)");
    //    System.out.println("hello - empty string -> " + MyString.remove("hello", "") + " (expected: hello)");

    }
 
    
    
    

        //// Put your other tests here.
    

    /**
     * Returns the number of times the given character appears in the given string.
     * Example: countChar("Center",'e') returns 2 and countChar("Center",'c') returns 0. 
     * 
     * @param str - a string
     * @param c - a character
     * @return the number of times c appears in str
     */
    public static int countChar(String str, char ch) {
        int count = 0;
        if(str.isEmpty()){
            return 0;
        }
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    /** Returns true if str1 is a subset string str2, false otherwise
     *  Examples:
     *  subsetOf("sap","space") returns true
     *  subsetOf("spa","space") returns true
     *  subsetOf("pass","space") returns false
     *  subsetOf("c","space") returns true
     *
     * @param str1 - a string
     * @param str2 - a string
     * @return true is str1 is a subset of str2, false otherwise
     */
    public static boolean subsetOf(String str1, String str2) {
        if(str1.isEmpty()){
            return true;
        }
        for (int i = 0; i < str1.length(); i++){
            if(countChar(str2, str1.charAt(i)) < countChar(str1,  str1.charAt(i))){
                return false;
            }
         }
        return true;
    }

    /** Returns a string which is the same as the given string, with a space
     * character inserted after each character in the given string, except
     * for the last character. 
     * Example: spacedString("silent") returns "s i l e n t"
     * 
     * @param str - a string
     * @return a string consisting of the characters of str, separated by spaces.
     */
    public static String spacedString(String str) {
        String spaced = " ";
        if(str.isEmpty()){
            return spaced;
        }
        for (int i = 0; i < str.length()-1; i++){
            spaced += str.charAt(i) + " ";
        }
        spaced += str.charAt(str.length()-1);
        return spaced;
    }
  
    /**
     * Returns a string of n lowercase letters, selected randomly from 
     * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
     * letter can be selected more than once.
     * 
     * Example: randomStringOfLetters(3) can return "zoo"
     * 
     * @param n - the number of letter to select
     * @return a randomly generated string, consisting of 'n' lowercase letters
     */
    public static String randomStringOfLetters(int n) {
        if (n == 0){
            return "";
        }
        String random = "";
        for (int i = 0; i < n; i++){
            int ran = (int)(Math.random() * (122 - 97 + 1) + 97);
            random += (char)(ran);
        }

        return random;
    }

    /**
     * Returns a string consisting of the string str1, minus all the characters in the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: remove("meet","committee") returns "comit" 
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
     */
    
public static String remove(String str1, String str2) {
    for (int i = 0; i < str2.length(); i++) {
        char currentChar = str2.charAt(i);
        int currentIndex = str1.indexOf(currentChar);
        str1 = str1.substring(0, currentIndex) + str1.substring(currentIndex + 1);        
    }
    return str1;
}


    /**
     * Returns a string consisting of the given string, with the given 
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or "cast", or "cats".  
     * @param ch - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
         // Generate a random index between 0 and str.length()
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         // Insert the character at the random index
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }    
}
