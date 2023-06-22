public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        long n1 = n;
        long sum = 0;
        long sum2 = 0;
        long actsum = (n1 * (n1+1)) / 2;
        long actsum2 = (n1 * (n1+1) * (2*n1 + 1))/6;
        long x = 0;
        long y = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
            sum2 += arr.get(i) * arr.get(i);
        }

        long equ1 = actsum - sum;
        long equ2 = actsum2 - sum2;
        equ2 = equ2/equ1;
        x = (equ1 + equ2) / 2;
        y = x - equ1;
        return new int[]{(int)x,(int)y};
    }
}