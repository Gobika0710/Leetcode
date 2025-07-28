class Solution {
    public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverse=new StringBuilder(s1).reverse().toString();
        return s1.equals(reverse);
    }
}