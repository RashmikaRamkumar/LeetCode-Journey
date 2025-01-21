import java.util.*;
class Solution {
    public static int getSum(int a, int b)
     {
        while(b!=0)
        {
            int c;
            c=a&b;
            a=a^b;
            b=c<<1;
        }
        return a;
    }

    public static void main(String[] args)
    {   
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        int result;
        result=getSum(a,b);
        System.out.println(result);
    }
}

