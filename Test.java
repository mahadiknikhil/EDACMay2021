class Student
{
	int Id;
	String name;
	 public void setData(int Id, String name)
	 {
		 this.Id = Id;
	     this.name = name;
	 }
	 
	 public void display()
	    {
	        System.out.println("Student id is: " +Id);
	        System.out.println("Student name is: " +name);
	                      
	        System.out.println();
	    }
	 
	

	 
}


public class Test {

	public static void main(String[] args) {
		
		Student[] arr=new Student[2];
		
		arr[0]=new Student();
		arr[1]=new Student();
		
		arr[0].setData(234,"Nikhil");
		arr[1].setData(123,"Amol");
		
		System.out.println("Student1 data is");
		arr[0].display();
		
		System.out.println("Student2 data is");
		arr[1].display();
		}

}
