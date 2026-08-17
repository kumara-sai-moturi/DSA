import java.util.*;

class Solution {
    public int minThrows(int n, int[] lad, int[] sn) {

        int total = n * n;

        // jump[i] stores the destination of snake/ladder
        int[] jump = new int[total + 1];

        Arrays.fill(jump, -1);

        // Ladders
        for (int i = 0; i < lad.length; i += 2) {
            jump[lad[i]] = lad[i + 1];
        }

        // Snakes
        for (int i = 0; i < sn.length; i += 2) {
            jump[sn[i]] = sn[i + 1];
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[total + 1];

        q.offer(1);
        visited[1] = true;

        int throwsCount = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int curr = q.poll();

                // Reached destination
                if (curr == total) {
                    return throwsCount;
                }

                // Try dice values 1 to 6
                for (int dice = 1; dice <= 6; dice++) {

                    int next = curr + dice;

                    if (next > total) {
                        break;
                    }

                    // Snake or ladder
                    if (jump[next] != -1) {
                        next = jump[next];
                    }

                    if (!visited[next]) {
                        visited[next] = true;
                        q.offer(next);
                    }
                }
            }

            throwsCount++;
        }

        return -1;
    }
}