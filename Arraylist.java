  
import java.util.*;  
    class Arraylist{  
    public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
    
    list.add("Ravi");//Adding object in arraylist
    list.add("Vijay");  
    list.add("Arun");  
    list.add("Bob");  
    
    //Traversing list through Iterator  
    Iterator itr=list.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next()); 
    } 
    
    //to access an element
    String firstname=list.get(0);
    String secondname =list.get(2);
    System.out.println("the first name is:" +firstname);
    System.out.println("the second name is:" +secondname);
    
    //updating an element
    System.out.println("before update:" +list);
    list.set(3,"Wissam");
    System.out.println("after update:" +list);
    
    //to remove an element
    list.remove(1);
    System.out.println("after removing" +list);
    
    // usage of contains function
    System.out.println(list.contains("Arun"));
    System.out.println(list.contains("varun"));
    
    //size of array list
    System.out.println("the size of the names :" +list.size());
    
    //sorting
    Collections.sort(list); 
        System.out.println("In sorting order: " + list);
        
    //to clear
    list.clear();
        System.out.println("the array list is cleared");
    }  
    }  


	

