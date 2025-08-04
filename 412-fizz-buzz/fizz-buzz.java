class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>(n);
       for (int i = 1; i <= n; i++) {
        
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                results.add("FizzBuzz");
            } else if (divisibleBy3) {
                results.add("Fizz");
            } else if (divisibleBy5) {
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;   
    }
}