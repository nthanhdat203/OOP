package Dat25676901;

import java.time.LocalDate;

public class DanhSachHoaDon {
    private HoaDon[] danhSach;
    private int count;

    public DanhSachHoaDon(int n) {
        danhSach = new HoaDon[n];
        count = 0;
    }

    public boolean them(HoaDon hd) {
        if (count >= danhSach.length || hd == null) {
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (danhSach[i].equals(hd)) {
                return false;
            }
        }

        danhSach[count++] = hd;
        return true;
    }

    public void xuat() {
        System.out.printf("%-12s %-12s %-20s %-10s %-12s %-15s %-15s%n",
                "Ma HD", "Ngay HD", "Ten KH", "Ma phong",
                "Don gia", "Loai HD", "Thanh tien");

        for (int i = 0; i < count; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public int thongKeSoLuongHDTheoGio() {
        int dem = 0;

        for (int i = 0; i < count; i++) {
            if (danhSach[i] instanceof HoaDonTheoGio) {
                dem++;
            }
        }

        return dem;
    }

    public int thongKeSoLuongHDTheoNgay() {
        int dem = 0;

        for (int i = 0; i < count; i++) {
            if (danhSach[i] instanceof HoaDonTheoNgay) {
                dem++;
            }
        }

        return dem;
    }

    public double tinhTongThanhTien(int thang, int nam) {
        double tong = 0;

        for (int i = 0; i < count; i++) {
            LocalDate ngay = danhSach[i].getNgayHoaDon();

            if (ngay.getMonthValue() == thang
                    && ngay.getYear() == nam) {
                tong += danhSach[i].tinhThanhTien();
            }
        }

        return tong;
    }
}