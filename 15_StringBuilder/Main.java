// * as string are immutable in java, so everytime we change any thing a whole new object is being created 
// * to solve this issue we have string builder and string buffer in java that are mutable 


class Main{
    public static void main(String []args){
        // StringBuilder s = new StringBuilder("rahul maiti");
        StringBuffer s = new StringBuffer("rahul maiti");

        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.append(" Rohan Maiti");
        System.out.println(s);
         
        s.deleteCharAt(0);
        s.insert(0, 'R');
        s.insert(0,"Java ");
        String str = s.toString();
        System.out.println(str);

        String str2 = s.substring(5,11);
        // String str2 = s.substring(5);
        System.out.println(str2);

    }
}