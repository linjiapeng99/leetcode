package tree;

import java.util.LinkedList;
import java.util.logging.Logger;

public class No98 {
    Long a = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean leftFlag = isValidBST(root.left);
        if (a >= root.val) {
            return false;
        }
        if (!leftFlag) {
            return false;
        }
        a = Long.valueOf(root.val);
        return isValidBST(root.right);
    }

    public boolean isValidBST1(TreeNode root) {
        TreeNode p = root;
        LinkedList<TreeNode> stack = new LinkedList<>();
        Long a = Long.MIN_VALUE;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode pop = stack.pop();
                if (a >= pop.val) {
                    return false;
                }
                a = Long.valueOf(pop.val);
                p = pop.right;
            }
        }
        return true;
    }

    public boolean isValidBST2(TreeNode root) {
        return doValidBST2(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private Boolean doValidBST2(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val < min || root.val > max) {
            return false;
        }
        Boolean leftFlag = doValidBST2(root.left, min, root.val);//剪枝
        if (!leftFlag) {
            return false;
        }
        return doValidBST2(root.right, root.val, max);
    }
}
