class Solution {
    public char repeatedCharacter(String s) {
        int[] arr=new int[26];
        int i=0;
        char[] chars=s.toCharArray();
        for(char c : chars)
        {
            arr[c-'a']++;
            if(arr[c-'a']==2)
                return c;
        }
        return ' ';
    }
}
