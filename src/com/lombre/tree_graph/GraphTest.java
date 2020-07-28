package com.lombre.tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
	Node 클래스 (인접 리스트)
*/
class GraphNode {
	int data;
	LinkedList<GraphNode> adjacent;  // 인접한 노드와의 관계
	boolean marked; // 방문했는 지 여부

	public GraphNode(int data) {
		this.data = data;
		this.marked = false;
		adjacent = new LinkedList<GraphNode>();
	}
}

/*
	그래프 클래스 (인접노드 설정 및 탐색 메서드가 포함 됨.)
*/
class Graph {

	GraphNode[] nodes; // 노드들을 저장할 배열

	public Graph(int size) {

		nodes = new GraphNode[size];
		for(int i = 0; i < size; i++) { // 편의를 위해 데이터와 index를 통일하게 지정
			nodes[i] = new GraphNode(i);
		}
	}

	// 두 노드의 관계를 지정하는 함수
	void addEdge(int i1, int i2) {
		GraphNode n1 = nodes[i1];
		GraphNode n2 = nodes[i2];

		if(!n1.adjacent.contains(n2))
			n1.adjacent.add(n2);

		if(!n2.adjacent.contains(n1))
			n2.adjacent.add(n1);
	}



  // =================== dfs (인자가 없을 시 0번 노드부터 시작)
	void dfs() {
		dfs(0);
	}
	// =================== dfs
	void dfs(int index) {
		GraphNode root = nodes[index];
		Stack<GraphNode> stack = new Stack<GraphNode>();

		stack.push(root); // 현재 노드 스택에 추가
		root.marked = true; // 스택에 들어갔다고 표시

		// 스택에 데이터가 없을 때 까지 반복
		while(!stack.isEmpty()) {
			GraphNode r = stack.pop(); // 스택에서 데이터 가져오기

			for(GraphNode n : r.adjacent) { // 자식 노드를 스택에 담는다.
				if(n.marked == false) { // 기존에 추가되지 않았던 노드만..
					n.marked = true;
					stack.push(n);
				}
			}
			visit(r); // 현재 노드 출력
		}
	}


	// =================== 재귀 dfs (인자가 없을 시 0번 노드부터 시작)
	void dfsR() {
		dfsR(0);
	}
	// =================== 재귀 dfs (인덱스를 통해 dfs 실행)
	void dfsR(int index) {
		GraphNode r = nodes[index];
		dfsR(r);
	}
	// =================== 재귀 dfs
	void dfsR(GraphNode r) {
		if (r == null) return; // 처리할 노드가 없으면 종료 (기저)

		// 1. 자기노드 출력 (스택에 들어갔다는 표시)
		r.marked = true;
		visit(r);

		// 2. 자식노드 재귀호출
		for(GraphNode n : r.adjacent) {
			if(n.marked == false) {
				dfsR(n);
			}
		}
	}


	// =================== bfs (인자가 없을 시 0번 노드부터 시작)
	void bfs() {
		bfs(0);
	}
	// =================== bfs
	void bfs(int index) {
		GraphNode root = nodes[index];
		Queue<GraphNode> queue = new LinkedList<GraphNode>();

		queue.add(root); // 현재 노드 큐에 추가
		root.marked = true; // 큐에 들어갔다고 표시

		while(!queue.isEmpty()) { // 큐에 데이터가 없을 때 까지 반복
			GraphNode r = queue.remove();

			for(GraphNode n : r.adjacent) { // 자식 노드를 큐에 담는다.
				if(n.marked == false) { // 기존에 추가되지 않았던 노드만..
					n.marked = true;
					queue.add(n);
				}
			}
			visit(r); // 현재 노드 출력
		}
	}


	void visit(GraphNode n) {
		System.out.print(n.data + " ");
	}
}



/**
 * 		0
 * 	  /
 * 	 1 -- 3  	7
 *	 |  / | \  /
 *	 | /  |  5
 *   2 -- 4   \
 *             6 - 8
 */
public class GraphTest {
	public static void main(String[] args) {
		Graph g = new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);

		//g.dfs(); // dfs 실행(0)  [0 1 3 5 7 6 8 4 2]
		//g.dfsR();  // dfs 재귀 실행(0) [0 1 2 4 3 5 6 8 7]
		//g.bfs(); // bfs 실행(0) [0 1 2 3 4 5 6 7 8]

		//g.dfs(3); // dfs 실행(3)  [3 5 7 6 8 4 2 1 0]
		//g.dfsR(3);  // dfs 재귀 실행(3) [3 1 0 2 4 5 6 8 7]
		//g.bfs(3); // bfs 실행(3) [3 1 2 4 5 0 6 7 8]


	}

}