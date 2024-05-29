int maxArea(int* height, int heightSize) {
    int i=0,j=heightSize-1;
    int res=0,ans=0;
    while(i<j)
    {
        if(height[i]<=height[j])
        {
            res=height[i]*(j-i);
            i++;
        }
        else
        {
            res=height[j]*(j-i);
            j--;
        }
        if(res>ans)
            ans=res;
    }
    return ans;
}
