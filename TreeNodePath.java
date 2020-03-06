这是一个关于树的路径的文档
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
List<List<Integer>> res = new ArrayList<>();
        dfs(root,sum,res,new ArrayList<>());
        return res;
    }
    public void dfs(TreeNode root, int sum, List<List<Integer>> res,List<Integer> list) {
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<>(list));
        }

        if(root.left != null){
            dfs(root.left,sum-root.val,res,list);
        }
        if(root.right != null){
            dfs(root.right,sum-root.val,res,list);
        }
        list.remove(list.size()-1);
    }
}
