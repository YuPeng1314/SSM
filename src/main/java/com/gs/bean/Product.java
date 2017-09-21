package com.gs.bean;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/9/13.
 */
public class Product {

    private Integer id;
    private String title;
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
