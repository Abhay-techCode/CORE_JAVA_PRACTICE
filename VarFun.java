public class VarFun {
        int x = 20;     //instance variable(non static)
        static int y = 40;  //static variable
    public static void main(String[] args) {
        VarFun v = new VarFun();
        int z = 12;     //local variable
        System.out.println("instance variable="+v.x);
        System.out.println("local var="+z);
        System.out.println("Static variable ="+VarFun.y);
        System.out.println(y);
        System.out.println(v.y);

    }
}
