package algorithm.inflearn.dfs;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/06/02
 */
public class tree말단노드까지가장짧은경로 {
    static Node root;

    public static int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(DFS(0, root));
    }
}

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
