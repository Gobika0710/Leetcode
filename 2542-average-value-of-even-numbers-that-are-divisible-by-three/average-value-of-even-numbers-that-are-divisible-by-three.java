class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0&&nums[i]%3==0){
                
                    sum+=nums[i];

                count++;
            }

        }
        int s=0;
        if(count >0){
            s= sum/count;
        return s;
    }
    return 0;
    }
}
