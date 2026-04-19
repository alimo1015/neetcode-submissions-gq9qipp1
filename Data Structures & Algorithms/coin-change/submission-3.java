class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for(int coin : coins){
            if(coin < dp.length){
                 dp[coin] = 1;
            }
           
        }

        for(int i = 1; i < dp.length; i++){
            if(dp[i] == 1){
                continue;
            }
            for(int coin : coins){
                if(coin > i){
                    continue;
                }
                if(dp[i- coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i- coin] + 1 , dp[i]);
                }
            }
        }
        return dp[dp.length-1] == Integer.MAX_VALUE ? -1 : dp[dp.length-1];
    }
}
