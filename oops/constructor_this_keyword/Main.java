package oops.constructor_this_keyword;

public class Main
{
	static int hi;
	public static void main(String[] args) {
	     
		Student s1 = new Student();
		s1.name = "Amol";
		System.out.println("count:"+Student.count+", id:"+s1.id+", name:"+s1.name);
		
		Student s2 = new Student(2, "hello");
		s2.get();
		
// 		Student.fun();
		
		Employee e1 = new Employee(6);
		e1.get();
	
		
		
	}
}



