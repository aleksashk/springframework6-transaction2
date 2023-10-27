package by.flameksandr.services;

import by.flameksandr.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    /**
     * Transaction propagation
     * REQUIRED (default)
     * REQUIRES_NEW
     * MANDATORY
     * NEVER
     * NOT_SUPPORTED
     * NESTED
     *
     *
     */

    @Autowired
    private ProductRepository productRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addTenProducts() {
        for (int i = 0; i < 10; i++) {
            productRepository.addProduct("Product " + i);
        }
    }
}
