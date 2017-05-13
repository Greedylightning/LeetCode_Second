class MinimalTree{

    TreeNode createMinimalBST(int[] nums){
        return createMinimalBST(nums, 0, nums.length - 1);
    }

    TreeNode createMinimalBST(int[] nums, int begin, int end){
        if(start > end) return null;
        int mid = (begin + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createMinimalBST(nums, begin, mid - 1);
        node.right = createMinimalBST(nums, mid + 1, end);
        return node;
    }
}