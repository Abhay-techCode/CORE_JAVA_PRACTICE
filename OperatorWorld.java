public class OperatorWorld {
    public static void main(String[] args) {
        int x=10;
        int y=12;
        if (x<y)
            System.out.println("Correct y is big");
        else
            System.out.println("Wromg y is small");

        String ans=(x<y)?"Y IS gREATER":"X IS GREATER";
        System.out.println(ans);
        boolean b =(x<y)? true:false;
        System.out.println(b);

        if (x<y & y==12)        //check the both condition compulsary and bitwise also work as a AND
            System.out.println("Greater is y =12");
        else
            System.out.println("no   ");

    }
}
/*&& is a Short Circuit because if first con false then it not checks another