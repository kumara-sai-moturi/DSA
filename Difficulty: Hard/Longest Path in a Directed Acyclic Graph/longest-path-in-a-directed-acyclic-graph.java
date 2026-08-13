class Solution {

    public int[] maxDistance(int V, int src,
                             ArrayList<ArrayList<Integer>> edges) {

        // 1. Create adjacency list
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // edges = [u, v, w]
        for (ArrayList<Integer> edge : edges) {

            int u = edge.get(0);
            int v = edge.get(1);
            int w = edge.get(2);

            adj.get(u).add(new int[]{v, w});
        }

        // 2. Find indegree of every vertex
        int[] indegree = new int[V];

        for (ArrayList<Integer> edge : edges) {
            int v = edge.get(1);
            indegree[v]++;
        }

        // 3. Topological Sort
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();

        while (!q.isEmpty()) {

            int u = q.poll();
            topo.add(u);

            for (int[] edge : adj.get(u)) {

                int v = edge[0];

                indegree[v]--;

                if (indegree[v] == 0) {
                    q.add(v);
                }
            }
        }

        // 4. Initialize distances
        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MIN_VALUE);

        dist[src] = 0;

        // 5. Find longest distance
        for (int u : topo) {

            // If u is unreachable from src
            if (dist[u] == Integer.MIN_VALUE) {
                continue;
            }

            for (int[] edge : adj.get(u)) {

                int v = edge[0];
                int weight = edge[1];

                dist[v] = Math.max(
                    dist[v],
                    dist[u] + weight
                );
            }
        }

        return dist;
    }
}