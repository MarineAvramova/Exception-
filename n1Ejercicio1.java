import java.util.ArrayList;

public class n1Ejercicio1 {

	public static void main(String[] args){
		//Checked Exeption(Compile time exeption) =
        //Unchecked(Runtime exeption) =

        Product clothes = new Product("Dress", 99.99);
        Product shoes = new Product("High heels", 145);
        ArrayList<Product> saleStock = new ArrayList<>();
        saleStock.add(clothes);
        saleStock.add(shoes);
        Sale sale1 = new Sale(00.00);
        sale1.setProducts(saleStock);
        try {
			sale1.calculateTotal();
		} catch (SaleEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //sale1.getTotalPrice();
	}

}
