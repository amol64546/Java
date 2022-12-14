// "static void main" must be defined in a public class.
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
class BST{
    Node root;
   
    void insert(Node root, int val){
         Node newnode = new Node(val);
        Node curr=root, parent=null;
        if(root==null) {       
            return ;
        }
        while(curr!=null){
            parent=curr;
            if(val< curr.data )
                curr=curr.left;
            else
                curr=curr.right;
        }
        if(val<parent.data)
            parent.left=newnode;
        else
            parent.right=newnode;
     
       
    }
    
   
         
   
         
    public Node add(int[] arr) {
        Arrays.sort(arr);
        return convert(arr,0,arr.length-1);
    }
    
    public Node convert(int[] arr, int l, int r){
        // base case
        if(l>r) return null;
        int mid = l+(r-l)/2;
        Node node = new Node(arr[mid]);
        node.left = convert(arr,l,mid-1);
        node.right = convert(arr,mid+1,r);  
        return node;
    }
    
            
                    
    Node delete(Node root, int key) {
        if(root==null) return root;
        if(key<root.data)
            root.left = delete(root.left,key);
        else if(key>root.data)
            root.right = delete(root.right,key);
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else {
                root.data = min(root.right);
                root.right = delete(root.right,root.data);
            }
        }    
         return root;   
                    
    }
    
    void inorder(Node root){
        if(root==null) return;
         inorder(root.left);
        System.out.print(root.data+" ");
       
        inorder(root.right);
    }
    
    int min(Node root){
        int min = root.data;
        while(root.left!=null){
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
    
     void levelorder(Node root) 
    {        
            Queue<Node> q = new ArrayDeque<>();
            System.out.println();
         System.out.println();
            q.offer(root);
            while(!q.isEmpty()){
                    int n = q.size();
                    for(int i=0; i<n; i++){
                            Node temp = q.poll();
                            if(temp.left!=null)
                                    q.offer(temp.left);
                            if(temp.right!=null)
                                    q.offer(temp.right);
                            System.out.print(temp.data+" ");
                    }
                System.out.println();
                    
            }
           System.out.println(); 

    }
}
public class Main {
    public static void main(String[] args) {
       BST b = new BST();
        int[] arr = {5,9,10,12,20,25,29,30,36,38};      
        
        Node root = b.add(arr);        
        b.inorder(root);
        b.levelorder(root);
    }
}
