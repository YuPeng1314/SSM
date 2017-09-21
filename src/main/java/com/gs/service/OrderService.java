package com.gs.service;

import com.gs.bean.Order;
import java.util.List;

/**
 * Created by Administrator on 2017/9/13.
 */
public interface OrderService {

    List<Order> listByUserId(Integer userId);

    List<Order> listByOrderIds(List<Integer> orderIds);

}
