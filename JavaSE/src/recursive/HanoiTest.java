package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HanoiTest {
	static StringBuilder sb = new StringBuilder(100);
	public static void hanoi(int b, int from, int temp, int to ) {
		// 판을 다 옮긴 경우 종료
		if (b == 0) return;
		// 현재 기둥에서 맨 아래 판(b)을 제외한 나머지 판(b-1)을 임시기둥(temp)으로 옮기기
		hanoi(b-1, from, to, temp);
		// 맨 아래 판(b)을 목적 기둥(to)으로 옮기기
		sb.append(b+" : "+from+" -> "+to+"\n");
		// 임시기둥(temp)에 옮겨진 나머지 판(b-1)을 목적기둥(to)으로 옮기기
		hanoi(b-1, temp, from, to);
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		hanoi(count, 1, 2, 3);
		System.out.println(sb);
	}
}
