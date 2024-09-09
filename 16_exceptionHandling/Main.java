// public class Main{
//     public static void main(String []args){

//         int a = 10;
//         int b = 0;
//         System.out.println("Rohan");
//         System.out.println("Tamanna");
//         try {
//         // System.out.println(a/b); // (10 / 0)  
//         String str = "abc";
//         System.out.println(str.charAt(10));
//         } catch (StringIndexOutOfBoundsException e){
//         System.out.println(e);
//         System.out.println(e.toString());
//         System.out.println(e.getMessage());
//         System.out.println("exception caught");
//         }  
//         System.out.println("Hello");
//         System.out.println("Hii");

//     }
// }


public class Main{
    public static void main(String []args){
    System.out.println("Hello");
    System.out.println("tamanna");
    // try{
    // String str = "abd";
    // System.out.println(str);
    // System.out.println(str.charAt(5));
    // System.out.println("Sundori");
    // }
    // catch(Exception e){
    //     System.out.print("Exception caught");
    //     System.out.print("b");
    //     System.out.println(e);
        // System.out.println(e.getMessage());
    // }
    System.out.println("Hello rohan");

    try{
        // System.out.println(10/0);
        if(true){
            throw new Exception("my exception");
        }
    }
    catch(Exception e){
        // System.out.println(10/0);      
        System.out.println("Caught Again");
        System.out.println(e);
    }
    // catch(Exception e){
    //     System.out.println("Caught Again and Again");
    // }
    System.out.println("Hello");
    }
    }
