function stoneGameII(piles: number[]): number {
    const n = piles.length;
    const dp: number[][] = Array.from({ length: n + 1 }, () => Array(n + 1).fill(0));
    const prefixSum: number[] = new Array(n + 1).fill(0);

    for (let i = 0; i < n; i++) {
        prefixSum[i + 1] = prefixSum[i] + piles[i];
    }

    const dfs = (i: number, M: number): number => {
        if (i >= n) return 0;

        if (dp[i][M] !== 0) return dp[i][M];

        let maxStones = 0;
        let total = 0;

        for (let x = 1; x <= 2 * M && i + x - 1 < n; x++) {
            total += piles[i + x - 1];
            maxStones = Math.max(maxStones, total + prefixSum[n] - prefixSum[i + x] - dfs(i + x, Math.max(M, x)));
        }

        dp[i][M] = maxStones;
        return maxStones;
    };

    return dfs(0, 1);
}