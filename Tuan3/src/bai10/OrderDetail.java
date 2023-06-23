package bai10;

public class OrderDetail {
	private int quantity;
	private Product product;
	
	
	public OrderDetail() {

	}

	public OrderDetail(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}
	
	public double calcTotalPrice() {
		
		return quantity * product.getPrice();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	
}
