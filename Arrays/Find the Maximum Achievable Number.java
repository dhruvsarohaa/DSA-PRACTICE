class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int a=2;
        while(a-->0)
        {
            num+=t;
        }
        return num;
    }
}
