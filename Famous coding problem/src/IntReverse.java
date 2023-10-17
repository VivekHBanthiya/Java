public class IntReverse {
    public static void revers(int n){
        int rev=0,rem;
        while(n!=0){
            rem=n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        System.out.print(rev);
    }
    public static void main(String[] args){
        int n= 1234;
        System.out.println("original: " + n);
        System.out.println("reverse: " + Integer.reverse(n));
        revers(n);
    }
}
