package br.com.shopi.product.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.NotFoundException;

import br.com.shopi.product.dto.ProductDTO;
import br.com.shopi.product.entity.Product;
import br.com.shopi.product.populators.ProductPopulator;
import br.com.shopi.product.repository.ProductRepository;

@Singleton
public class ProductService {

	@Inject
	private ProductRepository productRepository;
	
	@Inject
	private ProductPopulator populator;
	
	public ProductService() {}
	
	public Product findById(Long id) {
		Optional<Product> product = productRepository.findById(id);
		
		if (!product.isPresent()) {
			throw new NotFoundException();
		}
		
		return product.get();
	}
	
	public List<Product> findAllProducts() {
		return productRepository.findAllProducts();
	}
	
	public void save(ProductDTO dto) {
		Product product = new Product();
		product = populator.populate(dto);
		productRepository.save(product);
	}
	
	public void update(Long id, ProductDTO dto) {
		Product product = this.findById(id);
		
		product.setProductCode(dto.getProductCode());
		product.setBarCode(dto.getBarCode());
		product.setReferenceCode(dto.getReferenceCode());
		product.setInternalCode(dto.getInternalCode());
		product.setProductName(dto.getProductName());
		product.setStatus(dto.getStatus());
		product.setGroupCode(dto.getGroupCode());
		product.setColorCode(dto.getColorCode());
		product.setSizeCode(dto.getSizeCode());
		product.setCostValue(dto.getCostValue());
		product.setSaleValue(dto.getSaleValue());
		product.setQuantity(dto.getQuantity());
		product.setQuantitySale(dto.getQuantitySale());
		product.setNcm(dto.getNcm());
		product.setBusinessUnit(dto.getBusinessUnit());
		product.setPathImage(dto.getPathImage());

		productRepository.update(product);
	}
	
	public void delete(Long id) {
		Product product = this.findById(id);
		productRepository.delete(product);
	}
}
