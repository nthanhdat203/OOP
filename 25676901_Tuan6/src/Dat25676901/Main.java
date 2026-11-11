package Dat25676901;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<KhachHang> ds = new ArrayList<>();

        ds.add(new KhachHangVietNam("VN01", "Nguyen Van A",
                LocalDate.of(2018, 9, 10),
                "Sinh hoat", 150, 2000, 100));

        ds.add(new KhachHangVietNam("VN02", "Tran Van B",
                LocalDate.of(2018, 8, 15),
                "Kinh doanh", 80, 2500, 100));

        ds.add(new KhachHangVietNam("VN03", "Le Van C",
                LocalDate.of(2018, 9, 20),
                "San xuat", 200, 1800, 150));

        ds.add(new KhachHangNuocNgoai("NN01", "John",
                LocalDate.of(2018, 9, 12),
                "My", 120, 3000));

        ds.add(new KhachHangNuocNgoai("NN02", "David",
                LocalDate.of(2018, 7, 10),
                "Anh", 100, 3000));

        ds.add(new KhachHangNuocNgoai("NN03", "Peter",
                LocalDate.of(2018, 9, 25),
                "Phap", 150, 3000));

        int demVN = 0;
        int demNN = 0;
        double tongNN = 0;

        System.out.println("DANH SACH HOA DON");

        for (KhachHang kh : ds) {
            System.out.println(kh);

            if (kh instanceof KhachHangVietNam) {
                demVN++;
            } else if (kh instanceof KhachHangNuocNgoai) {
                demNN++;
                tongNN += kh.tinhThanhTien();
            }
        }

        System.out.println("So luong khach hang Viet Nam: " + demVN);
        System.out.println("So luong khach hang nuoc ngoai: " + demNN);

        if (demNN > 0) {
            System.out.println("Trung binh thanh tien khach hang nuoc ngoai: "
                    + tongNN / demNN);
        }

        System.out.println("\nHOA DON THANG 09 NAM 2018");

        for (KhachHang kh : ds) {
            if (kh.getNgayLapHoaDon().getMonthValue() == 9
                    && kh.getNgayLapHoaDon().getYear() == 2018) {
                System.out.println(kh);
            }
        }
    }
}