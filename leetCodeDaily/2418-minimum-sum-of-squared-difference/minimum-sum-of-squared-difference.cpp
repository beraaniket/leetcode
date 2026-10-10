class Solution {
public:
    long long minSumSquareDiff(vector<int>& n1, vector<int>& n2, int k1, int k2) {
        int n=n1.size();
        vector<long long>d(n);
        long long max_diff;
        for(int i=0;i<n;i++){
            long long diff=abs(n1[i]-n2[i]);
            d[i]=diff;
            max_diff=max(max_diff,d[i]);
        }
        long long k=(long long)k1+(long long)k2;
        vector<long long>count(max_diff+1);
        for(int it:d){
            count[it]++;
        }
        for(int i=max_diff;i>0 && k>0;i--){
            long long need=min(k,count[i]);
            count[i]-=need;
            count[i-1]+=need;
            k-=need;
        }
        long long res=0;
        for(int i=1;i<=max_diff;i++) res+=count[i]*(long long) i*i;
        return res;
    }
};