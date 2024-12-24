public class Main{
    public static void main(String []args){
        String s1 = new String("abc");
        String s2 = new String("dndnddkskd");
        String s3 = "xyz";
        String s4 = "xyz";
        s3 = "abcdef";
        // kia hum isko change nahi karsakte ? 

        // System.out.println(s1+" "+s2+" "+s3);

        // if(s1.equals(s2)){
            // System.out.println(s1);
        // }
        // System.out.println(s1.charAt(1));
        // System.out.println(s1.concat(s2));


        // String name = "Rohan";
        // name += " Maiti";
        // System.out.println(name);


        // StringBuffer sb = new StringBuffer("Rohan");
        // sb.append(" Maiti");
        // sb.deleteCharAt(1);
        // System.out.println(sb);
        // String str = sb.toString();
        // System.out.println(str);

        String s = 10 + "#";
        char c = 'x';
        s += c;
        System.out.println(s);
    }
}