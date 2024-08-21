package tree;

import java.util.Arrays;

//根据前中序结果建树
public class No105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        TreeNode root=new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i]==preorder[0]){//在中序中找打根节点
                int[] inLeft = Arrays.copyOfRange(inorder, 0, i);
                int[] inRight = Arrays.copyOfRange(inorder, i+1, inorder.length);
                int[] preLeft = Arrays.copyOfRange(preorder, 1, i + 1);
                int[] preRight = Arrays.copyOfRange(preorder, i+1, preorder.length);

                TreeNode left = buildTree(preLeft, inLeft);
                TreeNode right = buildTree(preRight, inRight);
                root.left=left;
                root.right=right;
                break;
            }
        }
        return root;
    }
    /*
    * 前序：[3,9,20,15,7]    中序：[9,3,15,20,7]
    * root:3  left=[9]  right=[15,20,7]
    * root:9  left=null  right=null
    * root:20 left=[15]  right=[7]
    *
    *
    * */
}
