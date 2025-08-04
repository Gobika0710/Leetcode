class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sc = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } 
            else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (c != '#') {
                sc.append(c);
            } 
            else if (sc.length() > 0) {
                sc.deleteCharAt(sc.length() - 1);
            }
        }

        return sb.toString().equals(sc.toString());  
    }
}