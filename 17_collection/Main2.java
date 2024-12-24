


public class Main2{
    public static void main(String []args){
        // List <Integer> list1 = new ArrayList<>();
        // list1.add(10);
        // list1.add(20);
        // list1.add(30); 
        // list1.add(40);
        // list1.add(2,100); // at index, element
        // System.out.println("initial list : "+list1);
        // ArrayList <Integer> list2 = new ArrayList<>();
        // list2.add(1000);
        // list2.add(2000);
        // list2.add(3000);
        // list2.add(4000);
        // list1.addAll(list2);
        // System.out.println("After addAll() : "+list1);
        // list1.set(1,200);
        // System.out.println("After setting 200 at index 1"+list1);
        // list1.remove(3); // index
        // System.out.println("After remove(0)  index wise"+list1);
        // list1.remove(Integer.valueOf(3000));
        // System.out.println("After remove(Integer.valueOf(3000))  value wise which not +nt"+list1);
        // list1.remove(Integer.valueOf(30));  // value
        // System.out.println("After remove(Integer.valueOf(30))  value wise which is +nt"+list1);
        // // list1.clear();
        // // System.out.println(list1);
        //   System.out.println("lis1.contains(10) : "+list1.contains(10));
        //   System.out.println("lis1.contains(1010) : "+list1.contains(1010));
        //   System.out.println("lis1.indexOf(20) : "+list1.indexOf(10));
        //   System.out.println("lis1.indexOf(2020) : "+list1.indexOf(2020));
        // System.out.println(list1.getFirst());
        // System.out.println(list1.getLast());
        // System.out.println(list1.get(0));
        // for(int i=0;i<list1.size();i++)
        // {
        //     System.out.print(list1.get(i)+"-");
        // }
        // for(Integer i: list1){
        //      System.out.print(i+"-");
        // }
        // Iterator<Integer> it = list1.iterator();
        // while(it.hasNext())
        // System.out.print(it.next()+"--");
        // *** LinkedList
        // LinkedList <Integer> list = new LinkedList<>();
        // list.offerFirst(10);
        // list.offerFirst(20);
        // list.offerFirst(30);
        // list.offerLast(40);
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.addFirst(100);
        // list.addLast(200);
        // System.out.println(list);
        // System.out.println(list.peek()); 
        // System.out.println(list.get(2));
        // *** Stack 
        // Stack<Integer> stk = new Stack<>();
        // stk.push(10);
        // stk.push(20);
        // stk.push(30);
        // System.out.println(stk);
        // System.out.println(stk.pop());
        // System.out.println(stk);
        // System.out.println(stk.peek());
        // System.out.println(stk.contains(100));
        // System.out.println(stk.contains(10));
        // System.out.println(stk.isEmpty());
        // stk.clear();
        // System.out.println(stk.empty());



        // *** HashSet ***
        // Set<Integer> s = new HashSet<>();
        // s.add(10);
        // s.add(20);
        // s.add(30);
        // s.add(40);
        // s.add(50);
        // s.add(50);

        // s.remove(100); // removes element
        // System.out.println(s.contains(30));

        // for(int i:s){
        //     System.out.println(i);
        // }

        // System.out.println(s.size());

       

        // *** HashMap **
        // Map<Integer,Integer> m = new HashMap<>();
        // int arr[] = {1,2,3,4,5,6,2,3,1,100,4,6,4,3,2,2,3,4,9};
        // for(int i=0;i<arr.length;i++)
        // m.put(arr[i],m.getOrDefault(arr[i],0)+1);

        // System.out.println(m);
        // System.out.println(m.get(100));
        // System.out.println(m.get(1));

        // triversing type-01
        // for(int i : m.keySet()){
        //     System.out.print(i+":"+m.get(i)+" ,");
        // }
        // System.out.println();
        // System.out.println(m.values());
        // System.out.println(m.containsKey(200));
        // System.out.println(m.containsValue(2));


        // triversing type-02
        // for(Map.Entry<Integer,Integer> e : m.entrySet())
        // {
        //     System.out.println(e.getKey() + ":"+e.getValue());
        // }

    }
}