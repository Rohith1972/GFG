// User function Template for Java

class Complete {

    public static String Sandwiched_Vowel(String str) {
        // Complete function
        if(str.length()<3)
            return str;
        HashSet<Character> consonants = new HashSet<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'
));
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
));
        StringBuilder res = new StringBuilder(String.valueOf(str.charAt(0)));
        for(int i=1;i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(vowels.contains(ch)&&consonants.contains(str.charAt(i-1))&&consonants.contains(str.charAt(i+1)))
                continue;
            else
                res.append(str.charAt(i));
        }
        res.append(str.charAt(str.length()-1));
        return res.toString();
    }
}
