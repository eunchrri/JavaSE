package chapter02;

//import java.util.HashSet;
//import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main_boj_16562_친구비_이은채 {
	/*
	 * 준석이가 모든 학생을 친구로 만들 수 있다면, 친구로 만드는데 드는 최소비용을 출력
	 * 친구를 다 사귈 수 없다면 Oh no 출력
	 * 
	 * 서로소 집합을 사용해서 풀자.
	 * 
	 * */
	
	static int N, M, k;
	static int[] fcost;	// 친구비 배열
	static int[] parents;	// 부모 노드 배열 생성
	
	public static void make(int n) {
		parents = new int[n+1];
		for (int i = 1; i < N+1; i++) {
			parents[i] = i;
		}
	}
	
	public static int find(int a) {
		if (parents[a] ==  a) return a;
		return parents[a] = find(parents[a]);
	}
	
	public static void union(int a, int b) {
		int rootA = find(a);
		int rootB = find(b);
		
		if (rootA != rootB) {
			// 친구비가 더 작은 쪽을 부모로 설정
			if (fcost[rootA] < fcost[rootB]) {
				parents[rootB] = rootA;
			} else {
				parents[rootA] = rootB;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();		// 학생 수
		M = sc.nextInt();		// 친구 관계 수
		k = sc.nextInt();		// 가지고 있는 돈
		
		fcost = new int[N+1];
		for (int i = 1; i < N+1; i++) {
			fcost[i] = sc.nextInt();
		}
		
		make(N);
		
		for (int i = 0; i < M; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			union(v,w);
		}
		
		// 최소 비용 계산 처리
		int totalCost = 0;
//		Set<Integer> visited = new HashSet<>();
		boolean[] visited = new boolean[N+1];
		for (int i = 1; i < N+1; i++) {
			int root = find(i);
			if (!visited[root]) {
				totalCost += fcost[root];
				visited[root] = true;
//				visited.add(root);
			}
		}
		
		// 결과 출력
		if (totalCost <= k) {
			System.out.println(totalCost);
		} else {
			System.out.println("Oh no");
		}
	}

}
