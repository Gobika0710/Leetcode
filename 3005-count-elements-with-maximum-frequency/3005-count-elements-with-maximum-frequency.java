class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        for (int count : freq.values()) {
            maxFreq = Math.max(maxFreq, count);
        }
        int total = 0;
        for (int count : freq.values()) {
            if (count == maxFreq) {
                total += count;
            }
        }

        return total;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 2, 3, 1, 4};
        System.out.println(sol.maxFrequencyElements(nums1));
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(sol.maxFrequencyElements(nums2));
    }
}
