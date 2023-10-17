import java.util.Locale;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String A = sc.next();
        char ch;
        String rev="";
        for(int i=0; i<A.length(); i++){
            ch=A.charAt(i);
            rev=ch+rev;
        }
        System.out.print(rev);
    }
}
