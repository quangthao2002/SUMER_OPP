package bai9;

import java.util.Arrays;
import java.util.Iterator;

public class DanhSachCongNhan {

	private CongNhan[] dsCongNhan;
	private int count = 0;

	public DanhSachCongNhan() {

	}

	public DanhSachCongNhan(int n) {
		dsCongNhan = new CongNhan[n];
		count = 0;
	}

	public int getCount() {
		return dsCongNhan.length;
	}

	public boolean addCongNhan(CongNhan cn) {
		if (count < dsCongNhan.length) {

			dsCongNhan[count] = cn;
			count++;
			return true;
		} else {
			System.out.println("Danh sach công nhân đã đầy");
			return false;
		}
	}

	public void printAll() {
		for (int i = 0; i < dsCongNhan.length; i++) {
			System.out.println(dsCongNhan[i]);
		}
	}

	public void printOver200Products() {
		for (int i = 0; i < dsCongNhan.length; i++) {
			if (dsCongNhan[i].getmSoSP() > 200) {
				System.out.println(dsCongNhan[i]);
			}
		}
	}
	public void sortCN() {
		Arrays.sort(dsCongNhan, 0, dsCongNhan.length, (cn1, cn2) -> Integer.compare(cn2.getmSoSP(), cn1.getmSoSP()));
	}

}
