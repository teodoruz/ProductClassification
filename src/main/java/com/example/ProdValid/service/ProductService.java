package com.example.ProdValid.service;

import com.example.ProdValid.entities.Product;
import com.example.ProdValid.entities.ProductType;
import com.example.ProdValid.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
    productRepository.save(product);
        return product;
    }

    public Product findProductById(Long Id) throws Exception {
       return productRepository.findById(Id).orElseThrow(() -> new Exception("produto não encontrado"));
    }

    public Product productClassification(Product product){ //classificacao de produtos bons
        if(product.getNumberStars() > 4 ){
            product.setClassfication(ProductType.BOM);
        }else if(product.getNumberStars() > 2 && product.getNumberStars() < 4){
            product.setClassfication(ProductType.MEDIO);
        }else if(product.getNumberStars() < 2){
            product.setClassfication(ProductType.RUIM);{
            }
        }
        return product;
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }

}
