class Solution {
    public int minimumLength(String s) {
     int[] arr=new int[26];
     for(char c:s.toCharArray())
     {
        arr[c-'a']++;
     }   
     int del=0;
     for(int i:arr)
     {
        if(i==0)
            continue;
        else if(i%2==0)
            del+=2;
        else
            del+=1;
     }
     return del;
    }
}
