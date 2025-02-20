package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_boj_1781_컵라면_이은채 {
	/*
	 * 1. 과제를 담을 PQ 선언한다.
	 * 2. 데이터 입력받기
	 * 3. 모든 과제들을 탐색 시도
	 * 	3.1 과제를 꺼내와 점수 PQ의 size와 과제 데드라인을 비교한다.
	 * 	3.2 데드라인보다 PQ size가 작다면 과제는 수행할 수 있는 과제 이므로 바로 점수 PQ에 넣는다.
	 * 	3.3 데드라인이 같거나 크면 점수 PQ의 가장 낮은 점수와 비교해서
	 * 		현재 과제의 점수가 높다면 기존 낮은 점수를 제거하고 현재 과제의 점수를 넣는다.
	 * 4. 점수 합계를 내고 출력한다.
	 * */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		

	}

}
