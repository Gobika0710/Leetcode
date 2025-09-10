class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
            for (int num : nums) {
            int sumDiv = 0;
            int count = 0;
            int limit = (int) Math.sqrt(num);
            for (int i = 1; i <= limit; i++) {
                if (num % i == 0) {
                    int otherDiv = num / i;
                    if (i == otherDiv) {
                        count += 1;
                        sumDiv += i;
                    } else {
                        count += 2;
                        sumDiv += i + otherDiv;
                    }
                    
                    if (count > 4) {
                        break;
                    }
                }
            }
            
            if (count == 4) {
                totalSum += sumDiv;
            }
        }
        
        return totalSum;
    }
}
