class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output=new ArrayList<String>(); 
        int i;
        for(i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
                output.add("FizzBuzz");
            else if(i%3==0)
                output.add("Fizz");
            else if(i%5==0)
                output.add("Buzz");
            else
            {
              String a = Integer.toString(i);
              output.add(a);

            }
                
        } 
        return output;

    }
}
