package bai8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CDList {
	private CD[] cdlist;
	private int count;

	public CDList() {
	}

	public CDList(int n) {

		cdlist = new CD[n]; //là một mảng chứa các đối tượng CD, có kích thước là n.
		count = 0; // là biến đếm số lượng CD hiện tại trong danh sách, ban đầu được khởi tạo là 0.
	}

	public int getCount() {
		return count;
	}

	public boolean addCD(CD cd) {

		if (count < cdlist.length) { //kiểm tra xem danh sách CD đã đầy hay chưa. Nếu danh sách chưa đầy, tiếp tục thêm CD vào danh sách.
			
			for (int i = 0; i < count; i++) {
				if (cd.getMaCD() == cdlist[i].getMaCD()) {
					System.out.println("Mã CD đã tồn tại");
				return false;
				}
			}
			cdlist[count] = cd; //gán đối tượng CD vào vị trí count trong mảng danh sách CD.
			count++;
			return true;
		} else {
			System.out.println("Danh sách đã đầy");
		
			return false;
		}

	}

	public void InforAllCD() {
		for (int i = 0; i < count; i++) {
			System.out.println(cdlist[i].toString());
		}

	}

	public double TotalCost() {
		double total = 0;
		for (int i = 0; i < cdlist.length; i++) {
			total += cdlist[i].getGiaThanh();
		}
		return total;
	}
	
	
	
//	Phương thức sắp xếp danh sách giảm dần theo giá thành.

	public void sortCDsByCostDescending() {
		Arrays.sort(cdlist, 0, cdlist.length, (cd1, cd2) -> Double.compare(cd2.getGiaThanh(), cd1.getGiaThanh()));
	}

// Phương thức sắp xếp danh sách tăng dần theo tựa CD
	public void sortCDsByTitleAscending() {
		Arrays.sort(cdlist,0, cdlist.length, (cd1,cd2)-> cd1.getTuaCD().compareTo(cd2.getTuaCD()));
	}

}
