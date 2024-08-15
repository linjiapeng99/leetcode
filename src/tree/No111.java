package tree;

import java.util.LinkedList;
import java.util.Queue;

public class No111 {
    public int minDepth1(TreeNode root) {
        if(root==null){
            return 0;
        }
        int d1=minDepth1(root.left);
        int d2=minDepth1(root.right);
        if(d2==0){
            return d1+1;
        }
        if(d1==0){
            return d2+1;
        }
        return Integer.min(d1,d2)+1;
    }
    public int minDepth2(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=0;
        while (!queue.isEmpty()){
            int size=queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if(poll.left==null&&poll.right==null){
                    return depth;
                }
                //System.out.print(poll.val+"\t");
                if(poll.left!=null){
                    queue.offer(poll.left);
                }
                if(poll.right!=null){
                    queue.offer(poll.right);
                }
            }

            //System.out.println();
        }
        return depth;
    }
}
