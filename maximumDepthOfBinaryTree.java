class Solution {
    public int maxDepth(TreeNode root) {
        //If the root is null, return 0 as the depth
        if(root == null) return 0;
        
        //Recursively find the maximum depth of the left subtree
        int left = maxDepth(root.left); 
        //Recursively find the maximum depth of the right subtree
        int right = maxDepth(root.right); 
        
        // Return the maximum depth of the current node's subtrees plus 1
        // 1 is added to account for the depth of the current node itself
        return Math.max(left, right) + 1;
    }
}
