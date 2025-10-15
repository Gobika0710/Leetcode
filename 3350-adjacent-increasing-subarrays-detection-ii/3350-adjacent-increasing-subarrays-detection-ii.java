class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
     
        int n = nums.size();
        int[] incL = new int[n];
        int[] incR = new int[n]; 
        incL[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1))
                incL[i] = incL[i - 1] + 1;
            else
                incL[i] = 1;
        }
        incR[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1))
                incR[i] = incR[i + 1] + 1;
            else
                incR[i] = 1;
        }

        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, Math.min(incL[i], incR[i + 1]));
        }

        return ans;
    }
}
