import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhap a ");
		a = sc.nextInt();
		System.out.printf("nhap b ");
		b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(" nhap c ");
		if (a == 0) {
			if (b == 0) {
				System.out.println("pt vo nghiem");
			} else {
				System.out.println("pt co 1 nghiem" +(-c/b));
			}
		} else {
			double denta = b*b -(4*a*c);
            if(denta<0)
            System.out.println(" phuong trinh vo nghiem ");
            else if (denta>0)
            {
                double x = (double)(-b/(2*a));
                System.out.println(" pt có nghiệm kép " + x);
            }
            else {
                double x1 = (double) ((b + Math.sqrt(denta))/(2*a*c));
                System.out.println(" nghiem x1" + x1);
                double x2 = (double) ((b - Math.sqrt(denta))/(2*a*c));
                System.out.println("nghiem x2" + x2);
            }
		}
	}

}

