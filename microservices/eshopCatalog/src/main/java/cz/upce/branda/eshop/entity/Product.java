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

    public String getName() {
        return name;
    }

    public String getSlugName() {
        return slugName;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlugName(String slugName) {
        this.slugName = slugName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}


