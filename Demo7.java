import java.util.*; 

public class Demo7{  
public static void main(String args[]){  
	
 //Creating a List  
 List<String> list=new ArrayList<String>();  
 
 //Adding elements in the List  
 list.add("Mango");  
 list.add("Apple");  
 list.add("Banana");  
 list.add("Grapes"); 
 list.add("Apple"); //allow duplicate values and stored twice
 
 //Iterating the List element using for-each loop  
 for(String fruit:list)  
  System.out.println(fruit);  
 
//Creating a Set
 HashSet<String> set=new HashSet();  
 set.add("One");    
 set.add("Two");    
 set.add("Three");   
 set.add("Four");  
 set.add("Five"); 
 set.add("Two"); //ignore the duplicate values and stored once
 
//Iterating the Set element using Iterator hasNext()
 Iterator<String> i=set.iterator();  
 while(i.hasNext())  
 {  
 System.out.println(i.next());  
 }  
 
//Creating a Map
 Map<Integer,String> map=new HashMap<Integer,String>();  
 map.put(1,"Amit");  
 map.put(2,"Vijay");  
 map.put(3,"Rahul"); 
 map.put(4,"Rahul"); //duplicate values are allowed with unique keys
 map.put(2,"Ajay"); //ignore duplicate key and replace the old value with new one
 
 //Iterating the MAp 
 for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
 }
}  
}  