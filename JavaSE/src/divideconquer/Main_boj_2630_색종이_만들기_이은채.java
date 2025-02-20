package divideconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main_boj_2630_색종이_만들기_이은채 {
	/*
	 * 1. 전역 변수 선언
	 * 2. 변수 N 입력받기
	 * 3. divideAndCount(x, y, size) 함수 정의
	 * 4. checkColor(x, y, size) 함수 정의
	 * 
	 * */
	static int whiteCount = 0;		// 하얀색 색종이 개수
	static int blueCount = 0;		// 파란색 색종이 개수
	static int[][] paper;			// 종이 정보 저장할 2차원 배열
	
	public static void main(String[] args) throws IOException {
		
		// N, paper 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		paper = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());	// 각 줄마다 tokenizer 생성
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divideAndCount(0,0,N);
		System.out.println(whiteCount);
		System.out.println(blueCount);
		br.close();
	}
	
	static void divideAndCount(int x, int y, int size) {
		// checkColor 가 true => 모두 동일한 색일 때
		if (checkColor(x, y, size)) {
			if (paper[x][y] == 0) {
				whiteCount++;
			} else {
				blueCount++;
			}
			return;
		}
		// checkColor 함수가 false일 때 => 영역을 4분할 하여 재귀 호출
		divideAndCount(x, y, size/2);
		divideAndCount(x, y+size/2, size/2);
		divideAndCount(x+size/2, y, size/2);
		divideAndCount(x+size/2, y+size/2, size/2);
	}
	
	static boolean checkColor(int x, int y, int size) {
		int color = paper[x][y];
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (paper[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}

}
