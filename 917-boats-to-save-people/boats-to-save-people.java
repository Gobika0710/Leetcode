class Solution {
    public int numRescueBoats(int[] people, int limit) {
          Arrays.sort(people);
        int count = 0;
        int total = 0;
        int n = people.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(people[i] + people[j] <=limit){
                i++;
            }
            j--;
            count++;
        }
        return count;
    }
}