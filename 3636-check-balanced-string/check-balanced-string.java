class Solution {
    public boolean isBalanced(String num) {
     int odd=0;
     int even=0;

     for(int i=0;i<num.length();i++){
        int ch=num.charAt(i)-'0';
        if(i%2==0){
            even+=ch;
        }
        else{
            odd+=ch;
        }
     }   
     if(odd==even){
        return true;
     }
     else{
     return false;
    }
    }
}