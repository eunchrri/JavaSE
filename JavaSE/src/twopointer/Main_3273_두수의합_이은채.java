package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_3273_두수의합_이은채 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new StringReader(input));
		
		// 첫번째 줄 데이터 입력받기
		int n = Integer.parseInt(br.readLine());
		int data[] = new int[n];
		
		// 두번째 줄 데이터 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		int x = Integer.parseInt(br.readLine());
		
//		System.out.println(Arrays.toString(data));
		
//		1. 시작점은 첫번재 인덱스, 끝점은 마지막 인덱스 가리키도록, x를 만족하는 쌍의 개수는 cnt
		int start = 0, end = n-1; 
		int cnt = 0;
		
		// 배열을 정렬
		Arrays.sort(data);
		
		// 투포인트 알고리즘 적용
		while (start < end) {
			int sum = data[start] + data[end];
			// x 를 만족하는 경우
			if (sum == x) {
				cnt++;
				start++;
				end--;
			} else if (sum < x) {
				start++;
			} else {
				end--;
			}
		}
		
		// 만족하는 쌍의 개수 출력하기
		System.out.println(cnt);
		
	}
	static String input ="9\n"
			+ "5 12 7 10 9 1 2 3 11\n"
			+ "13"; 

}
