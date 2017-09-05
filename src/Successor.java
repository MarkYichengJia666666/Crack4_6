import javax.swing.tree.TreeNode;

/**
 * Created by jiayicheng on 17/8/10.
 */
public class Successor {
    TreeNode find(TreeNode n) {
        if (n == null) return null;

        if (n.right != null)
            return leftmost(n.right);
        else {
            TreeNode q = n;
            TreeNode x = n.parent;
            while (x != null && x.right = q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }

    TreeNode leftmost(TreeNode n) {
        if (n == null) return null;
        while (n.left != null) {
            n = n.left;
        }
        return n;
    }
}
