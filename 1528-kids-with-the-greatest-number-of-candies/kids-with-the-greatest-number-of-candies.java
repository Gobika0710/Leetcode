class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean>output =new ArrayList<>();
         int greatest = candies[0];
         for(int x=1;x<candies.length;x++){
            if (candies[x]>greatest) greatest=candies[x];
         }
         for(int y=0;y<candies.length;y++){
             if(candies[y]+extraCandies>=greatest)output.add(true);
             else output.add(false);
         }
         return output; 
        
        
    }
}