package Dat25676901;

import java.util.*;


public class QuanLySanPham {
	  private List<SanPham> ds;

	    public QuanLySanPham() {
	        ds = new ArrayList<>();
	    }

	    public boolean themSanPham(SanPham s) {
	        if (s == null || ds.contains(s)) {
	            return false;
	        }
	        return ds.add(s);
	    }
	    
	    public SanPham timSanPham(String maSP) {
	        for (SanPham s : ds) {
	            if (s.getMaSP().equalsIgnoreCase(maSP)) {
	                return s;
	            }
	        }
	        return null;
	    }
	    
	    public boolean xoaSanPham(String maSP) {
	    	SanPham s = timSanPham(maSP);
	        if (s != null) {
	            return ds.remove(s);
	        }
	        return false;
	    }
	    
	    public boolean suaSoLuongTon(String maSP, int soLuongMoi) {
	    	SanPham s = timSanPham(maSP);
	    	
	    	if(s == null || soLuongMoi < 0){
	    		return false;
	    	}
	    	
	    	s.setSoLuongTon(soLuongMoi);
	    	return true;
	    	}
	    
	   public void xuatSanPhamTheoLoai(String loai) {
		   ds.stream().filter(s ->s.getLoai().equalsIgnoreCase(loai)).forEach(System.out::println);
	   }
	   
	   public void xuatSanPhamGiaBanCaoNhat() {
		   if(ds.isEmpty()) {
			   System.out.println("DS Rong");
			   return;
		   }
		   double max = ds.stream().mapToDouble(SanPham::tinhGiaBan).max().orElse(0);
		   ds.stream().filter(s -> s.tinhGiaBan() == max).forEach(System.out::println);		
		   }
}
