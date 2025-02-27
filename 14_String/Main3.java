

public class Main3{
    public static void main(String []args){
        // String s1 = "Rohan Maiti";
        // String s2 = " Tamanna Jana";
        // String s3 = s1 + s2;
        // s1 = s1 + s2;
        // System.out.println(s.length());
        // System.out.println(s3)
        // System.out.println(s1.concat(s2));
    
        // ***** equals() and equalsIgnoreCase() ******** 
        // String first = "java programming";
        // String second = "java programming";
        // System.out.println(first.equals(second));

        // String first = "java programming";
        // String second = "JAVA programming";
        // System.out.println(first.equalsIgnoreCase(second));

        // ***** to ignore anything*******
        // String s4 = "this is a \"java\" Programing language ";
        // System.out.println(s4);


        // ****** split(" ") *****
        // String s = "rohan maiti and tamanna jana";
        // String arr[] = s.split(" ");

        // String s = "aaabaaabaaabaabaaba";
        // String arr[] = s.split("b");
        // for(String str : arr){
        //     System.out.println(str);
        // }

        // String s2 = "hii   rohan  How are you";
        // System.out.println(Arrays.toString(s2.split("\\s+")));

        // ******** when delemiter is a special character *****
        // String s = "10+9+7+7";
        // String arr[] = s.split("\\+");
        // System.out.println(Arrays.toString(arr));

        // String n = "100";
        // int num = Integer.parseInt(n);
        // num += 20;
        // System.out.println(num);


        // ********* compareTo();
        /*
           returns 0 if the strings are equal
           returns a negative integer if the string comes before the str argument in the dictionary order
           returns a positive integer if the string comes after the str argument in the dictionary order
         */

        //  String str2 = "Learn Java";
        //  String str1 = "Learn Kotlin";
        //  int result;
     
         // comparing str1 with str2
        //  result = str2.compareTo(str1);
        //  System.out.println(result);


        // ******** replace() ***  replace() , replaceFirst() ; 
        // String str1 = "bat ball bat ball bat ball";
        // replace b with c
        // System.out.println(str1.replace('b', 'c'));     // replace all occuaance
        // System.out.println(str1);                       // does not change in original string
        // System.out.println(str1.replace("bat","cat"));  // replace all occurance
        // System.out.println(str1);                       // does not change in original string


        // if replacing word is not present in the string  then returns the original string 
        // System.out.println(str1.replace("cow","cat"));  

        // how technically it works : replace the first occurance
        // System.out.println("zzz".replace("zz", "x")); // xz

        // replace vs replaceAll
        // System.out.println(str1.replaceAll('b', 'c'));   
        // System.out.println(str1.replaceAll("bat","cat"));  // replace all occurance
        // System.out.println(str1.replace("bat","cat"));    // replace all occurance

        // ***** replaceFirst();
        // System.out.println(str1.replaceFirst("bat","cat"));    // replace only 1st occurance
        // System.out.println(str1.replaceFirst('b','c'));   // argument string, string , so give error 

        // ***** replace all degits with empty string
        String str1 = "Learn83838Java26263730";
        String result;
        result = str1.replaceAll("\\d", "");
        System.out.println(result); 


        // **** substring(index , index);
        // String s = "0123456789101112";
        // System.out.println(s.substring(2,7)); // 2 to (7-1)
        // System.out.println(s.substring(4)); // from index to last
        // System.out.println(s.substring(2,16)); // from index to last

        // System.out.println(s.substring(2,100)); // out of bound exception
        
        // ***** contains() ****  returns true or false 
        // String str1 = "Java String contains()";
        // boolean result = str1.contains("Java");
        // boolean result = str1.contains('J'); // only takes string as args .... so error
        // String s = "Java";
        // boolean result = str1.contains(s);
        // System.out.println(result);

        // String str1 = "abcd";
        // boolean result = str1.contains("");
        // System.out.println(result);



        // ***** indexOf(char) || string.indexOf(int ch, int fromIndex) *** 
        // String s = "0123456789101112131415";
        // System.out.println(s.indexOf('5',6));  // can search character
        // System.out.println(s.indexOf('k'));  // if not present retrun -1 
        // System.out.println(s.indexOf("567")); // can search string and will return the satarting index of the string or return -1;
        // System.out.println(s.indexOf("rohan"));

        // String s4 = "this is a cow and this is a cat";
        // System.out.println(s4.indexOf("this"));
        // System.out.println(s4.indexOf("this",2)); // will search the string from 2nd index
        

        // ******** trim() 

        // String str1 = "Learn\nJava \n\n   ";
        // String result;
        // result = str1.replaceAll("\\s", "");
        // System.out.println(result); 
        
        // String str1 = "   Learn Java Programming      ";
        // System.out.println(str1.trim());
        // System.out.println(str1);  // does not change in original string 

        // ******** toLowerCase();
        // String str1 = "JAVA PROGRAMMING";
      //  // convert to lower case letters
        // System.out.println(str1.toLowerCase());  // do not change in original string 
        // System.out.println("rohan".toUpperCase());
        // String str2 = "rohan maiti";
        // System.out.println(str2.toUpperCase());

        // ******* valueOf()  ************** 
        /**
         * Here, valueOf() is a static method . We call the valueof() method using the class name like this:    String.valueOf(b);
         */

    // int a = 5;
    // long l = -2343834L;
    // float f = 23.4f;
    // double d = 923.234d;
    // boolean b = true;

    // convert numbers to strings
    // System.out.println(String.valueOf(a));  // "5"
    // System.out.println(String.valueOf(l));  // "-2343834"
    // System.out.println(String.valueOf(f));  // "23.4"
    // System.out.println(String.valueOf(d));  // "923.234"
    // System.out.println(String.valueOf(b));  // true;


    // char c = 'J';
    // char ch[] = {'J', 'a', 'v', 'a'};
    // // convert char to string
    // System.out.println(String.valueOf(c));  // "J"
    // // convert char array to string
    // System.out.println(String.valueOf(ch));  // "Java"


    // char ch[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
    // int offset = 2;
    // int length = 4;
    // String result;
    // // subarray {'o', 'g', 'r', 'a'} is converted to string
    // result = String.valueOf(ch, offset, length);
    // System.out.println(result);  // "ogrm"


    // ***********  startsWith()  *************** 

    // String str = "JavaScript";
    // // checks if "JavaScript" starts with "Java"
    // System.out.println(str.startsWith("Java"));
     
    // Java startsWith() With Offset Parameter
    // String str = "Java Programming";
    // checks in substring "a Programming"
    // System.out.println(str.startsWith("Java", 3)); // false
    // System.out.println(str.startsWith("a Pr", 3)); // true

    // String str = "Java Programming";
    // System.out.println(str.endsWith("mming")); // true
    // System.out.println(str.endsWith("g")); // true
    // System.out.println(str.endsWith("a Programming")); // true
    // System.out.println(str.endsWith("programming")); // false
    // System.out.println(str.endsWith("Java")); // false
    
    // String s = "abc";
    // StringBuffer sb = new StringBuffer("abc");
    // System.out.println(s.contentEquals(sb)); 
    // System.out.println(s.equals(sb)); 
    // System.out.println(s.equals(sb.toString())); 

    // String s1 = new String("abc");
    // String s2 = new String("abc");
    // System.out.println(s1.equals(s2)); 
    // System.out.println(s1.contentEquals(s2)); 
 


    // String result;
    // result = String.join("-", "Java", "is", "fun");
    // System.out.println(result);  // Java-is-fun

    // ********** String.format() ******** 
    /**
     * *format() is a static method. We call the format() method using the class name String. 
     * */
    // String s1 = String.format("%d",12); // decimal
    // String s1 = String.format("%x",12); // converts in hexadecimal number  
    // String s1 = String.format("hello %s",12); // format as a string 
    // System.out.println(s1); 

    /**
     * %b, %B	"true" or "false" based on the argument
        %s, %S	a string
        %c, %C	a Unicode character
        %d	a decimal integer (used for integers only)
        %o	an octal integer (used for integers only)
        %x, %X	a hexadecimal integer (used for integers only)
        %e, %E	for scientific notation (used for floating-point numbers)
        %f	for decimal numbers (used for floating-point numbers)
     * 
     */
    

    // ************** important ************************ 
    // double n2 = 123.43;
    // String s3 = String.format("%.2f", n2); 
    // System.out.println(s3) ;
    // System.out.println(Float.parseFloat(s3));
    // String s4 = "1234";
    // System.out.println(Integer.parseInt(s4)) ;


    // double d = 12.234;
    // String dd = String.valueOf(d); 
    // String num = String.format("%.2f",d);
    // float f = Float.parseFloat(num);
    // System.out.println(f);
    

    // ******************************* ************************** ******************* ****************
    // System.out.println("a".toUpperCase());
    // System.out.println(Character.toUpperCase('a'));
    // char c = ('a'-32);
    // System.out.println(c);
    // StringBuilder sb = new StringBuilder("abc");
    // c = sb.charAt(0);

    // System.out.println(c);
    // StringBuilder sb = new StringBuilder("abc");
    // char firstChar = sb.charAt(0);
    // System.out.println(firstChar);
    // char capital = (firstChar - 32);
    // System.out.println(capital)

    
    }
}


// class Main3
// {
//     public static void main(String args[]) 
//     {
        // int sum=0;
        // try 
        // {
        //     int i;
        //     sum = 10;
        //     for (i = -1; i < 3 ;++i)
        //         sum = (sum / i);
        // }
        // catch(ArithmeticException e) 
        // {  } 
        // System.out.print(sum);
    //     float f = Float.parseFloat("34.56");

    // }


    // public static void main(String args[]) 
    // {
    //     int sum=0;
    //     try 
    //     {
    //         int i;
    //         sum = 10;
    //         for (i = -2; i < 3 ;++i){
    //             sum = (sum / i);
    //             System.out.println(sum);
    //         }

    //     }
    //     catch(ArithmeticException e) 
    //     {  } 
    //     // System.out.print(sum);
    // }

    // public static void main(String args[]) 
    // {
    //     try 
    //     {
    //         int i, sum;
    //         sum = 10;
    //         for (i = -1; i < 3 ;++i)
    //             sum = (sum / i);
    //     }  
    //     // System.out.print(sum);
    // }
// }