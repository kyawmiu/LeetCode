class Solution {
    public int totalMoney(int n) {
        if(n<=7){
            return (n*(n+1))/2;
        }
        int a = n/7;
        int ans = 0;
        ans = ans+(28*a)+(7*(a*(a-1))/2);
        for(int i=1; i<=n%7; i++){
            a++;
            ans = ans + a;
            
        }
        return ans;
    }
}