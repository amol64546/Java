package oops.constructor_this_keyword;

class Employee extends Student{    // Inheritance is from parent to child
    public Employee(int id){
        this.id = id;
        // this.name = "user";  // automatically calls value from default contructor (now it is from parent class)
    }
}
