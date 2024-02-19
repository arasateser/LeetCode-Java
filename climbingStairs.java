class Solution {
    public int climbStairs(int n) { //it's a fibonacci problem. use dynamic programming to understand the problem. Drawing the possible outcomes help me to understand
        int prev = 1;
        int prevPrev = 1;
        int cur = 0;

        if(n==1)
            return 1;

        for (int i = 0; i < n - 1; i++) {
            cur = prev + prevPrev;
            prevPrev = prev;
            prev = cur;
        }

        return cur;

    }
}
