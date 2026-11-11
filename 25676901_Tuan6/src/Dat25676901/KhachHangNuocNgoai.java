package Dat25676901;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;
    private int soKW;
    private double donGia;

    public KhachHangNuocNgoai(String maKH, String hoTen,
                              LocalDate ngayLapHoaDon,
                              String quocTich, int soKW,
                              double donGia) {
        super(maKH, hoTen, ngayLapHoaDon);
        this.setQuocTich(quocTich);
        this.soKW = soKW;
        this.donGia = donGia;
    }

    @Override
    public double tinhThanhTien() {
        return soKW * donGia;
    }

    @Override
    public String getLoaiKhachHang() {
        return "Nuoc ngoai";
    }

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
}