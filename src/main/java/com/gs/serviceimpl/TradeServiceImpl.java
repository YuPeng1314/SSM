package com.gs.service.impl;

import com.gs.bean.Trade;
import com.gs.bean.TradeItem;
import com.gs.common.Pager;
import com.gs.dao.TradeDAO;
import com.gs.dao.TradeItemDAO;
import com.gs.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeDAO tradeDAO;
    @Autowired
    private TradeItemDAO tradeItemDAO;

    public List<Trade> listByPager(Pager pager) {
        return tradeDAO.listByPager(pager);
    }

    public Trade getById(int id) {
        return tradeDAO.getById(id);
    }

    @Transactional(rollbackFor = java.lang.Exception.class)
    public void saveTrade(int playerId, int[] propIds) {
        int tradeId = tradeDAO.saveTrade(playerId);
        tradeItemDAO.saveTradeItems(tradeId, propIds);
    }
}
