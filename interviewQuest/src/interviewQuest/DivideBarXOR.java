package interviewQuest;
/*
 * Divide an array into subarrays so that sum of product of their length and XOR is minimum
 * 
 * We have an array of "n" numbers. We need to divide it in M subarray such that the cost is minimum.

		Cost = (XOR of subarray) X ( length of subarray )

		Eg:
		
		array = [11,11,11,24,26,100] 
		
		M = 3
		OUTPUT => 119

			Explanation:
			------------
			
		    Dividing into subarrays as = > [11] , [11,11,24,26] , [100]
			
			As 11*1 + (11^11^24^26)*4 + 100*1 => 119 is minimum value.
			
			Eg2: array = [12,12]
			     M = 1
			
			output: 0
			
			As [12,12] one way and (12^12)*2 = 0. 
 */

public class DivideBarXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//--------------solution---------------------
/*
#include <bits/stdc++.h>

using namespace std;

const int MAXN = 1000 + 10;
const int MAXM = 1000 + 10;
const long long INF = 1e18 + 10;

int n, m, a[MAXN];
long long dp[MAXN][MAXM];

int main() {
    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        cin >> a[i];
    }
    // start of initialization
    for (int i = 0; i <= n; i++)
        for (int j = 0; j <= n; j++)
            dp[i][j] = INF;
    dp[0][0] = 0;
    // end of initialization
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            int last_subarray_xor = 0, last_subarray_length = 0;
            for (int k = i; k >= 1; k--) {
                last_subarray_xor ^= a[k];
                last_subarray_length = i - k + 1;
                dp[i][j] = min(dp[i][j], dp[k - 1][j - 1] + (long long)last_subarray_xor * (long long)last_subarray_length);
            }
        }
    }
    cout << dp[n][m] << endl;
    return 0;
}
*/
