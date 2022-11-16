package oops.super_keyword;

class C extends B{
    C(){}
    
    C(int id){
        super(id);
        System.out.println(" parameterized constructor of C");
    }
    void print(){
        System.out.print(super.sid);
    }
}
