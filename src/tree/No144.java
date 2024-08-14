package tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//二叉树前序遍历
public class No144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        TreeNode curr = root;
        LinkedList<TreeNode>stack=new LinkedList<>();
        TreeNode pop=null;
        while (curr != null||!stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                list.add(curr.val);
                curr = curr.left;
            } else {
                TreeNode peek=stack.peek();
                if(peek.right==null){//没有右子树
                    pop=stack.pop();
                } else if (pop==peek.right) {//右子节点处理完成
                    pop=stack.pop();
                }else {
                    curr=peek.right;
                }
            }

        }
        return list;
    }
}
