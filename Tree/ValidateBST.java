class ValidateBST{

    Integer last_printed = null;
    boolean checkBST(TreeNode root){
        if(root == null) return true;
        if(!checkBST(root.left)) return false;
        if(last_printed != null && root.val < last_printed) return false;
        last_printed = root.val;
        if(!checkBST(root.right)) return false;
        return true;
    }

    boolean checkBST(TreeNode root){
        return checkBST(root, null, null);
    }

    boolean checkBST(TreeNode root, Integer min, Integer max){
        if(root == null) return true;
        if((min != null && root.val <= min) || (max != null && root.val > max)) return false;
        if(!checkBST(root.left, min, root.val) || !checkBST(root.right, root.val, max)) return false;

        return true;
    }
}