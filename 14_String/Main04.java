
import java.util.Arrays;







public class Main{
    public static void main(String []args){
        // String s1 = new String("hello rohan ");
        // String s2 = "Hello";

        // System.out.println((s1 == s2));
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.contentEquals(s2));
        // System.out.println(s1.equalsIgnoreCase(s2));

        // *** str.length()   ;;
        // System.out.println(s1.length());

        // *** str.charAt(index) ;;
        // System.out.println(s1.charAt(1));

        // *** str.concat(str2) ;;
        // System.out.println(s1.concat(s2));

        // String name = "Rohan";
        // name += " Maiti";
        // System.out.println(name);

        // String s1 = "Rohan Maiti";
        // String s2 = " Tamanna Jana";
        // String s3 = s1 + s2;
        // System.out.println(s3);

        // String s4 = "this is a \"java\" Programing language ";
        // System.out.println(s4);

        //  String s = "rohan maiti    and tamanna jana";
    // ****    //  String []stringArr = s.split("\\s+");
        //  for(int i=0;i<stringArr.length;i++){
        //     System.out.println(stringArr[i]);
        //  }

        // System.out.println(Arrays.toString(stringArr));

        // String s = "abcdefghi";
        // String strArr[] = s.split("");
        // System.out.println(Arrays.toString(strArr));

        //  for(int i=0;i<strArr.length;i++){
        //     System.out.println( strArr[i]);
        //  }

        // for(String x: strArr)
        // System.out.println(x);


        //  String s = "abcdefghi";
        //  char arr[] = s.toCharArray();
         
        // for(char x: arr)
        // System.out.println(x);

        // String s = "10+20+30";
        // String arr[] = s.split("\\+");
        // System.out.println(Arrays.toString(arr));

        // String s1 = "Aohan";
        // String s2 = "Tamanna";
        // System.out.println(s1.compareTo(s2));

        // String s = "cat plays with cats and other ball and balls";
        // System.out.println(s.replace('c','B'));
        // System.out.println(s.replace("cat","Bat"));
        // System.out.println(s.replaceFirst("cat","Bat"));

        // String s2 = "Learn1234Java4484";
        // System.out.println(s2.replaceAll("\\d",""));

        // String s2 = "Learn  Java   ";
        // System.out.println(s2.replaceAll("\\s+"," "));


        // String s = "01234567891011";
        // System.out.println(s.substring(5));
        // System.out.println(s.substring(5,10));
        // System.out.println(s.substring(2,7));

        // System.out.println(s.contains('4')); // only takes String .. so error 
        // System.out.println(s.contains("456"));

        // System.out.println(s.indexOf('3'));
        // System.out.println(s.indexOf("345"));
        // System.out.println(s.indexOf("3457"));
        // System.out.println(s.indexOf('0',4));

        // String s = "rohan maiti";
        // System.out.println(s.toUpperCase().toLowerCase());
        // System.out.println(s); //

        // int a = 10;
        // float f = 20.8f;
        // double d = 293.833736;
        // System.out.println(String.valueOf(a));
        // System.out.println(String.valueOf(f));
        // System.out.println(String.format("%.2f",d));
        // double e = Double.parseDouble(String.format("%.2f",d));

        // double d = 10;
        // String s = String.format("%f",d);
        // System.out.println(s);

        // int a = 10;
        // float b = 10.3f;
        // System.out.println(String.format("value of a is %d", a));
        // System.out.println(String.format("value of a is %f", b));
        // System.out.println(String.format("value of a is %.2f", b));
        // System.out.println(String.format("%x", 10));
        // System.out.println(String.format("%o",38));

        // StringBuffer s1 = new StringBuffer("java");
        // s1.reverse();
        // System.out.println(s1.reverse());
        // System.out.println(s1);


        //  s1.insert(2,0);
        //  s1.insert(2,"abc");


        // String s = "java Programing is best for Coders";
        // //return the longest word;
        // String arr[] = s.split("\\s+");
        // int maxlength = 0;
        // int index = 0;
        // for(int i=0; i<arr.length; i++)
        // {
        //     if(arr[i].length()  > maxlength)
        //     {
        //         maxlength = arr[i].length();
        //         index = i;
        //     }
        // }
        // System.out.println(arr[index]);

        // StringTokenizer st = new StringTokenizer("i am rohan     maiti");
        
        // StringBuilder sb = new StringBuilder();
        // while(st.hasMoreTokens()){
        // //System.out.println(st.nextToken());
        // sb.insert(0,st.nextToken());
        // if(st.hasMoreTokens())
        // sb.insert(0," ");
        // }
        // System.out.println(sb);

        // StringBuilder s = new StringBuilder("rohan");
        // String str = s.reverse().toString();

       

        //  StringBuilder sb = new StringBuilder("rohan");
        //  char arr[] = {'a','b','c'};
        //  String s =  String.valueOf(true);
        //  System.out.println(s);


        // Atoi 
        // try {
        //   String s = "1234";
        //   int number = Integer.parseInt(s);
        //    System.out.println(number);
        // } catch (Exception e) {
           
        // }
        
        String s = "123.45.678.2";
        String arr[] = s.split("\\.");
        System.out.println(Arrays.toString(arr));
     
       

    }
}