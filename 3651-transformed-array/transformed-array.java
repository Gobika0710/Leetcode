class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                r[i]=nums[i];
            }
            else{
                int t=i+nums[i];
                while(t<0){
                    t+=n;
                }
                while(t>=n){
                    t-=n;
                }
                r[i]=nums[t];
            }
        }
        return r;
    }
}