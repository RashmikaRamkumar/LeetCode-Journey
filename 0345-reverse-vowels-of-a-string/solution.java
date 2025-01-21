class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        String vowels="AEIOUaeiou";
        while(start<end)
        {
            while(start<end && vowels.indexOf(arr[start])==-1)
                start++;
            //if that particular letter is not found in the vowel string i.e the letter is not a vowel it will be -1 or else it will return a vallid index 
            //until then iterate to find a vowel;
            while(start<end && vowels.indexOf(arr[end])==-1)
                end--;
            
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
                
        }
        String str1=new String(arr);
        return str1;
    }
}
