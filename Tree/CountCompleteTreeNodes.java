class CountCompleteTreeNodes{

    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        
        TreeNode l = root, r = root;
        int hl = 0, hr = 0;
        while(l.left != null){hl++;l = l.left;}
        while(r.right != null){hr++;r = r.right;}
        
        if(hl == hr) return (2 << hl) - 1;
        else return countNodes(root.left) + countNodes(root.right) + 1;
    }
}