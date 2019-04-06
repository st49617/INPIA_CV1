package cz.upce.branda.eshop.controler.rest;

import cz.upce.branda.eshop.dao.EshopOrderDao;
import cz.upce.branda.eshop.dao.OrderedProductDao;
import cz.upce.branda.eshop.dao.ProductDao;
import cz.upce.branda.eshop.entity.EshopOrder;
import cz.upce.branda.eshop.entity.OrderState;
import cz.upce.branda.eshop.entity.OrderedProduct;
import cz.upce.branda.eshop.entity.Product;
import cz.upce.branda.eshop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@CrossOrigin
public class ProductControler {

    @Autowired
    private ProductDao productDao;

    @GetMapping("/")
    public List<Product> productsList(Model model) {
        return productDao.findAll();
    }
}
