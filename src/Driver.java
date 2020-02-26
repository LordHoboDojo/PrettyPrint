
import java.io.FileNotFoundException;

public class Driver {
        public static void main(String[] args) throws FileNotFoundException {
            int[] inputs = {15, 11, 7, 2, 18, 23,1};
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(inputs[0]);
        for (int i=1;i<inputs.length;i++){
            tree.insert(tree.root,inputs[i]);
        }
        tree.inOrderTraversal(tree.root);

    }
}
