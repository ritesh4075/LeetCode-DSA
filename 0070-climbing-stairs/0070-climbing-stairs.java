class Solution {
    int[] dp ;
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,n);
    }
    private int solve(int i,int n) {
        if(i == n) return 1;
        if(i > n) return 0;
        if(dp[i] != -1) return dp[i];
        int oneStep = solve(i+1,n);
        int twoStep = solve(i+2,n);
        return dp[i] = oneStep + twoStep;
    }
}