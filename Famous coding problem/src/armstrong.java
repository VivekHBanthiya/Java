public class armstrong {
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
    public static void Armstrong(int n){
        int temp = n;
        int sum=0;
        int l = length(temp);
        int rem;
        while (temp>0){
            rem = temp%10;
            sum += power(rem,l);
            temp/=10;
        }
        if(sum == n){
            System.out.print( n + " is an Armstrong no");
        }
        else
            System.out.print("No " + n + " is not an Armstrong no");

    }
    public static void main(String[] args){
        Armstrong(370);
    }
}
