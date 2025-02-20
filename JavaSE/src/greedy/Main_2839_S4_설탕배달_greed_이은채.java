package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2839_S4_설탕배달_greed_이은채 {
	/*
	 * 접근방식
	 * 1. 5kg 봉지를 최대한 사용
	 * 2. 그 다음 3kg 봉지 사용
	 * 3. 이 과정을 반복하다가 N < 0 이 되면
	 * 	  정확히 나눌 수 없는 경우이므로 -1 출력
	 * 
	 * */
	public static final int M = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		배달해야하는 설탕 봉지: N kg
		int N = Integer.parseInt(br.readLine());
		br.close();
		int bag = 0;
		while (N>=0) {
			if (N % 5 == 0) {
				bag += N/5;
				System.out.println(bag);
				return;
			}
			N -= 3;
			bag++;
		}
		System.out.println(-1); 
	} // end of main
} // end of class