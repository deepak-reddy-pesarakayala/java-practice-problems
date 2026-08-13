package practice;
class Solution {
    public boolean isNumericString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isNumericString("12345"));
        System.out.println(obj.isNumericString("123a5"));
    }
}