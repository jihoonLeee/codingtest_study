package algorithm.liam_Algorithm.programmers;
//크리마랩 코딩테스트
public class creama05 {
    
}


import java.util.*;

class Edge implements Comparable<Edge> {
    int from, to, weight;

    public Edge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class Solution {

    static int[] parent;

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{1,2},{1,3},{3,4},{3,5}};
        int[] visitNode = {2,4};

        int result = getMinimumPath(n, edges, visitNode);
        System.out.println(result);
    }

    public static int getMinimumPath(int n, int[][] edges, int[] visitNode) {
        int answer = 0;

        // 부모 노드 배열 초기화
        parent = new int[n+1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        // 간선 리스트 생성
        List<Edge> edgeList = new ArrayList<>();
        for (int[] edge : edges) {
            edgeList.add(new Edge(edge[0], edge[1], 1));
        }

        // 방문해야 하는 노드들과의 간선 추가
        for (int node : visitNode) {
            for (int i = 1; i <= n; i++) {
                if (i != node) {
                    edgeList.add(new Edge(node, i, 2));
                }
            }
        }

        // 간선 가중치를 기준으로 오름차순 정렬
        Collections.sort(edgeList);

        // Kruskal 알고리즘으로 최소 스패닝 트리 구하기
        for (Edge edge : edgeList) {
            int fromParent = find(edge.from);
            int toParent = find(edge.to);
            if (fromParent != toParent) {
                union(fromParent, toParent);
                answer += edge.weight;
            }
        }

        return answer;
    }

    // 유니온 파인드 연산을 위한 find 메소드
    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    // 유니온 파인드 연산을 위한 union 메소드
    public static void union(int x, int y) {
        int xParent = find(x);
        int yParent = find(y);
        parent[yParent] = xParent;
    }
}