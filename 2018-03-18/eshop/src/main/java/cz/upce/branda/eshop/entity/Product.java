package cz.upce.branda.eshop.entity;

import cz.upce.branda.eshop.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Product extends BaseEntity {

    private String name;
    private String slugName;
    private Double price;
    private String description;
    private boolean status;
}
