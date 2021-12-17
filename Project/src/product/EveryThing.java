package product;

public class EveryThing {
	private String Category;
	private String Product;
	private int Price;
	private int Stock;
	
	public EveryThing(String Category, String Product, int price, int Stock) {
		this.Category = Category;
		this.Product = Product;
		this.Price = Price;
		this.Stock = Stock;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	@Override
	public String toString() {
		return "분류= " + Category + ", 삼품명= " + Product + ", 가격= " + Price + ", 재고= " + Stock
				+ " \n";
	}
	
	
}
