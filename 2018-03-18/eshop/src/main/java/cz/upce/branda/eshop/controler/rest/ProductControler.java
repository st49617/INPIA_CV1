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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
public class ProductControler {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private EshopOrderDao eshopOrderDao;

    @Autowired
    private OrderedProductDao orderedProductDao;

    @Autowired
    private CartService cartService;

    @GetMapping("/")
    public String productsList(Model model) {
        model.addAttribute("products", productDao.findAll());
        return "product-list";
    }

    @GetMapping("/detail/{product-id}")
    public String productsDetail(Model model, @PathVariable("product-id") Integer id) {
        model.addAttribute("product", productDao.findById(id).get());
        return "product-detail";
    }

    @GetMapping("/cart")
    public String cart(Model model) {

        Map<Product, Integer> productList = cartService.getCartProducts();

        model.addAttribute("products", productList);
        return "cart";
    }

    @GetMapping("/cart/add/{product-id}")
    public String cartAdd(Model model, @PathVariable("product-id") Integer id) {
        Product product = productDao.findById(id).get();
        cartService.addToCart(product, 1);
        return cart(model);
    }

    @GetMapping("/cart/remove/{product-id}")
    public String cartRemove(Model model, @PathVariable("product-id") Integer id) {
        Product product = productDao.findById(id).get();
        cartService.removeProduct(product);
        return cart(model);
    }

    @GetMapping("/checkout")
    public String checkout(Model model) {

        Set<OrderedProduct> orderedProducts = new HashSet<>();
        EshopOrder eshopOrder = new EshopOrder();
        eshopOrder.setOrderState(OrderState.NEW);

        eshopOrderDao.save(eshopOrder);

        Map<Product, Integer> cartProductList = cartService.getCartProducts();

        for (Map.Entry<Product, Integer> entry : cartProductList.entrySet()) {
            OrderedProduct orderedProduct = new OrderedProduct();
            orderedProduct.setProduct(entry.getKey());
            orderedProduct.setAmount(entry.getValue());
            orderedProduct.setEshopOrder(eshopOrder);
            orderedProductDao.save(orderedProduct);
        }

        return "checkout";
    }


}
