class Solution {
    public String reverseWords(String s) {
     String[] arr=s.split("\\s+");    //convert to string array ignoring one or multiple spaces inbetween words
     StringBuilder str=new StringBuilder();
     for(int i=arr.length-1;i>=0;i--)
     {
        str.append(arr[i]);
        if(i!=0)
            str.append(" "); //if it is not the last word until then append space in between words
     }
     return str.toString().trim(); //convert stringbuilder obj to string and also trim the trailing spaces if any
    }
}
