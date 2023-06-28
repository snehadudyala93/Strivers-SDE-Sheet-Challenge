public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        if (arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                if (arr[i] == arr[i-1]+1) {
                    currentStreak += 1;
                }
                else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(longestStreak, currentStreak);
    }
}

// approach 2 (Hashing)

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int count = 1;
                int temp = nums[i] + 1;
                while(set.contains(temp)){
                    temp += 1;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}