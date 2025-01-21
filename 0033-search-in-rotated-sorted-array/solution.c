int search(int* nums, int numsSize, int target) {
    int i,j,res=-1;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
            res=i;
        }
    }
    return res;
}
