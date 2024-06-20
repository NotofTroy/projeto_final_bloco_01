package product.controller;

import java.util.ArrayList;
import java.util.Optional;

import product.model.Product;
import product.repository.ProductRepository;

public class ProductController implements ProductRepository{
	
	private ArrayList<Product> productCatalog = new ArrayList<Product>();
	int code = 0;

	@Override
	public void searchbyCode(int code) {
		
		Optional<Product> product = Optional.ofNullable(searchCollection(code));
		
		if (product.isPresent()) {
			product.get().show();
		} else {
			System.out.println("\nNão foi localizado item com o código " + code + ".");
		}
	}

	@Override
	public void listAll() {
		productCatalog.forEach(product -> product.show());
	}

	@Override
	public void create(Product product) {
		productCatalog.add(product);
		System.out.println("\nO item " + product.getName() + " foi cadastrado com sucesso!");
	}

	@Override
	public void update(Product product) {
		
		Optional<Product> productOptional = Optional.ofNullable(searchCollection(product.getCode()));
		
		if (productOptional.isPresent()) {
			productCatalog.set(productCatalog.indexOf(productOptional.get()), product);
			
			System.out.println("\nO item de código " + product.getCode() + " foi atualizado com sucesso!");
			
		} else {
			System.out.println("\nNão foi localizado item com o código " + code + ".");
		}
		
	}

	@Override
	public void delete(int code) {
		Optional<Product> productOptional = Optional.ofNullable(searchCollection(code));
		
		if (productOptional.isPresent()) {
			productCatalog.remove(productCatalog.indexOf(productOptional.get()));
			
			System.out.println("\nO item de código " + code + " foi removido com sucesso!");
			
		} else {
			System.out.println("\nNão foi localizado item com o código " + code + ".");
		}
		
	}
	
	public int generateCode() {
		return ++ code;
	}
	
	public Product searchCollection (int code) {
		
		for(Product product : productCatalog) {
			if (product.getCode() == code) {
				return product;
			}
		}
		return null;
	}
	
}
