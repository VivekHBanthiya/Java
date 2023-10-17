public class Swap {
    /*
    Swing elements without  using 3rd element
    */
    public static void main(String[] args) {
        int a = 23;
        int b = 84;
        System.out.println("before");
        System.out.println("a: "+ a);
        System.out.println("b: " + b);
        System.out.println("After");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}