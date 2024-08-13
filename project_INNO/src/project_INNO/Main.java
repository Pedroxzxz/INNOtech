package project_INNO;

import models.Product;
import models.ProductCategory;

public class Main {

	public static void main(String[] args) {
		
//		Locale.setDefault(Locale.US);
		
		Product product = new Product(1, "Computador", 2000.00, new ProductCategory (1, "categoria"));
		
		
		System.out.println(product.getProductCategory().getName());
	}

}
