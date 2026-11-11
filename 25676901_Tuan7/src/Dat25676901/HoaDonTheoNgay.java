package Dat25676901;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;

    public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon,
                          String tenKhachHang, String maPhong,
                          double donGia, int soNgayThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }

    @Override
    public double tinhThanhTien() {
        if (soNgayThue > 7) {
            return 7 * donGia + (soNgayThue - 7) * donGia * 0.8;
        }

        return soNgayThue * donGia;
    }

    @Override
    public String getLoaiHoaDon() {
        return "Theo ngay";
    }
}