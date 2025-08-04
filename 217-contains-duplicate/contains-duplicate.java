class Solution {
    public boolean containsDuplicate(int[] nums) {
            Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
        if (!seen.add(num)) {
            return true; // add() returns false if num already exists
        }
    }
    return false;

    }
}