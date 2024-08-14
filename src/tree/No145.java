package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//后续
public class No145{
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode>stack=new LinkedList<>();
        List<Integer>result=new ArrayList<>();
        TreeNode curr=root;
        TreeNode pop=null;
        while (curr!=null||!stack.isEmpty()){
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }else {
                TreeNode peek=stack.peek();
                if(peek.right==null){//没有右子树
                    pop=stack.pop();
                    result.add(pop.val);
                }else if(peek.right==pop){//处理完右子树
                    pop=stack.pop();
                    result.add(pop.val);
                }else {
                    curr=peek.right;
                }
            }
        }
        return result;
    }
}
