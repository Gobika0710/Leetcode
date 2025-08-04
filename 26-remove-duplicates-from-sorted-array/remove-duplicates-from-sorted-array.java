class Solution {
    public int removeDuplicates(int[] nums) {
             Map<Integer,Integer>mp=new LinkedHashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            nums[i++]=entry.getKey();
        }
        return mp.size();
   
    }
}