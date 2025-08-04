class Solution {
    public boolean isHappy(int n) {
             while(n!=1 && n!=4){
            int a=0;
            while (n>0){
                int d=n%10;
                a=a+(d*d);
                n=n/10;
            }
            n=a;
        }
        return (n==1)?true:false;
   
    }
}