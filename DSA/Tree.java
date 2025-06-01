import java.lang.*;
class Tree {
    
    static class Node{

        Node left;
        Node right;
        int data;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }

    static class BuildTree{
        int idx=-1;
    public Node BuildTree(int nodes[])
       {
        idx=idx+1;
        if(nodes[idx]==-1)
        {
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=BuildTree(nodes);
        newNode.right=BuildTree(nodes);
        return newNode;

       }
    }

    
    public static void main(String[] args) 
    {
        
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildTree b=new BuildTree();
        Node root=b.BuildTree(nodes);
        System.out.println(root.data);
        
    }
}

