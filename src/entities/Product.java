package entities;

public class Product {

	private String name;
	private Double prince;

	public Product(String name, Double prince) {
		this.name = name;
		this.prince = prince;
	}

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrince() {
		return prince;
	}

	public void setPrince(Double prince) {
		this.prince = prince;
	}

}
