int removeDuplicates(int* nums, int numsSize) {
    int i,j,k=numsSize;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]!=101)
        {
            for(j=i+1;j<numsSize;j++)
            {
                if(nums[i]==nums[j])
                {
                    nums[j]=101;
                    k=k-1;
                }
            }
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
    
