import java.util.Scanner;

public class bai4 {
    public static void name(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int tong = n*(n+1)/2;
        System.out.println(" tong tư 1 den n la " + tong);
        sc.close();
    }
    
}
