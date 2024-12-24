
import java.util.*;

public class Main{
    public static void main(String []args){
         ArrayList<Pair> l = new ArrayList<>();
         l.add(new Pair(2,3));
         l.add(new Pair(2,5));
         l.add(new Pair(2,2));
         l.add(new Pair(2,8));
         HashMap<Integer, Integer> m = new HashMap<>();
     
            l.sort((p1, p2) -> {
                if (p1.a != p2.a) {
                    return Integer.compare(p2.a, p1.a); // Sort by `a` in descending order
                } else {
                    return Integer.compare(p2.b, p1.b); // Sort by `b` in descending order
                }
            });
         for(var x: l )
         System.out.println(x.a+" "+x.b);
    }
}
class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
}