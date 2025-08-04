class Solution {
    public int firstUniqChar(String s) {
       int[] count = new int[26];

        s = s.toLowerCase();

        char[] CharArray = s.toCharArray();
        for(char c : CharArray){
            count[c - 'a']++;
        }

        for(int i=0 ; i < s.length(); i++){
            if(count[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
           
    }
}