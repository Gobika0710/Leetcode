class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            long spellStrength = spells[i];
            long required = (success + spellStrength - 1) / spellStrength;

            int index = binarySearch(potions, required);
            result[i] = m - index; 
        }
        return result;
    }

    private int binarySearch(int[] potions, long required) {
        int left = 0, right = potions.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] < required) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] spells1 = {5, 1, 3};
        int[] potions1 = {1, 2, 3, 4, 5};
        int success1 = 7;
        System.out.println(Arrays.toString(sol.successfulPairs(spells1, potions1, success1))); 
        int[] spells2 = {3, 1, 2};
        int[] potions2 = {8, 5, 8};
        int success2 = 16;
        System.out.println(Arrays.toString(sol.successfulPairs(spells2, potions2, success2))); 
    }
}
