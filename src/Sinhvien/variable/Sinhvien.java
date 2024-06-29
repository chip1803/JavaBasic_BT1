package Sinhvien.variable;

public class Sinhvien {


    public void SV() {
        int total = 30;
        System.out.println("Tong so sinh vien la: " + total);
    }

    private int tuoi;
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void showStudent() {
        System.out.println("Tuoi : " + tuoi);
    }
    public  static String tenlop = " Lop 12A6" ;
    public static  int siso =30;

    public static void main(String[] args) {
        System.out.println("Ten lop: " +tenlop);
        System.out.println("Siso : " + siso);
        Sinhvien bienLocal = new Sinhvien();
        bienLocal.SV();

    Sinhvien sv = new Sinhvien();
            sv.setTuoi(25);
            sv.showStudent();

}

}
