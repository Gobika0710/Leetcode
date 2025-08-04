class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res = new int[2];
        int n1=nums1.length;
        int n2=nums2.length;
        int sum1 = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j]) {
                    sum1++;
                    break; 
                }
            }
        }
        res[0] = sum1;

      
        int sum2 = 0;
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n1; j++) {
                if (nums2[i] == nums1[j]) {
                    sum2++;
                    break;
                }
            }
        }
        res[1] = sum2;

        return res;

    }
}