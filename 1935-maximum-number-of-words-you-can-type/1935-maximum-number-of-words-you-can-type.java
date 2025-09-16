class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> broken = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) broken.add(c);

        int count = 0;
        for (String word : text.split(" ")) {
            if (word.chars().noneMatch(ch -> broken.contains((char) ch)))
                count++;
        }
        return count;
    }
}
