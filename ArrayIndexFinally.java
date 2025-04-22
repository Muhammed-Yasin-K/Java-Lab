public class ArrayIndexFinally {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int result = 0;

        try {
            System.out.println("Value at index 3: " + numbers[3]);           
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. " + e);
        }
         finally {
         for(int i=1;i<=10;i++){
                result=i*i;  
            	System.out.println(result);
          	  }
		}
    }
}

