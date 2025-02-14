package twopointer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15961_G4_회전초밥_twopointer_김동근 {
	static int N, d, k , c, ans;
	static int[] sushi;
	static int[] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken()) - 1;
		sushi = new int[N];
		visit = new int[d];
		
		for (int i = 0; i < N; i++) {
			sushi[i] = Integer.parseInt(br.readLine()) - 1;
		}
		
		int s = 0, e = 0, cnt = 0;
		visit[sushi[s]]++;
		cnt++;
		while (s < N) {
			if (e-s >= k-1) {
				if (visit[sushi[s]] == 1) cnt--;
				visit[sushi[s]]--;
				s++;
			} else {
				e++;
				if (e >= N) {
					if (visit[sushi[e%N]] == 0) cnt++;
					visit[sushi[e%N]]++;
				} else {
					if (visit[sushi[e]] == 0) cnt++;
					visit[sushi[e]]++;
				}
			}
			if (visit[c] == 0) ans = Math.max(ans, cnt + 1);
			else ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}

}

