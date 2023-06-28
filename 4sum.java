public class Solution {
    public static String fourSum(int[] arr, int target, int n) {
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] == arr[j-1]) continue;
                int first = j+1;
                int last = n-1;
                while(first < last){
                    long sum = arr[i] + arr[j];
                    sum += arr[first];
                    sum += arr[last];
                    if(sum == target) return "Yes";
                    else if (sum > target) last--;
                    else first++;
                }
            }
        }
        return "No";
    }
}