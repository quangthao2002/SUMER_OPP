package bai8;

public class Demo {

	public static void main(String[] args) {

		CD cd1 = new CD(1, "nhac tre", 3, 20000);
		CD cd2 = new CD(2, "phim trinh tham", 5, 30000);
		CD cd3 = new CD(3, "phim hanh dong", 16, 40000);
		CD cd4 = new CD(4, "nhac thieu nhi", 15, 50000);
		CD cd5 = new CD(5, "nhac thieu nhi", 15, 50000);
		CDList cdDlist = new CDList(4);
		cdDlist.addCD(cd1);
		cdDlist.addCD(cd2);
		cdDlist.addCD(cd3);
		cdDlist.addCD(cd4);
		cdDlist.addCD(cd5);
		System.out.println("- Số lượng CD trong danh sách: " + cdDlist.getCount());
		System.out.println("- Tổng giá thành của các CD: " + cdDlist.TotalCost());
		System.out.println("---------------Thông tin các CD----------------------");
		cdDlist.InforAllCD();
		System.out.println("---------------Danh sách giảm dần theo giá thành CD----------------------");
		cdDlist.sortCDsByCostDescending();
		cdDlist.InforAllCD();
		System.out.println("---------------Danh sách tăng dần theo tựa CD----------------------");
		cdDlist.sortCDsByTitleAscending();
		cdDlist.InforAllCD();

	}

}
