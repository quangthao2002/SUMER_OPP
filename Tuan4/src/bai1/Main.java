package bai1;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
	
	ArrayList<Xe> listXe= new ArrayList<>();
	double tongDoanhThuXeNoiThanh=0;
	double tongDoanhThuXeNgoaiThanh=0;
	double tongDoanhThuTatCaCacLoaiXe=0;
	Xe xeNoiThanh1= new XeNoiThanh("223", "Ngo Quang Thao", "76P1", 20000, "Hồ Chi minh", 3);
	Xe xeNgoaiThanh1 = new XeNgoaiThanh("212", "Nguyễn văn lâm", "12fc", 40000, 10, 20);
	
	listXe.add(xeNoiThanh1);
	listXe.add(xeNgoaiThanh1);
	
	for(Xe chuyenXe : listXe) {
        tongDoanhThuTatCaCacLoaiXe += chuyenXe.tinhDoanhThu();

        if (chuyenXe instanceof XeNoiThanh) {
            tongDoanhThuXeNoiThanh += chuyenXe.tinhDoanhThu();
        } else if (chuyenXe instanceof XeNgoaiThanh) {
            tongDoanhThuXeNgoaiThanh += chuyenXe.tinhDoanhThu();
        }
    }
	System.out.println(listXe);
    System.out.println("Tổng doanh thu của tất cả các chuyến xe: " + tongDoanhThuTatCaCacLoaiXe);
    System.out.println("Tổng doanh thu của chuyến xe ngoại thành: " + tongDoanhThuXeNgoaiThanh);
    System.out.println("Tổng doanh thu của chuyến xe nội thành: " + tongDoanhThuXeNoiThanh);
	
}
}
