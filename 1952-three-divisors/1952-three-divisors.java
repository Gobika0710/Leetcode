class Solution {
    public boolean isThree(int n) {
        int d=3;
        int count=0;
       for(int i=1;i<=n;i++){
        if(n%i==0){
            count++;
        }
       } 
       if(count==d){
        return true;
       }
       return false;
    }
}