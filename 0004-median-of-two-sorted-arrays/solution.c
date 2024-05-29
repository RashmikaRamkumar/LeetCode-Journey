double findMedianSortedArrays(int* nums1, int nums1size, int* nums2, int nums2size)
{
    int size=nums1size+nums2size;
    int temp,i,j;
    int arr[size];
    for(i=0;i<nums1size;i++)
    {
        arr[i]=nums1[i];
    }
    for(i=0,j=nums1size;i<nums2size&&j<size;i++,j++)
        arr[j]=nums2[i];
    for(i=0;i<size;i++)
    {
        for(j=i+1;j<size;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    if(size%2==0)
    {
        int m=size/2;
        int r=(size/2)-1;
        double ans=arr[r]+arr[m];
        return ans/2;
    }
    else
    {
        int r=size/2;
        return arr[r];
    }
    
    
}
