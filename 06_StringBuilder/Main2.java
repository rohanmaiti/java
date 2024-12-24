public class Main2{
    public static void main(String []args){
        // StringBuilder sb1 = new StringBuilder(); // It generates an empty String Builder with a 16-character initial capacity.
        // StringBuilder sb2 = new StringBuilder(32); // It generates a new, empty String Builder with the provided length for capacity.
        // System.out.println(sb1.capacity());
        // System.out.println(sb2.capacity());
        StringBuilder sb3= new StringBuilder("rohan");
        // System.out.println(sb3.toUpperCase()); // error
        
        String s = "nahor" ;
        // System.out.println(s == sb3.toString());
        // System.out.println(s.equals(sb3.toString()));
        System.out.println(s.contentEquals(sb3.reverse()));

        // sb3.ensureCapacity(65);

        
        // StringBuilder sb = new StringBuilder("rohan maiti is a student");
        // String arr[] = sb.toString().split(" ");
        // System.out.println(Arrays.toString(arr));
        
         
        // ***** sb.append(number || char || string || address) ********
        // int arr[] = {1,2,3};
        // StringBuilder sb = new StringBuilder("rohan");
        // sb.append(" maiti ");
        // sb.appendCodePoint(97); // Appending the character "a" (97) to the sequence.
        // sb.append('a'); // Appending the character a
        // sb.append(10);  // appending number 
        // sb.append(arr); // append the address of arr;
        // System.out.println(sb);
        // /*
        // int capacity(): This method returns the capacity of the StringBuilder object. The default capacity of the StringBuilder is 16 bytes. When the capacity of StringBuilder gets full the new capacity of StringBuilder will be (previouscapacity+1)X2.
        // */
        // System.out.println("length : "+sb.length() + " , capacity : "+sb.capacity());


        // ***** sb.insert(int offset, String s || char c || number)
        // StringBuilder sb = new StringBuilder("012345");
        // sb.insert(2,'a'); // can insert char 
        // sb.insert(2,"abc"); // can insert string
        // sb.insert(2,4.3); // can insert number
        // sb.insert(2,true); // can insert boolean 
        // System.out.println(sb);

        // *** sb.replace(startIndex,endIndex,String s); will replace from startIndex to endIndex - 1;
        // StringBuilder sb = new StringBuilder("0123456789");
        // sb.replace(2,5,'a'); // can't pass character . will give error
        // sb.replace(2,5,"a");  // if smaller string than endIndex - startIndex then add empty string to all positions 
        // sb.replace(2,5,"abcdefgh"); // if greater than will add then will add them to string
        // System.out.println(sb);

        // ******** sb.charAt(index) *******
        // StringBuilder sb = new StringBuilder("Secaler");
        // System.out.println(sb.charAt(0)+ ","+sb.charAt(1));
        // System.out.println(sb.deleteCharAt(0)); //return the changed string.  change in original string and returns the changed string 
        // System.out.println(sb);  // changed string 
        
        // ***** sb.setCharAt(index , char ) *****
        // StringBuilder sb = new StringBuilder("Secaler");
        // sb.setCharAt(0,'B');
        // sb.setCharAt(0,"B"); // does not take string as argument
        // System.out.println(sb);
        // System.out.println( sb.setCharAt(0,'S'));// does not return anything

        // ***** sb.deleteCharAt(index) ****
        // StringBuilder sb = new StringBuilder("012345");
        // System.out.println(sb.deleteCharAt(4)); // returns the changed string 
        // System.out.println(sb); // changed in original string
          
        // ****** sb.reverse(no args) *****
        // sb.reverse();// This method return StringBuilder reference.;
        // System.out.println(sb);
        // System.out.println(sb.reverse());

        
        // **** sb.indexOf(String str) ****
        /* 
        *  * This method takes one parameter i.e String. not character
        This method returns the first index of the given String in the sequence if it is present, Otherwise this method returns -1 that indicates String is not present in the StringBuilder sequence.
        */
        // StringBuilder sb = new StringBuilder("Secaler");
        // System.out.println(sb.indexOf("q")); // does not find it so returns -1 ;
        // System.out.println(sb.indexOf("ca")); // does not find it so returns -1 ;
        // System.out.println(sb.indexOf('q')); // parameter is char so gives error
        
        // ******* sb.lastIndexOf(String str)  *******
        // for last occurance index 
        // StringBuilder m=new StringBuilder("Scaler and Scaler");
        //This line will returns 11
        // System.out.println(m.lastIndexOf("Scaler")); // if multiple ca present the will return the last occurance 

        // ***** sb.isEmpty(no args) // returns true or false 
        // System.out.println(new StringBuilder().isEmpty());
        // System.out.println(new StringBuilder("abc").isEmpty());

        // ******* sb.substring(4) || sb.substring(0,5);  sb.substring(startingIndex , endIndex + 1); ******** 
        // StringBuilder sb = new StringBuilder("0123456789");
        // System.out.println(sb.substring(5)); // form 5ht to last index 
        // System.out.println(sb.substring(0,5)); // form 0 to 5-1 index
        // System.out.println(sb.substring(-1,5)); // will give exception index out of bound
        // System.out.println(sb.substring(5,1)); // will give exception index out of bound
        // System.out.println(sb); // no change in oroginal String


        // ********* sb.delete(startIndex , endIndex+1) ;
        StringBuilder sb = new StringBuilder("0123456789");
        System.out.println(sb.delete(0,6)) ; // delete from 0 to 6-1 and return the changed string;
        // System.out.println(sb.delete(6)) ; // has two paramiter , so error
        System.out.println(sb) ; // return the changed string;



    }
}