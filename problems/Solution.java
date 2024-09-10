import java.util.Map;
import java.util.HashMap;
public class Solution {
    public static void main(String []args){
    // System.out.println(wordPattern("abba","dog cat cat dog"));
    // System.out.println((double)(1/3));
    // String s = "1/2+3/3+4/2+3/6";
    // String arr[] = s.split();
    // for(int i=0;i<arr.length;i++)
    // {
      // System.out.println((double)(1/2));
    // } 

    // double result =;
    System.out.println( (double) 1 / 3);  
    }
    public static boolean wordPattern(String pattern, String s) {
          String []arr = s.split(" ");
          char patterns[] = pattern.toCharArray();
          if(arr.length != patterns.length)
          return false;

          
          Map <Character,String> m = new HashMap<>();
          for(int i=0; i<arr.length; i++)
          {
          System.out.println(m);

            if(m.get(patterns[i])== null){
                m.put(patterns[i],arr[i]);
            }
            else if(m.get(patterns[i]).equals(arr[i]))
            {
             continue;
            }
            else{
             return false;
            }
          }
          return true;
    }
}