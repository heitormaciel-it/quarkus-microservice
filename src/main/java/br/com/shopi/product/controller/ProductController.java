package br.com.shopi.product.controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.shopi.product.dto.ProductDTO;
import br.com.shopi.product.entity.Product;
import br.com.shopi.product.service.ProductService;

@Path("products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductController {
	
	@Inject
	private ProductService productService;
	
	public ProductController() {}

    @GET
    @Path("{id}")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
	public Product findById(@PathParam("id") Long id) {
		return productService.findById(id);
	}
	
    @GET
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
	public List<Product> findAllProducts() {
		return productService.findAllProducts();
	}
    
    @POST
    @Transactional
    public void save(ProductDTO productDTO) {
    	productService.save(productDTO);
    }
    
    @PUT
    @Path("{id}")
    @Transactional
    public void update(@PathParam("id") Long id, ProductDTO productDTO) {
    	productService.update(id, productDTO);
    }
    
    @DELETE
    @Path("{id}")
    @Transactional
    public void update(@PathParam("id") Long id) {
    	productService.delete(id);
    }
}
