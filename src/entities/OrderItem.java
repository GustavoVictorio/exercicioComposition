package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private Product product;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuanity() {
		return quantity;
	}

	public void setQuanity(Integer quanity) {
		this.quantity = quanity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double subTotal() {
		return price * quantity;
	}

	public String toString() {
		return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: $"
				+ String.format("%.2f", subTotal());
	}

}
