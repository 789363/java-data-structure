class DFS {
    static int V = 4; // Number of vertices in graph

    // A recursive function used by DFS
    void DFSUtil(int v, boolean visited[], int[][] graph) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int i = 0; i < V; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                DFSUtil(i, visited, graph);
            }
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int[][] graph, int v) {
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited, graph);
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