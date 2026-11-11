package Dat25676901;


import java.util.Scanner;

public class TestSanPham {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 QuanLySanPham s = new QuanLySanPham();
	     khoiTaoDuLieuMau(s);
	     
	     int chon;
	        do {
	            inMenu();
	            System.out.print("Nhap lua chon cua ban: ");
	            chon = Integer.parseInt(sc.nextLine());

	            switch (chon) {
	                case 1:
	                    themSanPham(s);
	                    break;
	                case 2:
	                    System.out.print("Nhap ma phong can tim: ");
	                    String maTim = sc.nextLine();
	                    SanPham pTim = s.timSanPham(maTim);
	                    if (pTim != null) {
	                        System.out.println("Tim thay: " + pTim);
	                    } else {
	                        System.out.println("Khong tim thay phong co ma: " + maTim);
	                    }
	                    break;
	                case 3:
	                    System.out.print("Nhap ma phong can xoa: ");
	                    String maXoa = sc.nextLine();
	                    SanPham pXoa = s.timSanPham(maXoa);
	                    if (pXoa != null) {
	                        System.out.println("Thong tin phong: " + pXoa);
	                        System.out.print("Ban co chac chan muon xoa phong nay khong? (Y/N): ");
	                        String xacNhan = sc.nextLine();
	                        if (xacNhan.equalsIgnoreCase("Y")) {
	                            s.xoaSanPham(maXoa);
	                            System.out.println("Da xoa phong hoc thanh cong.");
	                        } else {
	                            System.out.println("Da huy thao tac xoa.");
	                        }
	                    } else {
	                        System.out.println("Khong tim thay phong co ma: " + maXoa);
	                    }
	                    break;
	                case 0:
	                    System.out.println("Da thoat chuong trinh.");
	                    break;
	                default:
	                    System.out.println("Lua chon khong hop le!");
	            }
	        } while (chon != 0);
	        
	        
	    }

	private static void khoiTaoDuLieuMau(QuanLySanPham s) {
		// TODO Auto-generated method stub
		
	}

	private static void themSanPham(QuanLySanPham s) {
		// TODO Auto-generated method stub
		
	}

	private static void inMenu() {
		 System.out.println("\n================ MENU QUAN LY San Pham ================");
	        System.out.println("1. Them mot San Pham ");
	        System.out.println("2. Tim San Pham");
	        System.out.println("3. Xoa San Pham");
	        System.out.println("4. Sua So Luong Ton");
	        System.out.println("5. Xuat San Pham Theo Loai");
	        System.out.println("6. xuatSanPhamGiaBanCaoNhat");
		
	}
	}


