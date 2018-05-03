package egraph.bfs;

import java.util.*;

import egraph.dfs.DFS;
public class BFS {
	int N;  // 그래프 정점의 수
	List<Edge>[] graph;
	private boolean[ ] visited;	 // BFS 수행 중 방문한 정점의 원소를 true로 만든다.
	
	public BFS(List<Edge>[] adjList) { // 생성자
		N = adjList.length;
		graph = adjList;
		visited = new boolean [N];
		for (int i = 0; i < N; i++) visited[i] = false;   // 배열 초기화
		for (int i = 0; i < N; i++) if (!visited[i]) bfs(i);
	}
	
	//*****************************************************
	private void bfs(int i) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[i] = true;
		queue.add(i);
		while(!queue.isEmpty()){
			int j = queue.remove();
			System.out.print(j+" ");
			//연결된 정점을 찾기
			for(Edge e:graph[j]){
				if(!visited[e.adjvertex]){
					visited[e.adjvertex] = true;
					queue.add(e.adjvertex);
				}
			}
		}
		
		
		
	}
}

