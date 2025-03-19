class Solution {
    public boolean digitCount(String num) {
        int [] arr=new int[10];
        char[] charr=num.toCharArray();
        for(char c : charr)
            arr[c-'0']++;
        for(int i=0;i<num.length();i++)
        {
            if(arr[i]!=charr[i]-'0')
                return false;
        }
        return true;
    }
}
