class Solution {
    public int climbStairs(int n) {
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
