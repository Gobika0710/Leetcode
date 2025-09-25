class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String words[]=s.split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            String a=words[i];
            sb.append(a);
            if(i>=1){
                sb.append(" ");
            }
            
         }
         return sb.toString().trim();
    }
}