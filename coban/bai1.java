//package java co ban;


import java.io.*;
import java.util.Scanner;
public class bai1 {
   public static void main(String[] args){
    String chuoi;
    char SoKyTu;
    System.out.println(" nhap chuỗi vào màn hình ");
    Scanner scanner = new Scanner(System.in);
    chuoi = scanner.nextLine();

System.out.println(" chuỗi ký tự là: ");
for(int i=0; i<chuoi.length(); i++)
{
    SoKyTu = chuoi.charAt(i);
    System.out.println(SoKyTu);
}
}
}
