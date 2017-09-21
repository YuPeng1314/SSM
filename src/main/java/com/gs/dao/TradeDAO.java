package com.gs.dao;

import com.gs.bean.Trade;
import com.gs.common.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/19.
 */
@Repository
public interface TradeDAO {

    List<Trade> listByPager(Pager pager);
    Trade getById(int id);

    /**
     * 保存用户的道具购买记录
     * @param playerId
     */
    int saveTrade(int playerId);
}
