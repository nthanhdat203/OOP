package Dat25676901;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class SanPham {
	protected String maSP, tenSP;
	protected LocalDate ngaySX;
	protected double giaNhap;
	protected int soLuongTon;
	
	protected static final DateTimeFormatter DTF =
			DateTimeFormatter.ofPattern("dd/MM/yyyy");
	protected static final NumberFormat VND =
			NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
	public SanPham(String maSP, String tenSP, LocalDate ngaySX, double giaNhap, int soLuongTon) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.ngaySX = ngaySX;
		this.giaNhap = giaNhap;
		this.soLuongTon = soLuongTon;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public static DateTimeFormatter getDtf() {
		return DTF;
	}
	public static NumberFormat getVnd() {
		return VND;
	}
	public abstract double tinhGiaBan();
	
	public abstract String getLoai();
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", ngaySX=" + ngaySX + ", giaNhap=" + giaNhap
				+ ", soLuongTon=" + soLuongTon + "]";
	}
	
	
}
