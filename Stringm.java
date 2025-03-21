import java.util.Scanner;
public class Stringm {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        
        //Length of a string
        System.out.println("-------------Length of the String-----------------");
        System.out.print("Enter the String : ");
        String str = obj.nextLine();
        System.out.println("Length of the String : "+str.length());
        System.out.println("=====================================================");
        
        //Uppercase
        System.out.println("-------------Uppercase of the String-----------------");
        System.out.print("Enter the String : ");
        String str1 = obj.nextLine();
        System.out.println("Upper Case: "+str1.toUpperCase());
        System.out.println("=====================================================");
       
        //Lowercase
        System.out.println("-------------Lowercase of the String-----------------");
        System.out.print("Enter the String : ");
        String str2 = obj.nextLine();
        System.out.println("Lower Case: "+str2.toLowerCase());
        System.out.println("=====================================================");
      
        //Concatination
        System.out.println("-------------Concatination of Strings-----------------");
        System.out.print("Enter the first String : ");
        String firstname = obj.nextLine();
        System.out.print("Enter the second String : ");
        String lastname = obj.nextLine();
        System.out.println("Concatination : "+firstname.concat(lastname));
        System.out.println("=====================================================");
       

        //Character Position Retrieve
        System.out.println("-------------Extraction of the String-----------------");
        System.out.print("Enter the String : ");
        String str3 = obj.nextLine();
        char result = str3.charAt(2);
        System.out.println("Character at position 2:"+result);
        System.out.println("=====================================================");
     
        
        //Contains
        System.out.println("-------------Character Containing-----------------");
        System.out.print("Enter the String : ");
        String str4 = obj.nextLine();
        if (str4.contains("Hell"){
           System.out.println("String contains the given character");
        }
        else{
           System.out.println("String not contains the given character");
        }
        System.out.println("=====================================================");
        
        
        //Substring
        System.out.println("-------------Substring of the String-----------------");
        System.out.print("Enter the String : ");
        String str5 = obj.nextLine();
        System.out.println("Substring of the string:"+str5.substring(0,2));
        System.out.println("=====================================================");
        
        //Trim
        System.out.println("-------------Trimming of the String-----------------");
        System.out.print("Enter the String : ");
        String str6 = obj.nextLine();
        System.out.println("Trimmed string:"+str6.trim());
        System.out.println("=====================================================");
       
        
        //endsWith
        System.out.println("-------------ENDSWITH-----------------");
        System.out.print("Enter the String : ");
        String str7 = obj.nextLine();
         if (str7.endsWith("oon"){
           System.out.println("String endswith the given character");
        }
        else{
           System.out.println("String not endswith the given character");
        }
        System.out.println("=====================================================");
        
        
        //startsWith
        System.out.println("-------------STARTSWITH-----------------");
        System.out.print("Enter the String : ");
        String str8 = obj.nextLine();
        if (str8.endsWith("ba"){
           System.out.println("String startswith the given character");
        }
        else{
           System.out.println("String not startswith the given character");
        }
        System.out.println(str8.startsWith("bal"));
        System.out.println("=====================================================");
        
        
        //replace
        System.out.println("-------------Replacement of String-----------------");
        System.out.print("Enter the String : ");
        String fname = obj.nextLine();
        System.out.println("Replacement of String: "+fname.replace("good","bad"));
        System.out.println("=====================================================");
       
        
        //equals
        System.out.println("-------------Equality of String-----------------");
        System.out.print("Enter the first String : ");
        String fname1 = obj.nextLine();
        System.out.print("Enter the second String : ");
        String lname1 = obj.nextLine();
        if (fname1.equals(lname1)){
           System.out.println("Strings are equal");
        }
        else{
           System.out.println("Strings are not equal");
        }
        System.out.println("==================================================");
        
        //Compareto
        
        
        
        

    }
}
