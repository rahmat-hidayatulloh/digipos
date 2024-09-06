package id.co.digipos.service;

import id.co.digipos.common.base.BaseService;
import id.co.digipos.model.entity.Product;
import id.co.digipos.model.request.ProductRequest;
import id.co.digipos.model.response.ProductResponse;
import id.co.digipos.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements BaseService<ProductRequest, ProductResponse> {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductRequest execute(ProductRequest input) {
        List<Product> productList = productRepository.findAll();
        return null;
    }
}
