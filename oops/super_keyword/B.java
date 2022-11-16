package oops.super_keyword;

class B extends A{
    int id=2;            // preference to child class variable
    
    // super keyword only can be used in child class to call non-static variable/method from it only one level up parent class
    int sid=super.id;   // now preference to parent class variable 
    void print(){
         System.out.println(sid);
    }
    
    B(){}

    B(int id){       
         System.out.println(this.id+"parameterized constructor of B");
    }
   
}
