package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Main_1141_jungol_불쾌한_날 {
	/*
	 * i번 소들이 볼 수 있는 머리 모양의 수를 C_i 이라고 할 때,
	 * C_1부터 C_N 까지의 합을 출력하는 프로그램을 작성하라.
	 * 
	 * - 입력:
	 * 	첫줄: 소의 수
	 * 	다음줄부터: 소의 크기
	 * 
	 * - 변수:
	 * 	cow[i] 소 번호 저장할 배열 정의
	 * 	total_c = 소들이 볼 수 있는 머리 모양의 수
	 * 
	 * 나를 볼 수 있는 소를 세기
	 * 나를 볼 수 없는 소는 pop()
	 * 1. 스택 정의하여 소들 크기를 스택에 저장한다.
	 * 2. 모든 소(i)에 대해:     for i<n
	 * 	while 문 이용
	 * 	- 스택에 있는 소들 중에서 현재 소보다 작은 소들을 모두 제거 (볼수있는 소 세기)
	 * 	- 현재 소를 스택에 추가한다.
	 * 3. 결과 출력하기
	 * 	
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 소의 수 입력받기
		int n = sc.nextInt();
		int[] cow = new int[n];
		
		for (int i = 0; i < n; i++) {
			cow[i] = sc.nextInt();
		}
		
		// 스택 활용
		Stack<Integer> stack = new Stack<>();
		long total_c = 0l; // stack의 사이즈를 total_c 에 저장
		
		for (int i = 0; i < n; i++) {
			
			while(stack.size()!=0 && (stack.peek()<=cow[i])) {
				stack.pop();
			}
			total_c += stack.size();
			stack.push(cow[i]);
		}
		System.out.println(total_c);
	}

}
