class Solution {
    public int arrayPairSum(int[] nums) {

Arrays.sort(nums);
int n=0;
for(int i=0;i<nums.length;i+=2){
   n=n+nums[i]; 
}
return n;
    }
}