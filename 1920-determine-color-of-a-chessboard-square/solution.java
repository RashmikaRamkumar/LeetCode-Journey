class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(0);
        int b=coordinates.charAt(1)-'0';
        int c=a-'a';
        if((c%2==0 && b%2==0) ||(c%2!=0 && b%2!=0))
            return true;
        return false;
    }
}
