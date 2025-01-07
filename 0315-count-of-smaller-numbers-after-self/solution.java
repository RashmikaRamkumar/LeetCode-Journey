class Solution {

public List<Integer> countSmaller(int[] nums) {
    int n = nums.length;
    Integer[] result = new Integer[n];
    Arrays.fill(result,0);
    int[] indices = new int[n];
    
    for (int i = 0; i < n; i++) indices[i] = i;
    
    mergeSort(nums, indices, result, 0, n - 1);
    return Arrays.asList(result);
}

private void mergeSort(int[] nums, int[] indices, Integer[] result, int left, int right) {
    if (left >= right) return;
    
    int mid = (left + right) / 2;
    mergeSort(nums, indices, result, left, mid);
    mergeSort(nums, indices, result, mid + 1, right);
    
    merge(nums, indices, result, left, mid, right);
}

private void merge(int[] nums, int[] indices, Integer[] result, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left, j = mid + 1, k = 0, rightCount = 0;
    
    while (i <= mid && j <= right) {
        if (nums[indices[j]] < nums[indices[i]]) {
            rightCount++;
            temp[k++] = indices[j++];
        } else {
            result[indices[i]] = result[indices[i]] == null ? rightCount : result[indices[i]] + rightCount;
            temp[k++] = indices[i++];
        }
    }
    
    while (i <= mid) {
        result[indices[i]] = result[indices[i]] == null ? rightCount : result[indices[i]] + rightCount;
        temp[k++] = indices[i++];
    }
    
    while (j <= right) temp[k++] = indices[j++];
    
    for (i = left; i <= right; i++) indices[i] = temp[i - left];
}
}
