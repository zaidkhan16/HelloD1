package Day1;

public class Product_main {
  public static void main(String[]args) {
	  Product p1=new Product();
	  p1.setName("product 1");
	  p1.setprice(150);
	  p1.setQuantity(20);
	  p1.sell(5);
	  System.out.println(p1.getTotalSold());
	  
  }
}
class Product{
	private String name;
	private double price;
	private int quantity;
	
	static int totalsold;
	void setName(String name) {
		this.name=name;
	}
	void setprice(double price) {
		this.price=price;
	}
	void setQuantity(int q) {
		this.quantity=q;
	}
	void sell(int quantity) {
		this.quantity-=quantity;
		totalsold=totalsold+quantity;
	}
	static int getTotalSold() {
		return totalsold;
	}
	
}
