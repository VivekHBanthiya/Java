// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void TowerOfHanoi(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("String transfer " + n +  " from " + source + " to " + destination);
            return;
        }
        TowerOfHanoi(n-1, source, destination, helper);
        System.out.println("String transfer " + n +  " from " + source + " to " + destination);
        TowerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n=3;
        TowerOfHanoi(n, "S", "H", "D");
    }
}