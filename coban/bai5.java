import java.util.Scanner;

public class bai5 {
    public static void name(String[] args) {
        int a;
        double p, tong=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap day so a vào ");
        a = sc.nextInt();
        for(int i = 0; i < a; i++)
        {
            p = sc.nextDouble();
            if(p>0)
            {
                tong +=p;
            }
        }
        System.out.println(" tong so tren day là" + tong);
        sc.close();
    }
}
