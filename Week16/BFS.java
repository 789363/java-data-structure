import java.util.*;

public class BFS {
    public static void main(String[] args) {
        // 建立圖形
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 2));
        graph.put(2, Arrays.asList(0, 1, 3));
        graph.put(3, Arrays.asList(2));

        // 呼叫 bfs 演算法
        bfs(0, graph);
    }

    public static void bfs(int start, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            System.out.print(vertex + " ");

            for (int neighbor : graph.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}