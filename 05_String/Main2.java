public class Main2{
    public static void main(String []args){
        // equalsIgnoreCase();
        String s1 = "rohan";
        String s2 = "RoHan";
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "rohan" + "maiti";
        System.out.println(s3);

        s3 = s3.concat(" 1314"); //returns string
        System.out.println(s3);

    }
}