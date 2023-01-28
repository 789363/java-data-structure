import java.util.*;

public class Dijkstra {
    static final int totalVertex = 9;

    int minimumDistance(int[] distance, boolean[] spSet) {
        int m = Integer.MAX_VALUE, m_index = -1;

        for (int vx = 0; vx < totalVertex; vx++) {
            if (!spSet[vx] && distance[vx] <= m) {
                m = distance[vx];
                m_index = vx;
            }
        }
        return m_index;
    }

    void printSolution(int[] distance) {
        System.out.println("以下從原點到其他點的最短距離：");
        for (int j = 0; j < totalVertex; j++)
            System.out.println("到" + j + "點的最短距離是" + distance[j]);
    }

    void dijkstra(int[][] graph, int s) {
        int[] distance = new int[totalVertex];
        boolean[] spSet = new boolean[totalVertex];

        for (int j = 0; j < totalVertex; j++) {
            distance[j] = Integer.MAX_VALUE;
            spSet[j] = false;
        }

        distance[s] = 0;

        for (int cnt = 0; cnt < totalVertex - 1; cnt++) {
            int ux = minimumDistance(distance, spSet);

            spSet[ux] = true;

            for (int vx = 0; vx < totalVertex; vx++) {
                if (!spSet[vx] && graph[ux][vx] != -1 && distance[ux] != Integer.MAX_VALUE
                        && distance[ux] + graph[ux][vx] < distance[vx]) {
                    distance[vx] = distance[ux] + graph[ux][vx];
                }
            }
        }

        printSolution(distance);
    }

    public static void main(String args[]) {
        DFSExample d = new DFSExample();

        int[][] graph = { { 0, 1, 1, 0 },
                { 1, 0, 0, 1 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 0 } };

        d.DFS(graph, 2);
    }
}