class Solution:
    def countInterestingSubarrays(self, nums: List[int], modulo: int, k: int) -> int:
        cache = defaultdict(int)
        cache[0] = 1
        count = 0
        sum = 0
        for num in nums:
            sum += int(num % modulo == k)
            count += cache[(sum + modulo - k) % modulo]
            cache[sum % modulo] += 1
        
        return count
 