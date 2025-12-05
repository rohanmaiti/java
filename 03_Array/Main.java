
import java.util.Arrays;

public class Main{
    public static void main(String []args){

       // *IN JAVA ARRAY is allocated memory in heap area irrespect of writing syntax 
       // declare a array 
       // int arr[];
       // define size
       // arr = new int[10];
     

        //declare and initialize and array
        int[] age = {12, 4, 5, 2, 5};

        // declare and initialise it using new 
        // int roll[] = new int[]{1,2,3,4};

        // multidimentional array 
        // double[][] matrix = {{1.2, 4.3, 4.0},{4.1, -1.1},{1,2}};


        /*********** ******************** ******************  */
        // * copying an array  unsing assign operator
        //  int [] numbers = {1, 2, 3, 4, 5, 6};
        //  System.out.println("address of numbers Array"+" : "+numbers);
        // int [] positiveNumbers = numbers;    // copying arrays
        // System.out.println("address of positiveNumbers Array"+" : "+numbers);
        // And it will  work
        // int arr2[] = new int[]{0,2,3,4,5};
        // numbers = arr2;
        // System.out.println("PositiveNumbers"+Arrays.toString(positiveNumbers));
        // System.out.println("Numbers"+Arrays.toString(numbers));

        // * Tavesing a Array
        // for (int number: positiveNumbers) {
        //     System.out.print(number + ", ");
        // }
        // System.out.println(); 

        // * like c++ auto datatype here in java we have var
        // var a = 10;
        // System.out.println(a);
        // a = "Rohan";  // onece assigned to a type cant be assigned to a different type 
        // System.out.println(a);
        // var s = "string";
        // System.out.println(s);

        // in java array are of reference type means copying a array like a = b will copy the referance and 
        // hence change in any array will affect the 2nd array... this is called // * shallow copy 
        // copying each value to a new array by loop is //* Deep copy */
        

    }
}