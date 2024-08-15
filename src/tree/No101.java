package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class No101 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(
                new TreeNode(new TreeNode(2),2,null),
                1,
                new TreeNode(new TreeNode(2),2,null));
        boolean symmetric = isSymmetric(root);
        System.out.println(symmetric);
    }
    public static boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }

    private static boolean check(TreeNode left, TreeNode right) {
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        if(left.val!= right.val){
            return false;
        }
        return check(left.left,right.right)&&check(left.right,right.left);
    }
}
