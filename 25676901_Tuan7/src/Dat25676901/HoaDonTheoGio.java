package Dat25676901;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon {
    private int soGioThue;

    public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon,
                         String tenKhachHang, String maPhong,
                         double donGia, int soGioThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
    }

    @Override
    public double tinhThanhTien() {
        if (soGioThue > 30) {
            return 0;
        }

        if (soGioThue > 24) {
            return 24 * donGia;
        }

        return soGioThue * donGia;
    }

    @Override
    public String getLoaiHoaDon() {
        return "Theo gio";
    }
}