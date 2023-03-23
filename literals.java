// Write a program to perform all types of Literals.

public class literals {
    public static void main(String[] args) {
        int i = 10;
        int Octal_int = 022;
        int hexa_dec = 0x4a;
        int binary = 0b11010;
        String name = "name";
        String _null = null;
        float leng = 155.4f;
        double _double = 3257.56;
        boolean b = true;
        char ch = 'a';
        char lit = '\u0021';
        System.out.println("\n\tLiterals");
        System.out.println("======================");
        System.out.println("\tInteger");
        System.out.println("int Literal : "+i);
        System.out.println("Octal int Literal : "+Octal_int);
        System.out.println("Hexa Decimal int Literal : "+hexa_dec);
        System.out.println("Binary int Literal : "+binary);
        System.out.println("======================");
        System.out.println("\tString");
        System.out.println("String Literal : "+name);
        System.out.println("Null String Literal : "+_null);
        System.out.println("======================");
        System.out.println("\tFloat");
        System.out.println("float Literal : "+leng);
        System.out.println("======================");
        System.out.println("\tCharacter");
        System.out.println("char Literal : "+ch);
        System.out.println("Unicode char Literal : "+lit);
        System.out.println("======================");
        System.out.println("\tDouble");
        System.out.println("double Literal : "+_double);
        System.out.println("======================");
        System.out.println("\tBoolean");
        System.out.println("boolean Literal : "+b+"\n");
    }    
}
