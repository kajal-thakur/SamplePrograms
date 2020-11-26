class Demo6{ 
	//instance variable 
     int rollno;  
     String name; 
     
     //static variable
     static String college = "BHU"; 
     
     //static method to change the value of static variable  
     static void change(){  
     college = "MIT";  
     }  
     
     
     Demo6(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     
     static{System.out.println("static block is invoked");}  
    
     void display(){
    	 System.out.println(rollno+" "+name+" "+college);
    }  
 
    public static void main(String args[]){  
    	Demo6.change();//calling change method  
    	    
    // System.out.println(name); name is non-static member which cannot be used in static method
    
    	Demo6 s1 = new Demo6(111,"Karan");  
    	Demo6 s2 = new Demo6(222,"Aryan");  
    	Demo6 s3 = new Demo6(333,"Sonoo");  
    
    
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  