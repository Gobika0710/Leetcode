class Solution {
    public int sumBase(int n, int k) {
              int result=0;
        while(n>0)
        {
            int rem=n%k;
             n=n/k;
            result=result+rem;
        }
       return result; 
  
    }
}