class Solution {
    public String sortVowels(String s) {
        Set<Character>set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        List<Character>vowels=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                vowels.add(c);
            }
        }
        Collections.sort(vowels);
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                sb.append(vowels.get(i++));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}