public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        long ans = 1;
        long xx = x;
        while(n > 0){
            if(n % 2 == 1){
                ans = (ans % m) * (xx % m)%m;
                n--;
            }else{
                xx = ((xx % m) * (xx % m)) % m;
                n = n / 2;
            }
        }
        return (int)ans;
    }
}