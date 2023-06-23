public class Solution {
    public static int findMajority(int[] arr, int n) {
        int count = 0;
        int ele = 0;
        //int n = nums.length;
        for(int i = 0; i < n; i++){
            if(count == 0){
                count = 1;
                ele = arr[i];
            }else if(arr[i] == ele) count++;
            else count--;
        }
        int count2 = 0;
        for(int num : arr){
            if(num == ele) count2++;
        }
        if(count2 > n/2) return ele;
        return -1;
    }
}