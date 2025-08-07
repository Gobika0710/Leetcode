class Solution {
    public int secondHighest(String s) {
       Set<Integer>digits=new HashSet<>();

       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isDigit(ch)){
            digits.add(ch-'0');
        }
       }
        if(digits.size()<2){
        return -1;
       }
       List<Integer>list=new ArrayList<>(digits);
       Collections.sort(list,Collections.reverseOrder());
    return list.get(1);
}
}