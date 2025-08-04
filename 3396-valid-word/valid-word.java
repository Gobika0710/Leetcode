class Solution {
    public boolean isValid(String word) {
             if (word.length() < 3)
            return false;
        boolean vowel = false;
        boolean consonant = false;
        int i = 0;
        for (; i < word.length(); i++) {
            Character car = word.charAt(i);
            if (Character.isLetter(car)) {
                if ("aeiouAEIOU".indexOf(car) != -1) {
                    vowel = true;
                } else {
                    consonant = true;
                }
                if (vowel && consonant) {
                    break;
                }
            } else if (!Character.isDigit(car))
                return false;
        }
        for (; i < word.length(); i++) {
            if (!Character.isLetterOrDigit(word.charAt(i)))
                return false;
        }
        return vowel && consonant;
   
    }
}