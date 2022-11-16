package oops.constructor_this_keyword;

public class Student
{

    //  non-static variable/methods can not be used inside static method
    // static is for class ans non-static is for objects

    int id=1;
    String name;     
     // only be called by object
    void get(){    
        System.out.println("count:"+Student.count+", id:"+this.id+", name:"+this.name);
    }

    static int count=0;    // static is for class level variable and should be called by class name   
                           // can also be called by obj   
                           //  Student.count, count, s1.count
    static void fun(){    
        System.out.println("Inside static fun()");
    }

    // default/non-parameterized constructor
    public Student(){ 
        this(5);  // calls single argument constructor
        count++;      
        this.name = "default";  // this keyward refer to current object
    }
    
    // single parameterized constructor
    public Student(int id){
        // this();  // for calling values from default constructor
        this.id = id;
    }
    
    // two parameterized constructor
    public Student(int id, String name){     
        this(id);   // for calling values from single parameterized constructor
      // this keyward refer to current object
        this.id = id;
        // this.name = name;  // automatically calls value from default contructor
    }
    
}
