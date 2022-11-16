

class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
                this.data = data;
        }
}
class Stack<T>{
        Node<T> top;
        int size=0;
        
        
        void push(T data){
                Node<T> node = new Node<T>(data);
                size++;
                node.next = top;
                top = node;
        }

        T pop(){                
                // stack underflow
                if(top==null) {
                    System.out.println("Stack underflow");
                    return null;
                }
                        
                T res = top.data;
                size--;
                top = top.next;
                return res;
        }

        T peek(){
                // stack underflow
               if(top==null) {
                System.out.println("Stack underflow");
                    return null;
               }
                        
                return top.data;
        }
        
        boolean empty(){
                return top==null;
        }
}

       
	
