class Solution {
    public int fib(int n) {
            if(n == 0 || n == 1){
            return n;
        }
        int second_prev = 0;
        int first_prev = 1;
        int result = second_prev + first_prev;
        for(int i = 2 ; i < n ; i++){
            int temp = first_prev;
            second_prev = temp;
            first_prev = result;
            result = first_prev + second_prev;
        }
        return result;
    
    }
}