class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        List<String> result = new ArrayList<>();
        result.add(words[0]);

        for (int i = 1; i < words.length; i++) {
           
            char[] prev = result.get(result.size() - 1).toCharArray();
            char[] curr = words[i].toCharArray();
            Arrays.sort(prev);
            Arrays.sort(curr);

            if (!Arrays.equals(prev, curr)) {
                result.add(words[i]);
            }
        }
        return result;
    }
}
