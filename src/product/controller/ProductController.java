package product.controller;

import java.util.ArrayList;

import product.model.Product;
import product.repository.ProductRepository;

public class ProductController implements ProductRepository{
	
	private ArrayList<Product> productCatalog = new ArrayList();
	int code = 0;

	@Override
	public void searchbyCode(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAll() {
		productCatalog.forEach(product -> product.show());
		
	}

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int number) {
		// TODO Auto-generated method stub
		
	}
	
	
}
