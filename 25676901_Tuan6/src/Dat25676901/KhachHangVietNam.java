package Dat25676901;

import java.time.LocalDate;

public class KhachHangVietNam extends KhachHang {
    private String doiTuong;
    private int soKW;
    private double donGia;
    private int dinhMuc;

    public KhachHangVietNam(String maKH, String hoTen,
                            LocalDate ngayLapHoaDon,
                            String doiTuong, int soKW,
                            double donGia, int dinhMuc) {
        super(maKH, hoTen, ngayLapHoaDon);
        this.setDoiTuong(doiTuong);
        this.soKW = soKW;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhThanhTien() {
        if (soKW <= dinhMuc) {
            return soKW * donGia;
        }

        return dinhMuc * donGia
                + (soKW - dinhMuc) * donGia * 2.5;
    }

    @Override
    public String getLoaiKhachHang() {
        return "Viet Nam";
    }

	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
}
