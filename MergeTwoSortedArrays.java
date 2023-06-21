public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int first = m-1;
        int second = n-1;
        int combined = m+n-1;
        while(second >= 0){
            if(first >= 0 && arr1[first] > arr2[second]){
                arr1[combined] = arr1[first];
                first--;
                combined--;
            }
            else{
                arr1[combined] = arr2[second];
                second--;
                combined--;
            }
        }
        return arr1;
    }
}