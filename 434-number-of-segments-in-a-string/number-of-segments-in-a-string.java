class Solution {
    public int countSegments(String s) {
        if(s==null||s.trim().isEmpty()){
            return 0;
        }
        String []word=s.trim().split("\\s+");
       return word.length;   

        }
    
}