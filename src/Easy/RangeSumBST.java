package Easy;

class RangeSumBST {

	class Solution {
	    public int rangeSumBST(TreeNode root, int low, int high) {
	       return rsBST(root, low, high);
	        
	    }

	    public int rsBST(TreeNode node, int low, int high){

	        if(node == null){
	            return 0;
	        }

	        if (node.val > high) {
	            return rsBST(node.left, low, high);

	        }
	        else if(node.val < low){
	            return rsBST(node.right, low, high);

	        }
	        else{
	            return node.val + rsBST(node.right, low, high) + rsBST(node.left, low, high);
	        }
	    }
	}