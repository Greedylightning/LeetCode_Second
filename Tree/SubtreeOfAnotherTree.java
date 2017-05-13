class SubtreeOfAnotherTree{

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null) return false;
        if(check(s,t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);

    }

    public boolean check(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        if(a.val != b.val) return false;

        return check(a.left, b.left) && check(a.right, b.right);
    }
}