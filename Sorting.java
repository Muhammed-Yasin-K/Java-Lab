import java.util.Arrays;

public class Sorting {
  public static void main(String [] args){
       String [] Arr = {"Car","Bus","Bike","Jeep","Train","Aeroplane","Truck","Autorikshaw"};
       
       System.out.println("Original Array:" +Arrays.toString(Arr));
       
       int len = Arr.length;
       for(int i=0;i<len-1;i++){
           for(int j=i+1;j<len;j++){
               if(Arr[i].compareTo(Arr[j])>0){
                   String temp = Arr[i];
                   Arr[i] = Arr[j];
                   Arr[j] = temp;
         }
      }      
           }
    System.out.println("Sorted Array:" +Arrays.toString(Arr));   
}
}
