import java.util.ArrayList;

public class Sale {
	 private ArrayList<Product> products;
	   private double totalPrice;

	    public Sale(double totalPrice) {
	        this.products = new ArrayList<Product>();
	        this.totalPrice = totalPrice;
	    }

	    public  ArrayList<Product>  getProducts() {

	        return new ArrayList<>(this.products);
	    }

	    public void setProducts(ArrayList<Product> products) {

	        this.products = products;
	    }

	    public double getTotalPrice() {

	        return totalPrice;
	    }

	    public void setTotalPrice(double totalPrice) {

	        this.totalPrice = totalPrice;
	    }

	    void calculateTotal() throws SaleEmptyException {

	        try{
	            for(int i =0; i < 4; i++){
	                //System.out.println(products.get(i));
	            totalPrice += products.get(i).getPrice(); }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            throw new SaleEmptyException("The store is empty");
	        }
	    }
}
