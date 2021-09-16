//package java co ban;

public class bai2 {
    public static void name(String[] args) {
        System.out.println(" nhap so nguyên ");
        for(int i=0; i<100; i++)
        {
            if(kiemtra(i)){
                System.out.print(i + " so nguyen to " );
            }

        }
    }
    public static boolean kiemtra(int n){
        if(n<2){
            return false;
        }
else
{
    for(int i=2; i< Math.sqrt(n); i++){
        if(n % i == 0 ){
return false;
        }
    }
}
return false;
    }

    }