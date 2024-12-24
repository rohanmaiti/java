// return the largest substring without repeating character;
import java.util.Map;
import java.util.HashMap;
class Problem3 {
     public static void main(String []args){
        // System.out.println(lengthOfLongestSubstring("pwwkew"));
        double d = 2.33556d;
        System.out.println(Math.round(d,2));
     }
     public static int lengthOfLongestSubstring(String s) {
        char arr[] = s.toCharArray();
        int L = 0, R = 0 , maxL = 0;
        int newL =0, newR=0;
        Map<Character,Integer> m = new HashMap<>();
        while(R < arr.length){
            if(m.get(arr[R]) == null){
               m.put(arr[R],R);
            }
            else if(m.get(arr[R]) != null){
                if(m.get(arr[R])>=L){
                 L = m.get(arr[R]) + 1;
                 m.put(arr[R],R);
                }else{
                m.put(arr[R],R);
                }
            }
            if((R-L+1) >= maxL)
            {
             newR = R;
             newL = L;
            }
            maxL = Math.max(R-L+1 , maxL);
           
            R++;
        }
        String str = s.substring(newL ,newR+1);
        System.out.println(str);
        return maxL;
      
    }
}