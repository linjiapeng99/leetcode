package tree;

import java.util.LinkedList;

//反转二叉树
public class No226 {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        TreeNode curr=root;
        if(curr!=null){
            temp=curr.left;
            curr.left=curr.right;
            curr.right=temp;
            invertTree(curr.left);
            invertTree(curr.right);
        }
        return root;
    }
}
//LinkedList<TreeNode>stack=new LinkedList<>();
//TreeNode pop=new TreeNode();
/*while (curr!=null|| !stack.isEmpty()){
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }else {
                TreeNode peek=stack.peek();
                if(peek.right==null){
                    pop=stack.pop();
                } else if (peek.right==pop) {
                    pop=stack.pop();
                }else {
                    curr=peek.right;
                }
            }
        }*/
