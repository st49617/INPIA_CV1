package cz.upce.branda.eshop.entity;

import cz.upce.branda.eshop.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
@Data
public class OrderedProduct extends BaseEntity {

    @ManyToOne
    private Product product;

    @ManyToOne
    private EshopOrder eshopOrder;

    @Column
    private Integer amount;

}
