package product.repository;

import product.model.Product;

public interface ProductRepository {
		//Product CRUD
		public void searchbyCode(int number);
		public void listAll();
		public void create(Product product);
		public void update(Product product);
		public void delete(int number);
}
