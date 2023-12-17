class Solution {
    public boolean isPalindrome(String s) 
    {
        String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return s1.equals("") || s1.equals(new StringBuilder(s1).reverse().toString());
    }
}
