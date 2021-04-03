import java.util.*;
import java.util.LinkedList;

public class NodeSum {

     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public int dfs(TreeNode root){

         if(root==null){
             return 0;
         }

         System.out.println(root.val);
         int sum = root.val;
         sum += dfs(root.left) + dfs(root.right);
         return sum;
    }

    public int bfs(TreeNode root){

        Queue<TreeNode> que = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        que.offer(root);
        int sum=0;
        while((temp=que.poll()) != null){
            sum+=temp.val;
            System.out.println(temp.val);

            if(temp.left!=null){
                que.offer(temp.left);
            }
            if(temp.right!=null){
                que.offer(temp.right);
            }
        }
        return sum;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> dq = new ArrayDeque<>();
        int depth = 0, next = 0;
        TreeNode cur;
        dq.offer(root);

        while (!dq.isEmpty()) {
            depth++;
            next = dq.size();
            for (int i = 0; i < next; ++i) {
                cur = dq.poll();
                if (cur.left != null) dq.offer(cur.left);
                if (cur.right != null) dq.offer(cur.right);
            }
        }
        return depth;
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        NodeSum obj = new NodeSum();
        //System.out.println("Sum of Nodes of Tree "+obj.bfs(root));
        //System.out.println("Sum of Nodes of Tree "+obj.dfs(root));
        System.out.println("Depth of Tree "+obj.maxDepth(root));
    }
}

