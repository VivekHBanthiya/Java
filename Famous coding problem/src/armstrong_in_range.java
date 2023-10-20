import java.util.Scanner;

public class armstrong_in_range {
    public static int length(int num){
        int len = 0;
        while(num!=0){
            len++;
            num/=10;
        }
        return len;
    }
    public static int power(int n, int m){
        int pow = 1;
        while (m>0){
            pow*=n;
            m--;
        }
        return pow;
    }
    public static boolean isArmstrong(int n){
        int temp = n;
        int sum=0;
        int l = length(temp);
        int rem;
        while (temp>0){
            rem = temp%10;
            sum += power(rem,l);
            temp/=10;
        }
        return sum == n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("starting no: ");
        int start = sc.nextInt();
        System.out.print("ending no: ");
        int end = sc.nextInt();
        System.out.print("Armstrong no in range from " + start + " to " + end);
        for (int i=start; i<=end; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
}
