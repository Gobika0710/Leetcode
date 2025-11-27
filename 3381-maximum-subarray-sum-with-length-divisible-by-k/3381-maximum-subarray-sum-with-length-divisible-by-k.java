class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long[] minPrefixByIndexMod = new long[k];
        for (int i = 0; i < k; i++) minPrefixByIndexMod[i] = Long.MAX_VALUE;

        long prefixSum = 0;
        long result = Long.MIN_VALUE;

       
        int idxMinusOneMod = ((-1) % k + k) % k;
        minPrefixByIndexMod[idxMinusOneMod] = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int mod = i % k; 

            if (minPrefixByIndexMod[mod] != Long.MAX_VALUE) {
                result = Math.max(result, prefixSum - minPrefixByIndexMod[mod]);
            }
            minPrefixByIndexMod[mod] = Math.min(minPrefixByIndexMod[mod], prefixSum);
        }

        return result;
    }
}
