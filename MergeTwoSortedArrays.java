public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int first = 0;
        int second = 0;
        int[] result = new int[m+n];
        int ref = 0;
        while(first < m && second < n){
            if(arr1[first] < arr2[second]){
                result[ref] = arr1[first];
                ref++;
                first++;
            }else{
                result[ref] = arr2[second];
                ref++;
                second++;
            }
        }
        while(first < m){
            result[ref] = arr1[first];
            ref++;
            first++;
        }
        while(second < n){
            result[ref] = arr2[second];
            ref++;
            second++;
        }
        return result;
    }
}