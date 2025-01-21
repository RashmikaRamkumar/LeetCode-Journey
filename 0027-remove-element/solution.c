int removeElement(int* nums, int numsSize, int val) {
    int i,j;
    int k=numsSize;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==val)
        {
            nums[i]=51;//nums value will be lesser than 50 only as per constraint
            k--;
        }
    }
    
    int temp;
    for(i=0;i<numsSize;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            if(nums[i]>nums[j])
            {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
    return k;
}
