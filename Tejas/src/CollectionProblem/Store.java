package CollectionProblem;

import java.util.LinkedList;

public class Store {
	
	static LinkedList<Product> productList = new LinkedList<>();
	
	public void addProduct(Product p) {
		productList.add(p);
	}
	
	public void displayAllProducts() {
		for(Product p : productList) {
			System.out.println(p);
		}
	}
		
		public static Product searchProductById(int productId ) {
			for(int i = 0;i<productList.size();i++)
			{
				if(productList.get(i).productId==productId) 
				{
					return productList.get(i);
				}
			}
			return null;
		}
		
		// method to update stock quantity
		public static void updateStock(int productId, int quantity) {
			for(Product p:productList) {
				if(p.productId==productId) {
					p.quantityInStock=quantity;
				}
			}
		}
	
	public static void main(String[] args) {
		Product p1 = new Product( 101 , " iphone " , 80000 , 20 );
		Product p2 = new Product( 102 , " Samsung " , 30000 , 30 );
		Product p3 = new Product( 103 , " oneplus " , 45000 , 40 );
		Product p4 = new Product( 104 , " googlepixel " , 80000 ,50 );
		
		Store s = new Store();
		s.addProduct(p1);
		s.addProduct(p2);
		s.addProduct(p3);
		s.addProduct(p4);
		
		s.displayAllProducts();
		s.searchProductById(103);
		s.updateStock(104, 5);
		s.displayAllProducts();
	}

}
