public class Bai2 {
     int TS, MS;
    public Bai2(int TS, int MS){
        super();
        this.TS=TS;
        this.MS=MS;
    }
    public int getTS(){
        return TS;
    }
    public void setTS(int TS){
        this.TS = TS;
    }
    public int getMS() {
        return MS;
    }
    public void setMS(int MS) {
        if(MS==0){
            System.out.println(" mau so phai lon hon 0");
            this.MS=1;
        }
        this.MS = MS;
    }
 public void inphanso(){
     System.out.println(" phan so la" +TS+ "/" +MS);
 }
    public void nghichDaoPS(){
        System.out.println(" phan so bij nghich dao la" +MS+ "/" +TS);
    }
     public void giatriPS(){
         System.out.println(" gia tri phan so la: " +TS+ "/" +MS);
     }
     public void cong2PS(Bai2 ps){
        int TS = this.getTS() * ps.getMS() + ps.getTS() * this.getMS();
        int MS = this.getMS() * ps.getMS();
        Bai2 phanSoTong = new Bai2(TS, MS);
        System.out.println("Tổng hai phân số = " + phanSoTong.TS + "/" + phanSoTong.MS);
     }
     public void tru2PS(Bai2 ps){
        int TS = this.getTS() * ps.getMS() - ps.getTS() * this.getMS();
        int MS = this.getMS() * ps.getMS();
        Bai2 phanSoTong = new Bai2(TS, MS);
        System.out.println("tru hai phân số = " + phanSoTong.TS + "/" + phanSoTong.MS);
     }
     public void nhan2PS(Bai2 ps ){
        int TS = this.getTS() * ps.getTS();
        int MS = this.getMS() * ps.getMS();
        Bai2 phanSoTich = new Bai2(TS, MS);
        System.out.println("Tích hai phân số = " + phanSoTich.TS + "/" + phanSoTich.MS);
     }
     public void chia2PS(Bai2 ps){
          int TS = this.getTS() * ps.getMS();
        int MS = this.getMS() * ps.getTS();
        Bai2 phanSoThuong = new Bai2(TS, MS);
        System.out.println("Thương hai phân số = " + phanSoThuong.TS + "/" + phanSoThuong.MS);
    }
     }
