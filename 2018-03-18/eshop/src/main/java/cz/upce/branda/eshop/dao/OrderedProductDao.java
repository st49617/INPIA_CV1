package cz.upce.branda.eshop.dao;

import cz.upce.branda.eshop.entity.OrderedProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedProductDao extends JpaRepository<OrderedProduct, Integer> {
}
