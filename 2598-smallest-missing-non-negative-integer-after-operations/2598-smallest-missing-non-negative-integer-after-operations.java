class Solution {
    public int findSmallestInteger(int[] nums, int value) {
       
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            int rem = ((num % value) + value) % value;
            count.put(rem, count.getOrDefault(rem, 0) + 1);
        }
        for (int i = 0; ; i++) {
            int rem = i % value;
            if (!count.containsKey(rem) || count.get(rem) == 0) {
                return i;
            }
            count.put(rem, count.get(rem) - 1);
        }
    }
}
