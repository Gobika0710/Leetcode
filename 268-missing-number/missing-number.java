class Solution {
    public int missingNumber(int[] nums) {
       int currSum = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
        }

        int expectedSum = (n * (n+1)) / 2;

        return expectedSum - currSum;
 
    }
}