public class Variable2 {
    public static void main(String []args){
        // *RULE 1 : if assign a value such that it is out of range then it will throw an error : loosy conversion
        // ex
        // int a = 2.4;

        // *RULE 2 : for LONG
        // long a = 123; // no problem it deals 123 as a integer and converted to long implecitely
        // but if the value is big then have to tell explecitely by adding L at last
        // long a = 123456789123; // error : loosi conversion
        // System.out.println(a);

        // long a = 123456789123L; // no error | added L at last
        // System.out.println(a);

        // *RULE 2 : for float
        // any float value is treated as double literal so have to explecitely tell that it is a float by adding f at last
        // float f = 2.5; // error 
        // float f = 2.5f;// no error

        // *RULE 3 : char
        // have to write inside single cote , if write inside double cote then will throw an error
        // char c = "c"; // error
        // char c = 'c'; // no error

        // there is no const key word , inspite there is final
        // const int a = 10; // error
        // final int a = 10; // no error

        // *LITERALS
        // int binary = 0b0010; // 0b represent binary
        // System.out.println(binary);

        // int binary = 0b0310; // 0b represent binary so have to give only one or zero 
        // System.out.println(binary);

        // int octal = 027; // octal start with 0 and all digita should be less than or equal to 7
        // System.out.println(octal);
        // what of digits are more than 7
        // int octal = 028; // will give error
        // System.out.println(octal);

        // int hex = 0x2F; // hexa decimal start with 0x hand the digits should be 0-9 and A-F || if othen than these digits then it will throw error
        // System.out.println(hex);

        // *RULE 4 : String | have to write inside double cote if writen inside single cote then will give error
        // String s = 'abc';   // error
        // System.out.println(s);
        // String s = "abc";
        // System.out.println(s);

        // *STRING LITERALS
        // System.out.println("abc\bdef");  // backspace
        // System.out.println("abc\tdef");  // tab
        // System.out.println("abc\ndef");  // new line
        // System.out.println("abc\sdef");  // one space
        // System.out.println("abc\"de\"f");// ignore case : will ignore the syntax error if any other wise will throw an error
        // System.out.println("abc\de\f"); // no syntax error for ignore case , so will give error

        // *TYPECASTING
        // Explecite               and                  Implecite 
        // have to done manually                        done automatically

        // Implecite 
        // int b = 20;
        // float a = b;
        // No problem as float can hold integer 

        // Explecite
        // float b = 20.1;
        // int a = b; // will give error
        // System.out.println(a);

        // fixing it 
        // float b = 20.1f;
        // int a = (int)b; 
        // System.out.println(a);

    }
    }

