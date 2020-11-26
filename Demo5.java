public class Demo5 {
	int id;  
    String name;  
    
  //creating a non-parameterized constructor
    Demo5(){
    	System.out.println("default constructor is called");
    }
    
    //creating a parameterized constructor  
    Demo5(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    //method to display the values  
    void display()
    {
    	System.out.println(id+" "+name);
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //creating objects and passing values  
	    Demo5 s1 = new Demo5(111,"Karan");  
	    Demo5 s2 = new Demo5(222,"Aryan");
	    Demo5 s3 = new Demo5();
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display(); 
	    s3.display();

	}

}
