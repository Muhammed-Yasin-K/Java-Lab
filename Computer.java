class CPU {
    float price=50000;
    
    class Processor {
        int num_cores=16;
        String manufacturer = "Ryzen";
        static class RAM {
              String memory="64GB",manufacturer= "Lenovo";         
       }
    }
}
public class Computer {
   public static void main(String []args) {
          CPU myCPU = new CPU();
          System.out.println("Price of CPU:"+myCPU.price);
          System.out.println("Number of cores :"+myCPU.new Processor().num_cores);
          System.out.println("Manufacturer of Processor:"+myCPU.new Processor().manufacturer);
          System.out.println("Memory:"+new CPU.Processor.RAM().memory); 
          System.out.println("Manufacturer of RAM:"+new CPU.Processor.RAM().manufacturer);          
   }
}



