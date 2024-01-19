//给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,null,2,3]
//输出：[1,3,2]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
//
// Related Topics 栈 树 深度优先搜索 二叉树 👍 1649 👎 0

  
package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal{
  public static void main(String[] args) {
       Solution solution = new BinaryTreeInorderTraversal().new Solution();
//      TreeNode treeNode = new TreeNode(3);
//      treeNode.left = new TreeNode(2);
//      treeNode.right = new TreeNode(1);
//      System.out.println("solution.inorderTraversal(treeNode) = " + solution.inorderTraversal(treeNode));
  }
  //leetcode submit region begin(Prohibit modification and deletion)

//Definition for a binary tree node.
public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> temp = new ArrayList<>();
        inorder(root, temp);
        return temp;
    }

    // 中序遍历 左-》中-》右
    public List<Integer> inorder(TreeNode treeNode, List<Integer> temp) {
        if (treeNode == null) {
            return temp;
        }
        inorder(treeNode.left, temp);
        temp.add(treeNode.val);
        inorder(treeNode.right, temp);
        return temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}