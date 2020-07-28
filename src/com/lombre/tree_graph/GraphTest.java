package com.lombre.tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
	Node Ŭ���� (���� ����Ʈ)
*/
class GraphNode {
	int data;
	LinkedList<GraphNode> adjacent;  // ������ ������ ����
	boolean marked; // �湮�ߴ� �� ����

	public GraphNode(int data) {
		this.data = data;
		this.marked = false;
		adjacent = new LinkedList<GraphNode>();
	}
}

/*
	�׷��� Ŭ���� (������� ���� �� Ž�� �޼��尡 ���� ��.)
*/
class Graph {

	GraphNode[] nodes; // ������ ������ �迭

	public Graph(int size) {

		nodes = new GraphNode[size];
		for(int i = 0; i < size; i++) { // ���Ǹ� ���� �����Ϳ� index�� �����ϰ� ����
			nodes[i] = new GraphNode(i);
		}
	}

	// �� ����� ���踦 �����ϴ� �Լ�
	void addEdge(int i1, int i2) {
		GraphNode n1 = nodes[i1];
		GraphNode n2 = nodes[i2];

		if(!n1.adjacent.contains(n2))
			n1.adjacent.add(n2);

		if(!n2.adjacent.contains(n1))
			n2.adjacent.add(n1);
	}



  // =================== dfs (���ڰ� ���� �� 0�� ������ ����)
	void dfs() {
		dfs(0);
	}
	// =================== dfs
	void dfs(int index) {
		GraphNode root = nodes[index];
		Stack<GraphNode> stack = new Stack<GraphNode>();

		stack.push(root); // ���� ��� ���ÿ� �߰�
		root.marked = true; // ���ÿ� ���ٰ� ǥ��

		// ���ÿ� �����Ͱ� ���� �� ���� �ݺ�
		while(!stack.isEmpty()) {
			GraphNode r = stack.pop(); // ���ÿ��� ������ ��������

			for(GraphNode n : r.adjacent) { // �ڽ� ��带 ���ÿ� ��´�.
				if(n.marked == false) { // ������ �߰����� �ʾҴ� ��常..
					n.marked = true;
					stack.push(n);
				}
			}
			visit(r); // ���� ��� ���
		}
	}


	// =================== ��� dfs (���ڰ� ���� �� 0�� ������ ����)
	void dfsR() {
		dfsR(0);
	}
	// =================== ��� dfs (�ε����� ���� dfs ����)
	void dfsR(int index) {
		GraphNode r = nodes[index];
		dfsR(r);
	}
	// =================== ��� dfs
	void dfsR(GraphNode r) {
		if (r == null) return; // ó���� ��尡 ������ ���� (����)

		// 1. �ڱ��� ��� (���ÿ� ���ٴ� ǥ��)
		r.marked = true;
		visit(r);

		// 2. �ڽĳ�� ���ȣ��
		for(GraphNode n : r.adjacent) {
			if(n.marked == false) {
				dfsR(n);
			}
		}
	}


	// =================== bfs (���ڰ� ���� �� 0�� ������ ����)
	void bfs() {
		bfs(0);
	}
	// =================== bfs
	void bfs(int index) {
		GraphNode root = nodes[index];
		Queue<GraphNode> queue = new LinkedList<GraphNode>();

		queue.add(root); // ���� ��� ť�� �߰�
		root.marked = true; // ť�� ���ٰ� ǥ��

		while(!queue.isEmpty()) { // ť�� �����Ͱ� ���� �� ���� �ݺ�
			GraphNode r = queue.remove();

			for(GraphNode n : r.adjacent) { // �ڽ� ��带 ť�� ��´�.
				if(n.marked == false) { // ������ �߰����� �ʾҴ� ��常..
					n.marked = true;
					queue.add(n);
				}
			}
			visit(r); // ���� ��� ���
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

		//g.dfs(); // dfs ����(0)  [0 1 3 5 7 6 8 4 2]
		//g.dfsR();  // dfs ��� ����(0) [0 1 2 4 3 5 6 8 7]
		//g.bfs(); // bfs ����(0) [0 1 2 3 4 5 6 7 8]

		//g.dfs(3); // dfs ����(3)  [3 5 7 6 8 4 2 1 0]
		//g.dfsR(3);  // dfs ��� ����(3) [3 1 0 2 4 5 6 8 7]
		//g.bfs(3); // bfs ����(3) [3 1 2 4 5 0 6 7 8]


	}

}