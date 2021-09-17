import java.util.Set;
import java.util.Scanner;
public class bai1 {
    int x,y;
    public bai1(){
        super();
    }
    public bai1(int a, int y){
        setX(x);
        setY(y);
    }
    
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void ganToaDo(int x, int y){
        setX(x);
        setY(y);
    }
    public void nhapTD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("toa do x: "); x = sc.nextInt();
        System.out.println("toa do y: "); y = sc.nextInt();
        ganToaDo(x, y);
        sc.close();
    }
    public void xemTD(){
        System.out.println("Toa do diem la: ("+x+","+y+")");
    }
    public double kc(){
        return (Math.sqrt(x*x + y*y));
    }
    public static void main(String[] args) {
        bai1 tdo = new bai1();
        bai1 tdo1 = new bai1(3,2);
        tdo.nhapTD();
        tdo.xemTD();
        System.out.println("Khoang cach"+ tdo.kc());
        tdo1.xemTD();
        System.out.println("Khoang cach"+ tdo1.kc());
    }
}

