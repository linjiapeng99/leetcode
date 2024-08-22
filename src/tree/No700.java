package tree;

public class No700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(val<root.val){
           return searchBST(root.left,val);
        } else if (val>root.val) {
           return searchBST(root.right,val);
        }else {
            return root;
        }
    }
}
