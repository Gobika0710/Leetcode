class Solution {
    public boolean checkDivisibility(int n) {
        int o=n;
        int sum=0;
        int product=1;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n/=10;

        }
        int total=sum+product;
        if(total==0) return false;
        
        return o%total==0;
    }
}