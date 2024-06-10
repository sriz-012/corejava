package javacollection;

public class BookList {
	String name;
	String price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookList [name=" + name + ", price=" + price + "]";
	}
	

	
}
