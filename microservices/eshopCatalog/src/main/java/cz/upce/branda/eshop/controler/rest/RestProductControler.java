package cz.upce.branda.eshop.controler.rest;

import cz.upce.branda.eshop.dao.ProductDao;
import cz.upce.branda.eshop.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/products")
@CrossOrigin
public class RestProductControler {

    @Autowired
    private ProductDao productDao;

    @GetMapping("/")
    public List<Product> productsList() {
        return productDao.findAll();
    }

    @GetMapping("{productId}")
    public Product getProductById(@PathVariable Integer productId) {
        return (productDao.findById(productId).isPresent()) ? productDao.findById(productId).get() : null;
    }
}
