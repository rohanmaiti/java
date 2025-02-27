public class Operator {
    public static void main(String[] args) {
        // int a = 10;
        // System.out.println(Integer.toBinaryString(a));
        // int b = a>>1;
        // System.out.println(Integer.toBinaryString(b));


        // *BITWISE UNSIGHNED Right shift
        // *Here, the vacant leftmost position is filled with 0 instead of the sign bit. For example,
        int number1 = 8;
        int number2 = -8;
        
        System.out.println(Integer.toBinaryString(number2));
        // binary representation of -8 is 11111111111111111111111111111000
        //                                00111111111111111111111111111110
        // after >>> 2 last 2 digits will be removed and in the bigining 2 zeros will get added
        long x = 0b00111111111111111111111111111110; // this is the out put of -8 >>> 2
        System.out.println(x);
        // 2 bit signed right shift
        System.out.println(number1 >>> 2);    // prints 2
        System.out.println(number1 >>  2);    // prints 2
        System.out.println(number2 >>> 2);    // prints 1073741822
    }
}
