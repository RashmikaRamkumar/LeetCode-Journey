// class Solution {
//     public String largestOddNumber(String num) {
//         if((int)num.charAt(num.length()-1)%2!=0)
//             return num;
//         int num1=Integer.parseInt(num);
//         while(num1>0)
//         {
//             if(num1%2!=0)
//                 return String.valueOf(num1);
//             num1/=10;
//         }
//         return "";
//     }
// }


class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--)
        {
            if((int)num.charAt(i)%2!=0)
                return num.substring(0,i+1);
        }
        return "";
    }
}
