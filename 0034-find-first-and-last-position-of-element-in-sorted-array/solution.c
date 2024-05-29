/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int i=0,j=numsSize-1;
    int* returnS=(int*)malloc(2*sizeof(int));
    returnS[0]=-1;
    returnS[1]=-1;
    *returnSize=2;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
            returnS[0]=i;
            break;
        }
    }
    for(j=numsSize-1;j>=0;j--)
    {
        if(nums[j]==target)
        {
            returnS[1]=j;
            break;
        }
    }
    return returnS;
}
