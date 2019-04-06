package cz.upce.branda.eshop.dao;

import cz.upce.branda.eshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
