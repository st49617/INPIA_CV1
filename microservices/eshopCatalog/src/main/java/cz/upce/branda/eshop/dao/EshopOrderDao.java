package cz.upce.branda.eshop.dao;

import cz.upce.branda.eshop.entity.EshopOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EshopOrderDao extends JpaRepository<EshopOrder, Integer>{
}
