class Solution {
public:
    int maxSum(vector<int>& nums, int k) {
        vector<int>b(30,0);
        long long ans = 0, MOD= 1e9+7;

        for (int x : nums)
            for (int i = 0; i < 30; i++)
                if (x & (1 << i)) b[i]++;

        while(k-->0){
            long long x=0;
            for(int i=0;i<30;i++){
                if(b[i]>0) {
                    x|=(1L<<i);
                b[i]--;
                }
            }
            ans=(ans+x*x)%MOD;
        }

        return (int)ans;
    }
};