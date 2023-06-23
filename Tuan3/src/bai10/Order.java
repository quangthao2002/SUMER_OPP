package bai10;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private ArrayList<OrderDetail> lineItems = new ArrayList<>();
	private int count;

	public Order() {

	}

	public Order(int orderID, LocalDate orderDate) {
		this.orderID = orderID;
		this.orderDate = orderDate;
	
	}
	
	public void addLineItem(Product pd, int sl) {
		
		lineItems.add(new OrderDetail(sl, pd));
		
	}
	public double calcTotalCharge() {
		int sum=0;
		for(OrderDetail orderDetail : lineItems) {
			sum += orderDetail.calcTotalPrice();
		}
		return sum;
	}
	
	public ArrayList<OrderDetail> getLineItems() {
		return lineItems;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public void setLineItems(ArrayList<OrderDetail> lineItems) {
		this.lineItems = lineItems;
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Mã HD=").append(orderID).append(", ");
	    sb.append("Ngày lập hóa đơn=").append(orderDate)
	      .append("\n");
//	    sb.append("+----------+------------------+----------------+-------------+---------------+\n");
	    sb.append("| Mã SP    |     Mô tả        |  Đơn giá       |   Số Lượng  |   Thành tiền  |\n");
//	    sb.append("+----------+------------------+----------------+--------------+--------------|\n");

	    for (OrderDetail orderDetail : lineItems) {
	        sb.append(String.format("| %-8s | %-16s | %-13.3f  | %-11d | %-13.3f |\n",
	                orderDetail.getProduct().getProductID(),
	                orderDetail.getProduct().getDescription(),
	                orderDetail.getProduct().getPrice(),
	                orderDetail.getQuantity(),
	                orderDetail.calcTotalPrice()));
	    }

//	    sb.append("+----------+------------------+----------------+-------------+---------------+\n");
	    sb.append("Total Charge: ").append(String.format("%-8.3fVNĐ", calcTotalCharge())).append("\n");

	    return sb.toString();
	}

	
	
}
