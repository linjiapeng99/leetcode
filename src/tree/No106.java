package tree;

import java.util.Arrays;

//根据中后序建树
public class No106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postorder.length-1]);
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i]==postorder[postorder.length-1]){
                int[] inLeft = Arrays.copyOfRange(inorder, 0, i);
                int[] inRight = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                int[] postLeft = Arrays.copyOfRange(postorder, 0, inLeft.length);
                int[] postRight = Arrays.copyOfRange(postorder, inLeft.length, postorder.length-1);
                TreeNode left = buildTree(inLeft, postLeft);
                TreeNode right = buildTree(inRight, postRight);
                root.left=left;
                root.right=right;
                break;
            }
        }
        return root;
    }
}
