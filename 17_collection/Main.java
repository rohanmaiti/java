import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
public class Main{
public static void main(String args[]){
    // Collection c = new ArrayList<>();
    // c.add(10);
    // c.add(20);
    // c.add(30);
    // c.add(40);
    // System.out.println(c);
    

    // for(Object i : c){   // sob class er baba holo Object class
    //     System.out.println((Integer)i);    
    // }

    // Collection c = new ArrayList();
    // c.add(10);
    // c.add(20);
    // c.add(30);
    // c.add("40");
    // System.out.println(c);

    // for(Object i : c){
    //     System.out.println((Integer)i);    
    // }



    // *********** ********** //
    // Collection<Integer> c = new ArrayList<Integer>();
    // c.add(10);
    // c.add(20);
    // c.add(30);
    // c.add(40);
    // //// c.add("50");
    // System.out.println(c);

    // for(int i : c){
    //     System.out.println(i);    
    // }


    /* ************* */
    // List have index access 
    // List<Integer> c = new ArrayList<Integer>();
    // c.add(10);
    // c.add(20);
    // c.add(30);
    // c.add(40);
    // c.add(50);
    // //// c.add("50");
    // c.remove(Integer.valueOf(50));
    // System.out.println(c);

    // for(int i : c){
    //     System.out.println(i);    
    // }
    // for(int i=0;i<4;i++)
    // System.out.println(c.get(i));
    // System.out.println(c.indexOf(30));

    /* ************ */ 
    //Set does not have index values and unorganised and also not sorted and does not contain repeated values
    Set <Integer> s = new HashSet<>();
    s.add(10);
    s.add(10);
    s.add(40);
    s.add(30);
    s.add(20);
    s.add(10);
    // System.out.println(s);
    // // s.remove(10);
    // System.out.println(s);

    // System.out.println(s.contains(20));
    // System.out.println( s.size());
    // s.clear();
    // System.out.println(s);
    

    // s.addAll(Collection)
    // for(int i : s){
    //     System.out.print(i+"-");
    // }
    // System.out.println();
    
    // Collection<Integer> s2 = new TreeSet<>(); // we can store variable of TreeSet in Collection as Collection is the parent of it ;
    // s2.add(10);
    // s2.add(10);
    // s2.add(40);
    // s2.add(30);
    // s2.add(20);
    // s2.add(10);
    // System.out.println(s2);  // sorted order


    // Iterator<Integer> values = s2.iterator();
    // System.out.println(values.hasNext());   
    // System.out.println(values.next());   
    // while(values.hasNext())
    // {
    //     System.out.print(values.next()+" ");
    // }


    Map<Character,Integer> m = new HashMap<Character,Integer>();

    m.put('a',10);
    m.put('b',20);
    m.put('c',40);
    m.put('d',10);// overwrite it 

    // // m.remove('a');
    System.out.println(m);
    // System.out.println(m.keySet());  
    // System.out.println(m.values());  
    // System.out.println(m.containsKey('e'));  
    // System.out.println(m.containsValue(10));  


    System.out.println(m.get('x'));
    // System.out.println(m.get("a"));

    // System.out.println(m.keySet());
    // for(String key : m.keySet())
    // {
    //     System.out.println(key + " : "+ m.get(key));
    // }
    

    // ****** counting frequency ********
    // HashMap<Integer,Integer> m = new HashMap<>();
    // int arr[] = {2,1,2,2,4};
    // for(int i=0;i<arr.length;i++)
    // {
    //  if(m.get(arr[i]) != null)
    //  {
    //   m.put(arr[i],m.get(arr[i])+1);
    //  }
    //  else{
    //     m.put(arr[i],1);
    //  }
    // }
    // System.out.println(m);

    // ** another method **
    // HashMap<Integer,Integer> m = new HashMap<>();
    // int arr[] = {2,1,2,2,4};
    // for(int i=0;i<arr.length;i++)
    // {
    //     m.put(arr[i],m.getOrDefault(arr[i],0)+1);
    // }
    // System.out.println(m.keySet());
    // System.out.println(m.values());
    // System.out.println(m);
    

    // Stack<Integer> stk = new Stack<>();
    // stk.push(10);
    // stk.push(20);
    // stk.push(30);
    // System.out.println(stk.peek());
    // System.out.println(stk.contains(10));
    // System.out.println(stk);
    // // System.err.println(stk.pop());
    // System.out.println(stk);
    // System.out.println(stk.elementAt(1));
    // System.out.println(stk.search(10));
    // System.out.println(stk.empty());

    // Queue<Integer> q = new LinkedList<>();
    // q.offer(10);
    // q.offer(20);
    // q.offer(30);
    // q.offer(40);

    // System.out.println(q.peek());
    // System.out.println(q.poll());
    // System.out.println(q);
    // System.out.println(q.isEmpty());
    
    // Queue<Integer> pq = new PriorityQueue<>();
    //  pq.offer(20);
    //  pq.offer(30);
    //  pq.offer(10);
    //  pq.offer(40);
    //  pq.offer(5);
    
    // System.out.println(pq);
    // // pq.poll();
    // System.out.println(pq.peek());


    // ArrayDeque<Integer> adq = new ArrayDeque<>();
    // adq.addAll(q);
    // adq.offer(10);
    // adq.offer(30);
    // adq.offer(40);
    // adq.offer(50);

    // adq.offerFirst(5);
    // adq.offerLast(5);

    // System.out.println(adq);
    // q.clear();
    // q.addAll(adq);
    // System.out.println(q);
    // char a = 'A';
    // int b =  a + 3;
    // char c = (char)b;
    // System.out.print(c);

    // String s = new String();
    // System.out.println(s);

   // codequotient
   // c1 o2 d1 e2 q1 u1 t2 i1 n1 

//    String s = "codequotient";
//    HashMap<Character,Integer> m = new LinkedHashMap<>();
//    char arr[] = s.toCharArray();
//    for(int i=0;i<arr.length;i++)
//    {
//     m.put(arr[i],m.getOrDefault(arr[i], 0)+1);
//    }
//    System.out.println(m); 

// int arr1[] = {10,11,12};
// int arr2[] = {10,11,12};
// System.out.println(Arrays.equals(arr1, arr2));

/*
2  // Test Cases
5               // n (testcase 1)
1 3 4 6 7       // arr[]
9               // k
6               // n (testcase 2)
-3 -1 4 5 7 12  // arr[]
7       
*/

// HashMap<Integer,Integer> m = new LinkedHashMap<>();
// int k = 7;
// int arr[] = {-3 ,-1 ,4 ,5 ,7 ,12};
// for(int i=0;i<arr.length;i++){
//     int x = k - arr[i];
//     if(m.containsKey(x)){
//         System.out.println("found");
//         break;
//     }
//     m.put(arr[i],0);
// }
    // X obj = new Y();
    // obj.method1();

    }
}
 
// interface  A{
//     void method1();
// } 
// interface  B{
//     void method1();
// }
// abstract class X implements  A,B{
// abstract public void method1();
// void method1(int a){
//     System.out.println("Inside X int");
// }
// }
// class Y extends X{
//     public void method1(){
//     System.out.println("Inside Y ");
//     }
//     public void method1(int a){
//     System.out.println("Inside Y int");
//     }
// }