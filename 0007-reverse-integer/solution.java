// class Solution {
//     public int reverse(int x) {
//         boolean sign=x<0;
//         String num=String.valueOf(Math.abs(x));
//         StringBuilder s=new StringBuilder(num).reverse();
//         int res=0;
//         //res=Integer.parseInt(s.toString());
//         try{
//             res=Integer.parseInt(s.toString());
//         }
//         catch(NumberFormatException e)
//         {
//             return 0;
//         }
//         return sign ? -res : res;
//     }
// }

class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int rem= x % 10;
            rev = rev * 10 +rem;
            x /= 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0; 
                // overflow case if reversed number is not 
                // within java's integer size
            }
        }
        return (int) rev;
    }
}

