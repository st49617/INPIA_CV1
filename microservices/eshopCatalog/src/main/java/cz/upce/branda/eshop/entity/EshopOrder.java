package cz.upce.branda.eshop.entity;

import cz.upce.branda.eshop.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class EshopOrder extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private OrderState orderState;

    @OneToMany(mappedBy = "id")
    private Set<OrderedProduct> products;

}
