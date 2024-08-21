package tree;

import java.util.LinkedList;

public class HouZhuiToTree {
    public static void main(String[] args) {
        String[] tokens = new String[]{"2", "1", "-", "3", "*"};
        TreeNodeStr treeNodeStr = new HouZhuiToTree().constructExpressionTree(tokens);
        LinkedList<TreeNodeStr> stack = new LinkedList<>();
        LinkedList<TreeNodeStr> stack1 = new LinkedList<>();
        TreeNodeStr pop = new TreeNodeStr();
        TreeNodeStr curr = treeNodeStr;
        while (curr != null || !stack1.isEmpty()) {
            if (curr != null) {
                stack1.push(curr);
                curr = curr.left;
            } else {
                TreeNodeStr peek = stack1.peek();
                if (peek.right == null) {
                    pop = stack1.pop();
                    System.out.print(pop.value);
                } else if (peek.right == pop) {
                    pop = stack1.pop();
                    System.out.print(pop.value);
                } else {
                    curr = peek.right;
                }
            }
        }
    }

    public TreeNodeStr constructExpressionTree(String[] tokens) {
        LinkedList<TreeNodeStr> stack = new LinkedList<>();
        for (String token : tokens) {
            switch (token) {
                case "+", "-", "*", "/" -> {
                    TreeNodeStr right = stack.pop();
                    TreeNodeStr left = stack.pop();
                    TreeNodeStr parents = new TreeNodeStr(token);
                    parents.left = left;
                    parents.right = right;
                    stack.push(parents);
                }
                default -> {
                    stack.push(new TreeNodeStr(token));
                }
            }
        }
        return stack.peek();
    }
}

class TreeNodeStr {
    String value;
    TreeNodeStr left;
    TreeNodeStr right;

    public TreeNodeStr(String value, TreeNodeStr left, TreeNodeStr right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNodeStr(String value) {
        this.value = value;
    }

    public TreeNodeStr() {
    }
}
