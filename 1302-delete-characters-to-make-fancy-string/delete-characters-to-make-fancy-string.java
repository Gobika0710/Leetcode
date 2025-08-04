class Solution {
    public String makeFancyString(String s) {
    StringBuilder res=new StringBuilder("");
        int n=s.length();
        int freq=0;
        char ch='$';
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch!=ch1){
                freq=0;
            }else if(ch==ch1){
                freq++;
            }
            if(freq>=2){
                ch=ch1;
                continue;
            }
            res.append(ch1);
            ch=ch1;
        }
        return res.toString();
    
    }
}