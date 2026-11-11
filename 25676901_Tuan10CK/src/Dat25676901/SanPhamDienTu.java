package Dat25676901;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham {
	private int thoiGianBaoHanh;
	
		public SanPhamDienTu(String maSP, String tenSP, LocalDate ngaySX, double giaNhap, int soLuongTon,
			int thoiGianBaoHanh) {
		super(maSP, tenSP, ngaySX, giaNhap, soLuongTon);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}



	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}



	@Override
	public double tinhGiaBan() {
		// TODO Auto-generated method stub
		return giaNhap + (giaNhap * 0.1) + (thoiGianBaoHanh * 50000);
	}

	@Override
	public String getLoai() {
		return "Dien Tu";
	}



	@Override
	public String toString() {
		return "SanPhamDienTu [thoiGianBaoHanh=" + thoiGianBaoHanh + "]";
	}

}
