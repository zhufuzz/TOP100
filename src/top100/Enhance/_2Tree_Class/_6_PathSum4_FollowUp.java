package top100.Enhance._2Tree_Class;


public class _6_PathSum4_FollowUp {
	//Follow Up: Path � Any node to any other node
/*
	if (root.left != null  root.right != null) {
	      max[0] = Math.max(left + right + root.val, max[0]);
	}
	if(root.left == null)
	      return root.val + right;
	else if (root.right == null)
	      return root.val + left;
	else
	      return Math.max(left, right) + root.val;
}
*/
private class TreeNode {

	public int val ;
	public TreeNode(int i) {
		// TODO Auto-generated constructor stub
	}
	public TreeNode left;
	public TreeNode right;

}
}