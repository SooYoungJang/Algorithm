package AlgorithmNumber.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number2178 {
    static int n, m;
    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        // 4 6
        //101111
        //101010
        //101011
        //111011
        //주변을 찾아가면서 길을 찾아야 하기에 BFS 로 푼다. BFS 는 Queue를 사용한다.
        //최단거리 문제는 BFS를 사용하여 푼다.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 1; j <= m; j++) {
                graph[i][j] = Integer.parseInt(line[j-1]);
            }
        }



        System.out.println();
    }
    public static void bfs(int node, boolean[] visited, StringBuilder sb) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(node);

        while(!queue.isEmpty()) {
            node = queue.poll();

            if(visited[node]) continue;

            visited[node] = true;
//
//            for(int nextNode:nodeList[node]) {
//                queue.add(nextNode);
//            }
        }
    }
}
