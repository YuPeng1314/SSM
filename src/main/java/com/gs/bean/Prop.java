package com.gs.bean;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/9/18.
 */
public class Prop {

    private Integer id;
    private String name;
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
