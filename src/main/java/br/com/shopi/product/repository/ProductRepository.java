package br.com.shopi.product.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Singleton;

import br.com.shopi.product.entity.Product;

@Singleton
public class ProductRepository {

	public ProductRepository() {}
	
	public Optional<Product> findById(Long id) {
		return Product.findByIdOptional(id);
	}
	
	public List<Product> findAllProducts() {
		return Product.listAll();
	}
	
	public void save(Product object) {
		object.persist();
	}
	
	public void update(Product object) {
		object.persist();
	}
	
	public void delete(Product object) {
		object.delete();
	}
}
