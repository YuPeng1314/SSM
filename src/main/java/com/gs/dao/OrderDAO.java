package com.gs.dao;

import com.gs.bean.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/14.
 */
@Repository
public interface OrderDAO {
    List<Order> listByUserId(Integer userId);

    List<Order> listByOrderIds(List<Integer> orderIds);
}
