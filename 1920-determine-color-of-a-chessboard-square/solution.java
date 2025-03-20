class Solution {
    public boolean squareIsWhite(String coordinates) {
        char letter=coordinates.charAt(0);
        if(letter =='a'||letter =='c'||letter =='e'||letter =='g')
            letter='1';
        else
            letter='2';
        System.out.println(letter);
        int num=coordinates.charAt(1)-'0';
        if((letter=='1' && num%2!=0) ||(letter=='2' && num%2==0))
            return false;
        return true;
    }
}
