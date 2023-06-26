class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dummy = new int[m][n];
        int ans = paths(0, 0,m,n,dummy);
        return ans;
    }
    public int paths(int start, int end,int m, int n, int[][] dummy){
        if(start == m-1 && end == n-1) return 1;
        if(start >= m || end >= n ) return 0;
        if(dummy[start][end] != 0) return dummy[start][end];
        else dummy[start][end] = paths(start+1,end,m,n,dummy)
                + paths(start,end+1, m, n,dummy);
        return dummy[start][end];
    }
}

// Approach 2 with combinations
class Solution {
    public int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int r = m - 1;
        double ans = 1;
        for(int i = 1; i <= r; i++){
            ans = ans * (N - r + i)/i;
        }
        return (int)ans;
    }
}