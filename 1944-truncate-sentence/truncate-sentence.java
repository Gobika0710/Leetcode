class Solution {
    public String truncateSentence(String s, int k) {
        String word[]=s.trim().split(" ");
         StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(word[i]);
            if(i<k-1){
                sb.append(" ");
            }

        }
        return sb.toString();
    }
}