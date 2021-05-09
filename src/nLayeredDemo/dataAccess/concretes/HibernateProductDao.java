package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	public void add(Product product) {
		System.out.println("Hibernate ile eklendi " + product.getName());
	}

	public void update(Product product) {
	}

	public void delete(Product product) {
	}

	public Product get(int id) {
		return null;
	}

	public List<Product> getAll() {
		return null;
	}

}
