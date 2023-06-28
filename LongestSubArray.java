public class Solution {

    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
            if(sum == 0){
                len = i + 1;
            }else if(map.containsKey(sum - 0)){
                len = Math.max(len, i - map.get(sum - 0));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
}