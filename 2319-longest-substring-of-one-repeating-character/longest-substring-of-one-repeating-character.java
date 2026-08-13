class Solution {

    class Node {
        char leftChar;
        char rightChar;

        int prefix;
        int suffix;
        int best;
        int len;

        Node(char c) {
            leftChar = c;
            rightChar = c;
            prefix = 1;
            suffix = 1;
            best = 1;
            len = 1;
        }
    }

    Node[] tree;

    public int[] longestRepeating(
            String s,
            String queryCharacters,
            int[] queryIndices) {

        int n = s.length();

        tree = new Node[4 * n];

        build(s, 1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {

            int index = queryIndices[i];
            char c = queryCharacters.charAt(i);

            update(1, 0, n - 1, index, c);

            ans[i] = tree[1].best;
        }

        return ans;
    }

    void build(String s, int node, int l, int r) {

        if (l == r) {
            tree[node] = new Node(s.charAt(l));
            return;
        }

        int mid = l + (r - l) / 2;

        build(s, node * 2, l, mid);
        build(s, node * 2 + 1, mid + 1, r);

        tree[node] = merge(tree[node * 2],
                           tree[node * 2 + 1]);
    }

    void update(int node, int l, int r,
                int index, char c) {

        if (l == r) {
            tree[node] = new Node(c);
            return;
        }

        int mid = l + (r - l) / 2;

        if (index <= mid) {
            update(node * 2, l, mid, index, c);
        } else {
            update(node * 2 + 1, mid + 1, r, index, c);
        }

        tree[node] = merge(tree[node * 2],
                           tree[node * 2 + 1]);
    }

    Node merge(Node a, Node b) {

        Node res = new Node(a.leftChar);

        res.leftChar = a.leftChar;
        res.rightChar = b.rightChar;
        res.len = a.len + b.len;

        // Prefix
        res.prefix = a.prefix;

        if (a.prefix == a.len &&
            a.rightChar == b.leftChar) {

            res.prefix = a.len + b.prefix;
        }

        // Suffix
        res.suffix = b.suffix;

        if (b.suffix == b.len &&
            a.rightChar == b.leftChar) {

            res.suffix = b.len + a.suffix;
        }

        // Best inside either side
        res.best = Math.max(a.best, b.best);

        // Best crossing the middle
        if (a.rightChar == b.leftChar) {

            res.best = Math.max(
                res.best,
                a.suffix + b.prefix
            );
        }

        return res;
    }
}