class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    public int mergeSort(int[] array, int low, int high){
        if(low >= high) return 0;
        int count = 0;
        int mid = (low + high) / 2;
        count += mergeSort(array, low, mid);
        count += mergeSort(array, mid+1, high);
        count += countPairs(array,low,mid,high);
        merge(array, low, mid, high);
        return count;
    }
    public void merge(int[] arr, int low, int mid, int high){
        int first = low;
        int second = mid+1;
        int[] temp = new int[high-low+1];
        int count = 0;
        while(first <= mid && second <= high){
            if(arr[first] <= arr[second]){
                temp[count++] = arr[first++];
            }
            else{
                temp[count++] = arr[second++];
            }
        }
        while(first <= mid) temp[count++] = arr[first++];
        while(second <= high) temp[count++] = arr[second++];
        for(int i = low; i <= high; i++){
            arr[i] = temp[i-low];
        }
    }
    public int countPairs(int[] arr, int low, int mid, int high){
        int right = mid + 1;
        int count = 0;
        for(int i = low; i <= mid; i++){
            while(right <= high && (long)arr[i] > (long)2 * arr[right]){
                right++;
            }
            count = count + (right - (mid + 1));
        }
        return count;
    }
}