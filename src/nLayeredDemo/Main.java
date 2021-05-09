package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		// ToDo: Spring IoC ile çözülecek...
		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		
		Product product1 = new Product(1, 1, 50, "Elma", 12);
		Product product2 = new Product(2, 2, 20, "Armut", 6);
		
		productService.add(product1);
		productService.add(product2);
	}

}
