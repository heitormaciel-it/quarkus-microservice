package br.com.shopi.product.populators;

import javax.inject.Singleton;

import br.com.shopi.product.dto.ProductDTO;
import br.com.shopi.product.entity.Product;
import br.com.shopi.product.populate.Populator;

@Singleton
public class ProductPopulator implements Populator<ProductDTO, Product> {
	@Override
	public Product populate(ProductDTO input) {
		final Product product = new Product();
		product.setProductCode(input.getProductCode());
		product.setBarCode(input.getBarCode());
		product.setReferenceCode(input.getReferenceCode());
		product.setInternalCode(input.getInternalCode());
		product.setProductName(input.getProductName());
		product.setStatus(input.getStatus());
		product.setGroupCode(input.getGroupCode());
		product.setColorCode(input.getColorCode());
		product.setSizeCode(input.getSizeCode());
		product.setCostValue(input.getCostValue());
		product.setSaleValue(input.getSaleValue());
		product.setQuantity(input.getQuantity());
		product.setQuantitySale(input.getQuantitySale());
		product.setNcm(input.getNcm());
		product.setBusinessUnit(input.getBusinessUnit());
		product.setPathImage(input.getPathImage());
		
		return product;
	}
}
