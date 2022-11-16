package oops2.Constructor;

public class Student {

    Student(){
        System.out.println("Default constructor is called!");
    }
    Student(String firstName, String lastName){
        System.out.println("Constructor with 2 arguments, First Name: "+firstName+" and Last Name: "+lastName);
    }

    Student(String firstName, String lastName, int rollNo){
        System.out.println("Constructor with 3 arguments, First Name: "+firstName+" and Last Name: "+lastName+" Roll Number: "+rollNo+" was called");
    }
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student Student2 = new Student("Amol","Nakhate");
        Student Student3 = new Student("Hemant","Kashyap",2);
    }
}
