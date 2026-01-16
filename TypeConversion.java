public class TypeConversion {
    public static void main(String[] args) {
        int x = 10;
        long y=x;
        double d =x;
        float f = x;
        System.out.println(y+"\n"+d+"\n"+f);
        // implicit type casting also known as widening which given by java itself
        double h = 24.3265;
        int a = (int)h; //Explicit type casting causes data to be loss that accutually happen st some instances
        System.out.println(a);      //ALSO CALLED AS NARROWING
        char c = 'a';
        int ab = c;     //gives an ASCII VALUE'S RESP
        System.out.println(ab);
    }
}
