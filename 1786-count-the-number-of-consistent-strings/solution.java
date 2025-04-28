class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] arr=new int[26];
        for(int i=0;i<allowed.length();i++)
            arr[allowed.charAt(i)-'a']=1;
        int count=0;
        for(String word : words)
        {   
            boolean flag=false;
            for(char c : word.toCharArray())
            {
                
                if(arr[c-'a']==0)
                {
                    flag=true;
                    break;
                }

            }
            if(!flag)
                count++;
        }
        return count;
    }
}
