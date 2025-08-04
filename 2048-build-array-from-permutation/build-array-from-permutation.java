class Solution {
    public int[] buildArray(int[] nums) {
         ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[nums[i]]);
        }
        
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}