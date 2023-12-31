package bai9;

public class Demo {

	public static void main(String[] args) {
		CongNhan cn1 = new CongNhan("cn1", "ngo", "thao", 150);
		CongNhan cn2 = new CongNhan("cn2", "ngo", "thao", 200);
		CongNhan cn3 = new CongNhan("cn3", "ngo", "thao", 420);
		CongNhan cn4 = new CongNhan("cn4", "ngo", "thao", 1111130);
		
		DanhSachCongNhan listCN= new DanhSachCongNhan(4);
		listCN.addCongNhan(cn1);
		listCN.addCongNhan(cn2);
		listCN.addCongNhan(cn3);
		listCN.addCongNhan(cn4);
		
		System.out.println("1.Thông tin toàn bộ công nhân viên");
		listCN.printAll();
		System.out.println("2.Số lượng của nhân viên trong danh sách là: "+ listCN.getCount());
		System.out.println("3.Công nhân trên 200 sản phẩm");
		listCN.printOver200Products();
		System.out.println("4.công nhân theo số sản phẩm giảm dần");
		listCN.sortCN();
		listCN.printAll();
		
	}
}
