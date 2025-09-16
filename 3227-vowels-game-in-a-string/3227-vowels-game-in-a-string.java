class Solution {
    public boolean doesAliceWin(String s) {
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) return true; // found a vowel
        }
        return false;
    }
}
