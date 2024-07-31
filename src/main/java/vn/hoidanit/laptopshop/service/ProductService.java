package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.Product;
import vn.hoidanit.laptopshop.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    

     public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product handleSaveUser(Product product){
        Product ntd = this.productRepository.save(product);
        System.out.println(ntd);
        return ntd;
    }
    public List<Product> getAllUsers(){
        return this.productRepository.findAll();
    }
}
