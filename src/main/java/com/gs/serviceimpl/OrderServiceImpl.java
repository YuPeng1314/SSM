package com.gs.serviceimpl;

import com.gs.bean.Order;
import com.gs.dao.OrderDAO;
import com.gs.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/9/14.
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Resource
    private OrderDAO orderDAO;

    public List<Order> listByUserId(Integer userId) {

        return orderDAO.listByUserId(userId);
    }

    public List<Order> listByOrderIds(List<Integer> orderIds) {
        return orderDAO.listByOrderIds(orderIds);
    }

}
