import java.util.Arrays;

public class Contest25Dec {
}


class Solution11 {
    public int removePalindromeSub(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] A = s.toCharArray();
        if (isPalin(A)) {
            return 1;
        }
        return 2;
    }

    private static boolean isPalin(char[] A) {
        for (int i = 0, j = A.length - 1; i < j; ++i, --j) {
            if (A[i] != A[j]) {
                return false;
            }
        }
        return true;
    }
}

class Solution2 {
    public int removePalindromeSub(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] A = s.toCharArray();
        if (isPalin(A)) {
            return 1;
        }
        return 2;
    }

    private static boolean isPalin(char[] A) {
        for (int i = 0, j = A.length - 1; i < j; ++i, --j) {
            if (A[i] != A[j]) {
                return false;
            }
        }
        return true;
    }
}


class Solution3 {
    private static final int INF = 123456789;

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] D = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(D[i], INF);
        }
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];
            D[u][v] = w;
            D[v][u] = w;
        }
        for (int i = 0; i < n; ++i) {
            D[i][i] = 0;
        }
        for (int k = 0; k < n; ++k) {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (D[i][j] > D[i][k] + D[k][j]) {
                        D[i][j] = D[i][k] + D[k][j];
                    }
                }
            }
        }
        int best = INF;
        int bestCity = -1;
        for (int i = n - 1; i >= 0; --i) {
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (D[i][j] <= distanceThreshold) {
                    ++count;
                }
            }
            if (count < best) {
                best = count;
                bestCity = i;
            }
        }
        return bestCity;
    }
}


class Solution4 {
    final int INF = 123456789;

    public int minDifficulty(int[] jobDifficulty, int d) {
        final int n = jobDifficulty.length;
        if (n < d) {
            return -1;
        }

        int[][] diff = new int[n + 1][n + 1];
        for (int i = 0; i < n; ++i) {
            diff[i][i] = 0;
            for (int j = i; j < n; ++j) {
                diff[i][j + 1] = Math.max(diff[i][j], jobDifficulty[j]);
            }
        }
        // for (int[] x : diff) {
        //     System.out.println(Arrays.toString(x));
        // }

        int[][] dp = new int[d + 1][n + 1];
        for (int i = 0; i <= d; ++i) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][0] = 0;
        for (int i = 0; i < d; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = j + 1; k <= n; ++k) {
                    dp[i + 1][k] = Math.min(dp[i + 1][k], dp[i][j] + diff[j][k]);
                }
            }
        }
        return dp[d][n];
    }
}
