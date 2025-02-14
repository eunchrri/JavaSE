package datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_2493_탑_이은채 {
	/*
	 * 입력:
	 * 	첫: 탑의 수 N
	 * 	둘: 빈칸을 기준으로 N개의 탑의 높이
	 * 
	 * 출:
	 * 	탑들의 순서대로 각 탑에서 발사한 레이저의 신호를 수신한 탑들의 번호를
	 *  빈칸을 기준으로 출력
	 *  
	 * hint:
	 * 	현재보다 낮은 탑들 모두 제거하고 
	 * 	현재 탑보다 높은 탑 만나면 신호를 수신하는 탑으로 설정.
	 * 
	 * 1. N 입력받기
	 * 2. N개의 탑 높이 입력받기
	 * 3. 스택 초기화 (탑 높이와 인덱스 저장)
	 * 4. 결과 배열 초기화 (각 탑의 수신 결과를 저장)
	 * 
	 * 5. 1번 탑부터 N번 탑까지 순서대로 처리:
	 * 	5.1. 현재 탑의 높이가 스택의 top에 있는 탑보다 크다면, 스택에서 작은 탑 제거
	 * 	5.2. 스택이 비어있지 않다면, 현재 탑의 레이저 신호를 수신하는 탑의 번호를 결과 배열에 저장.
	 * 	5.3. 스택에 현재 탑의 정보(높이, 인덱스)를 push 한다.
	 * 
	 * 6. 결과 배열 출력하기
	 * */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// 1. N 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 2. N개의 탑 높이 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] top_h = new int[N];
		for (int i = 0; i < N; i++) {
			top_h[i] = Integer.parseInt(st.nextToken());			
		}
		// 3. 스택 초기화 (탑 높이와 인덱스 저장)
		Stack<Integer> stack = new Stack<>();
		// 4. 결과 배열 초기화 (각 탑의 수신 결과를 저장)
		int[] result = new int[N];
		
		// 5. 1번 탑부터 N번 탑까지 순서대로 처리:
		for (int i = 0; i < N; i++) {
			// 	5.1. 현재 탑의 높이가 스택의 top에 있는 탑보다 크다면, 스택에서 작은 탑 제거
			
			// 	5.2. 스택이 비어있지 않다면, 현재 탑의 레이저 신호를 수신하는 탑의 번호를 결과 배열에 저장.
			
			// 	5.3. 스택에 현재 탑의 정보(높이, 인덱스)를 push 한다.
			
		}
		
		// 6. 결과 배열 출력하기
		
	}

}
