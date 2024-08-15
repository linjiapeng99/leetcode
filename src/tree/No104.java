package tree;

import java.util.LinkedList;
import java.util.Queue;

public class No104 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(
                new TreeNode(new TreeNode(4),2,new TreeNode(5)),
                1,
                new TreeNode(new TreeNode(6),3,new TreeNode(7)));
        new No104().maxDepth3(root);
    }
    public int maxDepth1(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int d1=maxDepth1(root.left);
        int d2=maxDepth1(root.right);

        return Integer.max(d1,d2)+1;
    }
    public int maxDepth2(TreeNode root) {
        TreeNode curr=root;
        TreeNode pop=null;
        int max=0;
        LinkedList<TreeNode>stack=new LinkedList<>();
        while (curr!=null||!stack.isEmpty()){
            if(curr!=null){
                stack.push(curr);
                if(stack.size()>max){
                    max=stack.size();
                }
                curr=curr.left;
            }else {
                TreeNode peek = stack.peek();
                if(peek.right==pop){
                    pop=stack.pop();
                }else if(peek.right==null){
                    pop=stack.pop();
                }else {
                    curr=peek.right;
                }
            }
        }
        return max;
    }
    public int maxDepth3(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        int depth=0;
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                //System.out.print(poll.val+"\t");
                if(poll.left!=null){
                    queue.offer(poll.left);
                }
                if(poll.right!=null){
                    queue.offer(poll.right);
                }
            }
            depth++;
            //System.out.println();
        }
        return depth;
    }
}
