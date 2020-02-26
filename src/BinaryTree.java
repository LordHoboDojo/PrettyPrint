public class BinaryTree {
    Node root=null;
    public  Node insert(Node root, int dat)
    {
        if (root == null) {
            return new Node(dat);
        }
        if (dat < root.data) {
            root.left = insert(root.left, dat);
        }
        else {
            root.right = insert(root.right, dat);
        }

        return root;
    }
    int getDepth(Node node, int data, int level)
    {
        if (node == null)
            return 0;

        if (node.data == data)
            return level;

        int dLevel = getDepth(node.left, data, level + 1);
        if (dLevel != 0) return dLevel;

        dLevel = getDepth(node.right, data, level + 1);
        return dLevel;
    }

    public  void inOrderTraversal(Node root)
    {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.right);
        int depth = getDepth(this.root,root.data,1);
         StringBuilder spaces = new StringBuilder();
         for (int i=0; i< depth-1;i++){
             spaces.append("\t");
         }
        System.out.println(spaces + "" +  root.data);
        inOrderTraversal(root.left);
    }
}
 class Node
{
    public int data;
    public Node left;
    public Node right;

    public Node(int data)
    {
        this(data, null, null);
    }

    public Node(int data, Node left, Node right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}