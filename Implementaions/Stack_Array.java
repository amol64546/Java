
class MyStack{
    int n, top;
    int[] arr;
    MyStack(int n){
        this.n = n;
        top = -1;
        arr = new int[n];
    }
    
    void push(int data){
        if(top==n-1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top]=data;
        
    }
    int peek(){        
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }
    int pop(){
        if(top==-1){
            System.out.print("Stack underflow");
            return -1;
        }
        int data = arr[top];
        top--;
        return data;        
    }
}
public class Stack_Array {
    public static void main(String[] args) {
        MyStack st = new MyStack(10);
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(14);
        st.push(15);
        st.push(0);
        System.out.print(st.peek());
    }
}