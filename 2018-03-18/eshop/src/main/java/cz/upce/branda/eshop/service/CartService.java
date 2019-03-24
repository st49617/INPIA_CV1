package cz.upce.branda.eshop.service;

import cz.upce.branda.eshop.entity.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class CartService {

    Map<Product, Integer> cartProducts = new HashMap<>();

    public void addToCart(Product product, Integer count) {
        Integer actualCount = cartProducts.get(product);
        cartProducts.put(product, (actualCount == null) ? count : actualCount + count);
    }

    public void removeProduct(Product productId) {
        cartProducts.remove(productId);
    }

    public void checkOut() {

    }

    public Map<Product, Integer> getCartProducts() {
        return Collections.unmodifiableMap(cartProducts);
    }

}
