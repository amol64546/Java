import java.util.*;

class Node<T>{
        T data;
        Node<T>  next;
        Node(T data){
                this.data = data;
        }
}
class MyStack<T>{
        Node<T>  head;      
        int size=0;
        
        
        void push(T data){
                Node<T> node = new Node<T>(data);                
                size++;
                node.next = head;
                head = node;
        }

        T pop(){                
                // stack underflow
                if(head==null) {
                    System.out.println("Stack underflow");
                    return null;
                }
                        
                T res = head.data;
                size--;
                head = head.next;
                return res;
        }

        T peek(){
                // stack underflow
               if(head==null) {
                System.out.println("Stack underflow");
                    return null;
               }
                        
                return head.data;
        }
        
        boolean empty(){
                return head==null;
        }

        @Override
        public String toString(){
                T[] arr =(T[]) new Object[size];
                Node<T> temp = head;
                int i=size-1;
                while(temp!=null){
                        arr[i--] = temp.data;
                        temp=temp.next;
                }
                return Arrays.toString(arr);
        }

       
}

public class Stack_LL{
         public static void main(String[] args){
                var st = new MyStack<String>();                
                st.push("Hello");
                st.push("world!");
                System.out.println(st.toString());
        }
}

   
	
