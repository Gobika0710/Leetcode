class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
      int ans[]=new int[n+n];  
      int ind=0;
      for(int i=0;i<n;i++){
        ans[ind]=nums[i];
        ind++;
      }
      for(int j=0;j<n;j++){
        ans[ind]=nums[j];
        ind++;
      }
      return ans;
    }
}