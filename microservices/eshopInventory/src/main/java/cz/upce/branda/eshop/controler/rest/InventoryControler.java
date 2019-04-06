package cz.upce.branda.eshop.controler.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class InventoryControler {

    @GetMapping("/inventory/{product-id}")
    public Integer productsDetail(Model model, @PathVariable("product-id") Integer id) {
        return id;
    }
}
