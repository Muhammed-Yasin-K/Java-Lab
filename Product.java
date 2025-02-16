public class Product {
  int pcode;
  String pname;
  int price;

  public static void main(String []args) {
    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new Product();

    p1.pcode = 100;
    p1.pname = "TV";
    p1.price = 33000;
    
    p2.pcode = 150;
    p2.pname = "Laptop";
    p2.price = 50000;
    
    p3.pcode = 200;
    p3.pname = "Mobile";
    p3.price = 21000;
    
    System.out.println(p1.price);
    System.out.println(p2.price);
    System.out.println(p3.price);

    if (p1.price < p2.price && p1.price < p3.price) {
      System.out.println(p1.pname + " price is Lower!");
    }
    else if (p2.price < p1.price && p2.price < p3.price) {
      System.out.println(p2.pname + " price is Lower!");
    }
    else {
      System.out.println(p3.pname + " price is Lower!");
    }
  }
}

