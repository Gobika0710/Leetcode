class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer>prime=new HashSet<>(Arrays.asList(2,3 ,5, 7, 11, 13, 17, 19, 23, 29, 31));
        int count=0;
        for(int i=left;i<=right;i++){
            int setbits=Integer.bitCount(i);
            if(prime.contains(setbits)){
                count++;
            }
        }
        return count;
    }
}