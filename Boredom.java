import java.util.HashMap;
import java.util.Scanner;
//https://codeforces.com/problemset/problem/455/A
public class Boredom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        int[] dp = new int[100001];
        dp[0] = 0;
        dp[1] = map.get(1) == null ? 0 : map.get(1);
        for (int i = 2; i < 100001; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + i * (map.get(i) == null ? 0 : map.get(i)));
        }
        System.out.println(dp[10000]);
    }
}
