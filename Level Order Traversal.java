class Solution {
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        else
        {
             int lefth=0;
            int righth=0;
        lefth=height(root.left);
        righth=height(root.right);
        if(lefth>righth)
            return lefth+1;
        else
            return righth+1; 
        }  
    }
 List<List<Integer>> list=new ArrayList<List<Integer>>();
    public List<Integer> level(TreeNode root,int level,List<Integer>list1)
    {
        if(root==null)
            return null;
        if(level==1)
            list1.add(root.val);
        else if(level>1)
        {
            level(root.left,level-1,list1);
            level(root.right,level-1,list1);
        }
        return list1;       
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        int h=height(root);
        
        for(int i=1;i<=h;i++)
        {
            List<Integer> list1=new ArrayList<Integer>();
            list.add(level(root,i,list1));   
        }
        return list;   
    }
}
