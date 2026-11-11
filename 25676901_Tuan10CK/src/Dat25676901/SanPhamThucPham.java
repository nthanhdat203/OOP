package Dat25676901;

import java.time.LocalDate;

public class SanPhamThucPham extends SanPham {
	private LocalDate ngayHetHan;
	
	
	public SanPhamThucPham(String maSP, String tenSP, LocalDate ngaySX, double giaNhap, int soLuongTon,
			LocalDate ngayHetHan) {
		super(maSP, tenSP, ngaySX, giaNhap, soLuongTon);
		this.ngayHetHan = ngayHetHan;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	@Override
	public double tinhGiaBan() {
		
		if (ngayHetHan.isBefore(LocalDate.now())) {
		return 0;
	}
		return giaNhap + (giaNhap*0.05);
	}
	@Override
	public String getLoai() {
		return "ThucPham";
	}

	@Override
	public String toString() {
		return "SanPhamThucPham [ngayHetHan=" + ngayHetHan + "]";
	}

}
