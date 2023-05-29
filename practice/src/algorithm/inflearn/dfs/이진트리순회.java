package algorithm.inflearn.dfs;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class 이진트리순회 {
    static Node root;

    public static void dfs(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.data + " "); // 전위 순회
            dfs(root.lt);
            System.out.println(root.data + " "); // 중위  순회
            dfs(root.rt);
            System.out.println(root.data + " "); // 후위 순회
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        dfs(root);
    }

    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }
}
